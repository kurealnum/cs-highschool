import requests, random, time

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

name = input("Hello there! What's your name? ")
print(f"Nice to meet you, {name}! Today we're going to explore some information about pollution.")
time.sleep(2)
print("\nWe're going to be looking at a CSV file, a dataset if you will.\n ")
time.sleep(2)
print(f"This dataset is provided by the UN ({all_countries['links']['united_nations']}),\nor more specifically, UNdata ({all_countries['links']['undata']})\n")
time.sleep(2)
print(f"Here's a direct link to the dataset: {all_countries['links']['kaggle']}\n")
time.sleep(2)

print("Alright then, let's take a look at the most polluting country first, and then the least polluting country!\n")
time.sleep(2)
print("Actually... let's look at what kind of emissions we can choose from...\n")
for pollutant in types_of_emissions["types"]:
    time.sleep(0.5)
    print(pollutant)

pollution_type = input("\nOh! I should probably ask you... What type of pollution should we look at... C02 or Methane? \nI would've given you some more options, but humans tend to be indecisive: \n")
time.sleep(2)
print(f"Alright... awesome! Also, here's what years the dataset supports. Choose one of them please! Years: {years_supported['years_supported']}\n")
year = input("Choose a year (ex. 2012, 1993): ")

if pollution_type.lower() == "methane":
    highest_polluting_country = requests.get(f"{scheme_and_host_address}/api/methane_ch4_emissions_without_land_use_land_use_change_and_forestry_lulucf_in_kilotonne_co2_equivalent/{year}")

else: 
    highest_polluting_country = requests.get(f"{scheme_and_host_address}/api/h_l_polluting_countries/lowest/carbon_dioxide_co2_emissions_without_land_use_land_use_change_and_forestry_lulucf_in_kilotonne_co2_equivalent/{year}")