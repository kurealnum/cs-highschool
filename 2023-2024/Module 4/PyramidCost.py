###################################################################
# Oscar Gaske
# PyramidCost
# Calculates the total surface area of the triangle, and the total cost of paint for the calculated surface area, where paint is $1.32 per square inch
# 10/26/23
###################################################################
#imports
import math

#getting user inputs
# pyramid_base_length = float(input("Please input the base length of the pyramid: "))
# pyramid_height = float(input("Please input the height of the pyramid: "))
pyramid_base_length = 100
pyramid_height = 200

# calculating area and slant length
pyramid_base_area = pyramid_base_length**2
pyramid_slant_length = math.sqrt(((1/2 * pyramid_base_length) ** 2) + pyramid_height ** 2)

# calculating the total surface area, rounded to the 2nd decimal place
pyramid_surface_area = round(pyramid_base_area + (0.5 * (4 * pyramid_base_length * pyramid_slant_length)), 2)

# paint cost per square foot
paint_cost = 1.32

#total cost, rounded to the 2nd decimal place
total_cost = round(pyramid_surface_area * 1.32, 2)

#printing results
print(f'The surface area of the triangle is {pyramid_surface_area} square inches')
print(f'It will cost {total_cost} dollars to paint the pyramid')