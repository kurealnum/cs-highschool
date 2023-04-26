'''
Oscar - Write a story where the player has to find an item to progress through the story 
(like a key that unlocks a door in another room leading to a new scene, for example)]

1st ending: 1, y
2nd ending: 2, n
3rd ending, 3
'''

#Imports
import time

#This variable decides 2 out of 3 of the endings
item_counter_var = int(1)




def first_three_door(final: bool):

    #Declaring item_counter to be global
    global item_counter_var

    #Main nested if statement, where I try to use 1 function to control multiple story lines
    if final == True:
        print("You wake up in the same place you just were.\nBut this time you have a key in your hand, and there's a fourth door")
        time.sleep(3)
        print("You unlock and open the door, and your story ends.")

    elif final == False:
        door_choice_one = int(input("You walk into a room with three doors.\nWhich one do you choose (1, 2, or 3): "))

        #Choosing 1 or 2 takes you to the same place, which is a flight of stairs, and 3 takes you to 1 out of the 3 possible endings

        if door_choice_one == 1 or door_choice_one == 2:
            item_counter_var += 1
            stairs = input(("You walk into the room, and there's a flight of stairs.\nGo down them? (y/n) "))
            
            if stairs.lower() == "y":
                print("Oh no! You tripped and fell down... that kinda hurt")
                print("You see a slide to your left, and you think that that would've been a much better option.")
                item_counter_var -= 1
                return False
            
            elif stairs.lower() == "n":
                print("That's probably a good choice... ")
                print("You keep walking past the staircase, but end up slipping down a slide that leads you to the bottom of the staircase")
                print("You were going to get there either way apparently")
                return False
                    
        elif door_choice_one == 3:
            print("You fall into a seemingly endless void, and you̴͇̥̤̙̬̅̍̎ think you ̷͎̗̗̋̿̒̂f̶͇̱̱̻̱̩͌ȍ̵̞͌̿̽r̷͍̉͋g̸̢̘̻̹͛̎͂e̵̼͓͉̎́̏t̸̨̹̯͋͒͂̈́ ̶̖͚̖̜̅͘ͅe̵̩͖͐̋v̴̦̬̥̙̩͊͜ę̴̻͂͋́̈́ͅr̵̜̳̘͑̊̏͠y̸̡̦̖̪̬̖̓̋́ţ̸͎̞̫̓̓h̴̨͕͂͠i̷̟̩̜̐͛͠n̶̢̼͈̖̎̓́̏g̵̯̦̕ͅ")
            time.sleep(3)
            return True




def final_room(fall_or_not: int):
    #Remember the item_counter from before? This is where it decides what happens to you.
    print("You think you see a key, but it's on some weird platform.\nYou can't reach it... ")
    time.sleep(3)
    if fall_or_not == 2:
        print("You were able to jump and get the key, and from there, you go back up the stairs...\nA fourth door has appeared. You walk through, and your story ends.")
    else:
        print("You jump to the platform, but you lose your footing, and fall into the abyss below.")


deciding_loc = first_three_door(False)

#Deciding which path you take depending on what your choice in doors was
if deciding_loc == True:
    first_three_door(True)

elif deciding_loc == False:
    final_room(item_counter_var)
        
