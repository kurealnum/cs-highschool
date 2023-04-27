#imports
import csv, json
from flask import Flask, jsonify
from flask_caching import Cache
from helpers import get_country_by_all

#some basic info to give flask
app = Flask(__name__, template_folder='templates', static_folder='static')
app.config["SESSION_PERMANENT"] = False

#cache setup
cache = Cache(app, config={'CACHE_TYPE': 'simple'})

#get the csv_file
with open('greenhouse_gas_inventory_data_data.csv', mode='r') as data:
    #word to the wise; don't print this out on replit
    data = csv.reader(data)

    #will be a 2d array, just a massive one
    csv_file = []
    for row in data:
        csv_file.append(row)

    csv_file = sorted(csv_file, key=lambda x: x[2])


'''
Docs for route info is in the README!
This route is kind of a special case, 
it's the shortened README for the API
'''
@app.route("/", methods=['GET'])
@cache.cached(timeout=60)
def home_and_help():
    pass


@app.route("/types_of_emissions", methods=['GET'])
@cache.cached(timeout=60)
def types_of_emissions():
    #jsonify this
    return_statement = []

    #start at index 1 so we don't pick up the headers
    for i in csv_file[1:]:
        return_statement.append(i[3])
    
    '''
    little bit confusing, but we're just remove any duplicates, putting
    the list into a dictionary, and jsonifying said dictionary
    I'll probably use this again a lot, so if you see another hot mess, it's probably this
    '''
    return_statement = jsonify(json.dumps({"types": list(set(return_statement))}))

    return return_statement


@app.route("/pollution_info/<string:sort_method>/<string:type_of_pollution>/<string:year>", methods=["GET"])
@cache.cached(timeout=60)
def countries(sort_method, type_of_pollution, year):
    #deciding which sort method to use
    if str(sort_method) == "asc":
        sort_method = False
    elif str(sort_method) == "desc":
        sort_method = True

    return_statement = {}

    #get all of the data that we need to sort it, no more and no less
    for i in csv_file[1:]:
        if year == i[1] and type_of_pollution == i[3]:
            return_statement.update({i[0]:float(i[2])})

    #sort the dict by values
    return_statement = sorted(return_statement.items(), key=lambda x: x[1], reverse=sort_method)
    return_statement = dict(return_statement)
    
    #did i struggle trying to find out why this was sorting my keys for 6 hours? yes, yes i did
    return_statement = jsonify(json.dumps({"countries": return_statement,
                                    "type_of_pollution": type_of_pollution}, sort_keys=False))
   
    return return_statement


@app.route("/all_countries", methods=['GET'])
@cache.cached(timeout=60)
def all_countries():
    return_statement = []

    #start at index 1 so we don't pick up the headers
    for i in csv_file[1:]:
        return_statement.append(i[0])
    
    return_statement = jsonify(json.dumps({"all_countries": list(set(return_statement))}))

    return return_statement


@app.route("/years_supported", methods=['GET'])
@cache.cached(timeout=60)
def years_supported():
    return jsonify(json.dumps({"years": "1990-2014"}))
        

@app.route("/h_l_polluting_countries/<string:h_or_l>/<string:type_of_pollution>/<string:year>", methods=['GET'])
@cache.cached(timeout=60)
def h_l_polluting_countries(h_or_l, type_of_pollution, year):
    return_statement = {}

    #put countries that match users request into a dict, country as key
    for i in csv_file[1:]:
        if year == i[1] and type_of_pollution == i[3]:
            return_statement.update({i[0]:float(i[2])})

    #if the user requested the highest, return the highest polluter for that year, along with how much pollution
    if h_or_l == "highest":
        dict_max = {max(return_statement, key=return_statement.get):max(return_statement.values())}
        return jsonify(json.dumps(dict_max))
    #do the same if the user selected lower
    else:
        dict_min = {min(return_statement, key=return_statement.get):min(return_statement.values())}
        return jsonify(json.dumps(dict_min))


@app.route("/difference_in_pollution/<string:country>/<string:type_of_pollution>/<string:years>", methods=['GET'])
@cache.cached(timeout=60)
def difference_in_pollution(country, type_of_pollution, years):
    years = years.rsplit("-")

    #oldest is the oldest value, newest is the newest value
    oldest = get_country_by_all(csv_file, country, years[0], type_of_pollution)
    newest = get_country_by_all(csv_file, country, years[1], type_of_pollution)

    return jsonify(json.dumps({country: newest-oldest}))


