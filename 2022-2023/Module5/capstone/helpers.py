def get_country_by_all(csv_file, country, year, type_of_pollution):
    for i in csv_file:
        if i[0] == country and i[1] == year and i[3] == type_of_pollution:
            return float(i[2])
        
    return 0