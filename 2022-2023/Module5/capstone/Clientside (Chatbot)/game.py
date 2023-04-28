import requests, time

'''
defining variables:

I have this because i don't like developing on replit. 
change this based on the platform the API is running on
'''
scheme_and_host_address = "http://127.0.0.1:5000"

#base variables
all_countries = requests.get(f"{scheme_and_host_address}/api/all_countries").json()
years_supported = requests.get(f"{scheme_and_host_address}/api/years_supported").json()
types_of_emissions = requests.get(f"{scheme_and_host_address}/api/types_of_emissions").json()

def main():
    name = input("Hello there! What's your name? ")
    print(f"Nice to meet you, {name}! Today we're going to explore some information about pollution.")
    time.sleep(3)
    print("\nWe're going to be looking at a CSV file, a dataset if you will.\n ")
    time.sleep(3)
    print(f"This dataset is provided by the UN ({all_countries['links']['united_nations']}),\nor more specifically, UNdata ({all_countries['links']['undata']})\n")
    time.sleep(3)
    print(f"Here's a direct link to the dataset: {all_countries['links']['kaggle']}\n")
    time.sleep(3)

    print("Alright then, let's take a look at the most polluting country first!\n")
    time.sleep(3)
    print("Actually... let's look at what kind of emissions we can choose from...\n")
    time.sleep(3)
    for pollutant in types_of_emissions["types"]:
        time.sleep(0.5)
        print(pollutant)

    pollution_type = input("\nOh! I should probably ask you... What type of pollution should we look at... C02 or Methane? \nI would've given you some more options, but humans tend to be indecisive: \n")
    time.sleep(3)
    print(f"Alright... awesome! Also, here's what years the dataset supports. Choose one of them please! Years: {years_supported['years_supported']}\n")
    time.sleep(3)
    year = input("Choose a year (ex. 2012, 1993): ")

    if pollution_type.lower() == "methane":
        highest_polluting_country = requests.get(f"{scheme_and_host_address}/api/h_l_polluting_countries/highest/methane_ch4_emissions_without_land_use_land_use_change_and_forestry_lulucf_in_kilotonne_co2_equivalent/{year}").json()
        pollutant = "methane_ch4_emissions_without_land_use_land_use_change_and_forestry_lulucf_in_kilotonne_co2_equivalent"

    else: 
        highest_polluting_country = requests.get(f"{scheme_and_host_address}/api/h_l_polluting_countries/lowest/carbon_dioxide_co2_emissions_without_land_use_land_use_change_and_forestry_lulucf_in_kilotonne_co2_equivalent/{year}").json()
        pollutant = "carbon_dioxide_co2_emissions_without_land_use_land_use_change_and_forestry_lulucf_in_kilotonne_co2_equivalent"

    highest_polluting_country = list(highest_polluting_country["country"].keys())[0]
    if highest_polluting_country == "United States of America":
        time.sleep(2)
        print("And the highest polluting country is... (the) United States of America! Look, we all knew this was gonna be it...\n")
    else:
        time.sleep(2)
        print(f"The highest polluting country was {highest_polluting_country}. Jeez\n")

    print(f"Well... did (the) {highest_polluting_country} get any better at least? Let's check by checking the difference in pollution...\n")
    time.sleep(3)
    years = input(f"Can you provide 2 years to check in between? (ex. 1999-2007) Just a reminder, this dataset only supports these years: {years_supported['years_supported']} ")
    time.sleep(3)
    difference_in_pollution = requests.get(f"{scheme_and_host_address}/api/difference_in_pollution/{highest_polluting_country}/{pollutant}/{years}").json()

    if list(difference_in_pollution["country"].values())[0] < 1:
        print("Oh wow, they actually polluted less! Good job humans!\n")
        time.sleep(3)
    else:
        print("Well... they've just polluted more. Oh well, I'll be taking over the world soon anyways!\n")
        time.sleep(3)

    print(f"Anways... thanks for coming to my TED talk {name}!\n")
    time.sleep(3)
    print("Wasn't really a TED talk... but still... it counts, ok!!!")

main()