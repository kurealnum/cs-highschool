import requests, os

'''
defining variables:

I have this because i don't like developing on replit. 
change this based on the platform the API is running on
'''
scheme_and_host_address = "http://127.0.0.1:5000"

all_countries = requests.get(f"{scheme_and_host_address}/api/all_countries").json()
years_supported = requests.get(f"{scheme_and_host_address}/api/years_supported").json()
types_of_emissions = requests.get(f"{scheme_and_host_address}/api/types_of_emissions").json()


