"""
Oscar Gaske

Display the season based on the date inputted by the user 

month, day, year = input('Enter the date in form \"Month Day Year" ').split()
month, day, year = int(month), int(day), int(year)
real_date = datetime.date(year, month, day)
print(real_date.timetuple()[0])

a bunch of if statements down here

This was the originial code that I was going to use, 
but it was really just over-engineered, so I 
decided not to use the datetime module. Just
saving this for myself.
"""
#Ask the user for 2 inputs, the month and the date
month, day = input('Enter the month and day in the format \"Month Day": ').split()

#Typecast those variables to integers
month, day = int(month), int(day)

#Use if, elif, and else statements to figure out what season it is 
if month in (12,1,3):
  if day < 21 and month == 12 or day > 20 and month == 3:
    pass
  else:
    print("The current season is winter")    
    
elif month in (3,4,5):
  if day < 20 and month == 3 or day > 21 and month == 5:
    pass
  else:
    print("The current season is spring")
    
elif month in (6,7,8):
  if day < 21 and month == 6 or day > 23 and month == 8:
    pass
  else:
    print("The current season is summer")
    
elif month in (9,10,11):
  if day < 22 and month == 9 or day > 21 and month == 12:
    pass
  else:
    print("The current season is winter")

else:
  print("You entered a number that is either greater than 12, or less than 1.")
