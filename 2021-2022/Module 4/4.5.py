#Oscar Gaske, 4.5

import random

dialogue_list = ['Hello', 'I agree', 'Let\'s go', 'I\'ll take it!', 'No thank you']

def three_integers(x, y, z):
  #Y and Z need to be in order of least to greatest
  if x in range(y, z):
    print(f"{x} is within the range of {y} and {z}")
  else:
    print(f"{x} is not within the range of {y} and {z}")

def total_money(savings, snow_shoveling, money_spent):
  final_variable = (savings+snow_shoveling)-money_spent
  print(f"Your networth is {final_variable}")

def getRandomDialog():
  return dialogue_list[random.randint(0,4)]

global_x = int(input("Enter a number (For function 1) "))
global_y = int(input("Enter another number (For function 1) "))
global_z = int(input("Enter a final number (For function 1) "))

three_integers(global_x, global_y, global_z)

global_a = int(input("Enter a number (For function 2) "))
global_b = int(input("Enter another number (For function 2) "))
global_c = int(input("Enter a final number (For function 2) "))

total_money(global_a, global_b, global_c)

for i in range(1,4):
  input("Say something to talk to the npc! ")
  print(getRandomDialog())
