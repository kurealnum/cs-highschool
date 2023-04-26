#imports
import csv
from flask import Flask, jsonify

#some basic info to give flask
app = Flask(__name__, template_folder='templates', static_folder='static')
app.config["SESSION_PERMANENT"] = False

with open('greenhouse_gas_inventory_data_data.csv', mode='r') as data:
    #word to the wise; don't print this out on replit
    data = csv.reader(data)

    #will be a 2d array, just a massive one
    csv_file = []
    for row in data:
        csv_file.append(row)


@app.route("/types_of_emissions", methods=['GET'])
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
    return_statement = jsonify({"types": list(set(return_statement))})

    return return_statement

    
