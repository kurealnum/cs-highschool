#getting a specific country by listed parameters 
def get_country_by_all(csv_file, country, year, type_of_pollution):
    for i in csv_file:
        if i[0] == country and i[1] == year and i[3] == type_of_pollution:
            return float(i[2])
        
    return 0


#get all of the data that we need to sort it, no more and no less
def country_pollution_level(csv_file, type_of_pollution, year):
    return_statement = {}

    for i in csv_file[1:]:
        if year == i[1] and type_of_pollution == i[3]:
            return_statement.update({i[0]:float(i[2])})

    return return_statement