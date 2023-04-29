#REST API, Oscar Gaske

#imports
import csv
from flask import Flask, render_template, jsonify
from flask_caching import Cache
from helpers import get_country_by_all, country_pollution_level

#some basic info to give flask
app = Flask(__name__, template_folder='templates', static_folder='static')
app.config["SESSION_PERMANENT"] = False
app.config['JSON_SORT_KEYS'] = False

#cache setup
cache = Cache(app, config={'CACHE_TYPE': 'simple'})

#links to comply with HATEOAS (Hypermedia as the Engine of Application State)
links = {"links": {"kaggle": "https://www.kaggle.com/datasets/unitednations/international-greenhouse-gas-emissions",
                   "united_nations": "https://www.un.org/en/",
                   "undata": "https://data.un.org"}}

#get the csv_file
with open('greenhouse_gas_inventory_data_data.csv', mode='r') as data:
    #word to the wise; don't print this out on replit
    data = csv.reader(data)
    #will be a 2d array, just a massive one
    csv_file = []
    #ditching the headers
    headers = next(data)
    for row in data:
        csv_file.append(row)

    csv_file = sorted(csv_file, key=lambda x: x[2])


'''
Docs for route info is in the README! (and index, technically)
This route is kind of a special case, it's the shortened README for the API

For grading purposes, I understand that I'm supposed have an endpoint for the
entire column, however with a dataset like this, I don't think that's very useful,
or a good idea. So instead, I have endpoints like years_supported, which returns 
the years supported, but not the *entire* column.

All of the required endpoints:
'''
 

@app.route("/", methods=['GET'])
@cache.cached(timeout=60)
def index():
    return render_template('index.html')


@app.route("/api/all_countries", methods=['GET'])
@cache.cached(timeout=60)
def all_countries():
    #jsonify this
    return_statement = []

    #start at index 1 so we don't pick up the headers
    for i in csv_file:
        return_statement.append(i[0])
    
    '''
    little bit confusing, but we're just remove any duplicates, putting
    the list into a dictionary, and jsonifying said dictionary
    I'll probably use this again a lot, so if you see another hot mess, it's probably this
    '''

    return_statement = {"all_countries": list(set(return_statement))}
    return_statement.update(links)
    return_statement = jsonify(return_statement)

    return return_statement


@app.route("/api/avg_of_pollution/<string:type_of_pollution>/<string:year>", methods=['GET'])
@cache.cached(timeout=60)
def avg_of_pollution(type_of_pollution, year):
    return_statement = country_pollution_level(csv_file, type_of_pollution, year)
    return_statement = {"avg_of_pollution": sum(return_statement.values())/len(return_statement.values())}
    return_statement.update(links)

    #returns the average pollution                  
    return jsonify(return_statement)


@app.route("/api/years_supported", methods=['GET'])
@cache.cached(timeout=60)
def years_supported():
    return_statement = {"years_supported": "1990-2014"}
    return_statement.update(links)

    return jsonify(return_statement)


@app.route("/api/types_of_emissions", methods=['GET'])
@cache.cached(timeout=60)
def types_of_emissions():
    return_statement = []

    #start at index 1 so we don't pick up the headers
    for i in csv_file[1:]:
        return_statement.append(i[3])
    
    return_statement = {"types": list(set(return_statement))}
    return_statement.update(links)

    return jsonify(return_statement)


'''
End of required endpoints
Not required endpoints:
'''


@app.route("/api/pollution_info/<string:sort_method>/<string:type_of_pollution>/<string:year>", methods=["GET"])
@cache.cached(timeout=60)
def countries(sort_method, type_of_pollution, year):
    #deciding which sort method to use
    if str(sort_method) == "asc":
        sort_method = False
    elif str(sort_method) == "desc":
        sort_method = True

    return_statement = country_pollution_level(csv_file, type_of_pollution, year)

    #sort the dict by values
    return_statement = sorted(return_statement.items(), key=lambda x: x[1], reverse=sort_method)
    return_statement = dict(return_statement)
    
    #did i struggle trying to find out why this was sorting my keys for 6 hours? yes, yes i did
    return_statement = {"countries": return_statement, "type_of_pollution": type_of_pollution}
    return_statement.update(links)

    return jsonify(return_statement)
        

@app.route("/api/h_l_polluting_countries/<string:h_or_l>/<string:type_of_pollution>/<string:year>", methods=['GET'])
@cache.cached(timeout=60)
def h_l_polluting_countries(h_or_l, type_of_pollution, year):
    
    return_statement = country_pollution_level(csv_file, type_of_pollution, year)

    #if the user requested the highest, return the highest polluter for that year, along with how much pollution
    if h_or_l == "highest":
        dict_max = {"country": {max(return_statement, key=return_statement.get):max(return_statement.values())}}
        dict_max.update(links)

        return jsonify(dict_max)
    #do the same if the user selected lower
    else:
        dict_min = {"country": {min(return_statement, key=return_statement.get):min(return_statement.values())}}
        dict_min.update(links)

        return jsonify(dict_min)


@app.route("/api/difference_in_pollution/<string:country>/<string:type_of_pollution>/<string:year>", methods=['GET'])
@cache.cached(timeout=60)
def difference_in_pollution(country, type_of_pollution, year):
    years = year.rsplit("-")

    #oldest is the oldest value, newest is the newest value
    oldest = get_country_by_all(csv_file, country, years[0], type_of_pollution)
    newest = get_country_by_all(csv_file, country, years[1], type_of_pollution)

    return_statement = {"country":{country: newest-oldest}}
    return_statement.update(links)

    return jsonify(return_statement)


'''
End of non required endpoints
hello there :>
'''


