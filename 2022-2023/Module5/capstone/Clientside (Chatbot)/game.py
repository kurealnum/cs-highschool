import requests

print(requests.get('http://127.0.0.1:5000/countries/desc/carbon_dioxide_co2_emissions_without_land_use_land_use_change_and_forestry_lulucf_in_kilotonne_co2_equivalent/2009').json())