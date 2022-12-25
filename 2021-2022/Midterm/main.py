import random

def text_based_game():
    health_points = [15, 40, 45]
    possible_health_points = [5, 10, 20, 25, 30, 35, 50]
    weapons = ["blank", "laser blaster", "sword"]
    attack_power = 5
    laser_or_sword = int(input("Do you want a laser blaster, or a sword (1 or 2) "))
    if laser_or_sword == 1:
        print("You have a laser blaster")
    elif laser_or_sword == 2:
        print("You have a sword")

    while True: 
        turn_counter = 0
        turn_check = 0
        turn_counter+=1
        if turn_counter >= 10+turn_check:
            health_points.append(possible_health_points[random.randint(0,6)])
            turn_check+=10
        else:
            pass
        enemy_choice = int(input(f"Which enemy do you want to fight? (0 through {len(health_points)-1}) "))   
        health_left = health_points[enemy_choice]-attack_power
        health_points[enemy_choice] = health_left
        print(f"You attacked the enemy with your {weapons[laser_or_sword]}, dealing 5 damage. The enemy has {health_left} health left.")
        if health_left <= 0:
            print("You defeated the enemy! ")
            health_points.pop(enemy_choice)
        else: 
            print("Keep fighting, you haven't defeated them yet! ")

def animal_and_noise(animal, noise):
    print(f"Old MacDonald had a farm \nE-I-E-I-O \nAnd on his farm he had a {animal} \nE-I-E-I-O")
    print(f"With a {noise} {noise} here \nAnd a {noise} {noise} there \nHere a {noise}, there a {noise}")
    print(f"Everywhere a {noise} {noise} \nOld MacDonald had a farm \nE-I-E-I-O")

def old_macdonald():
    animal_and_noise("cow","moo")
    animal_and_noise("chicken", "cluck")
    animal_and_noise("pig", "oink")
    animal_and_noise("duck", "quack")

def hundred_numbers():
  numbers_list = []
  nums = open("main.txt", "r")
  for line in nums:
    numbers_list.append(line.rstrip("\n"))

  print(f"The initial list was: {numbers_list}.")
  for i in range(0, len(numbers_list)):
    numbers_list[i] = int(numbers_list[i])

  average = sum(numbers_list)/len(numbers_list)
  print(f"The average is {average}.")

func_choice = int(input("Choose a function (1-3) "))
if func_choice == 1:
  text_based_game()
elif func_choice == 2:
  old_macdonald()
else:
  hundred_numbers()
