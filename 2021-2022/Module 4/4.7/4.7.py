import random
import time

def displayIntro():
 """Prints the game introduction"""
 intro = open("introdialogue.txt")
 intro_dialogue = intro.read()
 print(intro_dialogue)

def chooseVillage():
 """Asks user to choose a village, 1 or 2. Returns the result"""
 village = ''
 while village != '1' and village != '2':
   village = input('Which village will you go to? (1 or 2)\n')
 return village

def checkVillage(chosenVillage):
 """Checks whether chosenVillage is the friendly or hostile village, printing the resulting game dialogue"""

 print('You approach the village...')
 time.sleep(2)
 print('The air feels quiet and tense...')
 time.sleep(2)
 print('Suddenly you are surrounded by aliens!')
 time.sleep(2)

 friendlyVillage = random.randint(1, 2)
 if chosenVillage == str(friendlyVillage):
   print('They offer to help you find your way to the ore!')
 else:
   survival = random.randint(1,2)
   run_or_fight = input("The aliens are going to attack! Do you run or fight!")
   if run_or_fight == "run" and survival == 1:
     print("They still attacked you and your crew. You were defeated.")
     return "loss"
     win_loss_list.append("loss")
   elif run_or_fight == "run" and survival == 2:
     print("You barely escaped with your life...")
     return "draw"
     win_loss_list.append("draw")
   elif run_or_fight == "fight" and survival == 1:
     print('They attack you and your crew! You were defeated.')
     return "loss"
     win_loss_list.append("loss")
   elif run_or_fight == "fight" and survival == 2:
     print("You defeated all of the aliens!")
     return "win"
     win_loss_list.append("win")

#This is the main "body" of our program where we can call our functions from.
win_loss_list = []
playAgain = 'yes'
while playAgain == 'yes' or playAgain == 'y':
 playAgain = input('Do you want to play again? (yes or no)\n')
 if playAgain == "no" or "n":
   break
 else:
   continue
 print(win_loss_list)
 displayIntro()
 villageNumber = chooseVillage()
 checkVillage(villageNumber)

