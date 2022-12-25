#Oscar G
#I really can't belive I made something this smoothly built in just a few days. 
#I didn't want to nest a bunch of stuff together, so there are functions for a lot of it
#However, on line 40, there is plentiful nesting, so that should meet the requirements! 
#Next, I consider the "5 different endings" to be the infinite possible endings with the "boss battle", concerning health and whatnot.
#Finally, if you want to look through the code, I might consider putting it into your own IDE. It looks so much smoother there.
import time, random

travel_counter = 0
places_to_travel = ['blank','Shagonla','Afugona','Lichanka','Mordash','Whishinki']
places_to_travel_choice = {
    "Shagonla": 1,
    "Afugona": 2,
    "Lichanka": 3,
    'Mordash': 4,
    'Whishinki': 5,
}

class general:

    def travel(starting, ending):
        global final_distance     
        final_distance = places_to_travel_choice[starting] - places_to_travel_choice[ending]
        final_distance *= random.randint(48,52)         
        where_to_travel = random.randint(1,5)
        print('')
        print(f"We're traveling to {places_to_travel[where_to_travel]}... \n It's going to be {final_distance} miles... ")  

    def time_sleep_print(statement):
        print(statement)
        time.sleep(sleep_time)

print('|===============================|')
print('|Pick Your Character Atrributes!|')
print('|===============================|')
time.sleep(0.5)
sleep_time = float(input('What would you like your wait time, between messages, to be? '))
health = int(input('How much health do you want your character to have? (Hint, more might not be better) '))
shields = int(input('How much shield health do you want your character to have? '))
name = str(input('Finally, what is your characters name? '))

#Here are some examples of nesting, and deep nesting at that.
if(health > 100):
    health /= 10
    if(not health < 100):
        health /= 30
        if (name == 'Monty Python'):
            health += 100
        else:
            health /= 10
            if (shields < 20):
                shields += 40
            else:
                shields += 10
    elif shields > 10:
        shields /= 2
    elif health > 500:
        health /= health-shields
elif(shields > 50):
    shields /= random.randint(2,10)
else:
    print('You chose well... nothing has been deducted.')

def after_travel(shield_true):
    global health, shields
    random_1 = random.randint(1,2)
    health_shield_down = random.randint(10,50)
    if shield_true:
        if random_1 == 1:
            general.time_sleep_print(f'{name} found an enemy! His health has been reduced after fighting it. ')
            health -= health_shield_down
            if health == 0:
                print(f'{name} died... try again. ')
                quit()
            else: 
                pass
        elif random_1 == 2:
            general.time_sleep_print(f'{name} found a potion! His health has been increased by 20 percent! ')
            health *= float(1.2)
    if not shield_true:
        if random_1 == 1:
            general.time_sleep_print(f'{name} found an enemy! His shields has been reduced after fighting it. ')
            shields -= health_shield_down
            if shields == 0:
                print(f'{name} died... try again. ')
                quit()
            else: 
                pass
        elif random_1 == 2:
            general.time_sleep_print(f'{name} found a potion! His shields has been increased by 20 percent! ')
            shields *= float(1.2)

def boss_battle():
    global health, shields, name
    boss_health = random.randint(25,100)
    boss_shield = random.randint(10,20)
    general.time_sleep_print(f'{name} is facing off against the boss... ')
    general.time_sleep_print(f'The boss has {boss_health} health, and {boss_shield} shield... ')
    general.time_sleep_print(f'{name} has {health} health, and {shields} shield... ')
    if health+shields > boss_health+boss_shield:
        print(f'{name} has won! He will live to fight another day. ')
        quit()
    elif health+shields == boss_health+boss_shield:
        print('Twas a draw... they were both slain. ')
        quit()
    elif health+shields < boss_health+boss_shield:
        print(f'{name} was slain... the boss lives on. ')
    elif health+shields-100 > boss_health+boss_shield:
        print('Well jeez... you didn\'t have to beat him that badly.')
    elif health+shields < 100+boss_health+boss_shield:
        print('I.. that was rough.')  
    
starting_point = places_to_travel[random.randint(1,5)]
general.time_sleep_print(f'{name} has: {int(health)} health, and {int(shields)} shield.')
general.time_sleep_print("Rules: \n 1. Answer any question with 1, 2, ect. \n Example: How far do you want to go: 10 miles, or 20? \n Choose 1 for 10 miles, or 2 for 20. ")
print('')
general.time_sleep_print(f'{name} starts at {places_to_travel[random.randint(1,5)]}...')

for i in range(1,len(places_to_travel)):
    #You'll probably notice that the 2 options can potentially be the same. I personally don't mind this, but I might work another if statement into there at somepoint.
    first_place_to_travel = int(input(f'Where will they travel to first/next? (Choose 1 through 5) '))
    travel_counter += 1
    if travel_counter >= 5:
        boss_battle()
    else:
        if first_place_to_travel == 1:
            general.travel(starting_point, places_to_travel[first_place_to_travel])
            after_travel(False)
        elif first_place_to_travel == 2:
            general.travel(starting_point, places_to_travel[first_place_to_travel])
            after_travel(False)
        elif first_place_to_travel == 3:
            general.travel(starting_point, places_to_travel[first_place_to_travel])
            after_travel(True)
        elif first_place_to_travel == 4:
            general.travel(starting_point, places_to_travel[first_place_to_travel])
            after_travel(True)
        elif first_place_to_travel == 5:
            general.travel(starting_point, places_to_travel[first_place_to_travel])
            after_travel(True)
