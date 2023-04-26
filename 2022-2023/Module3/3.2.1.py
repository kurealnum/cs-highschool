'''
Oscar

Write a quiz that helps the user practice their multiplication tables, where the questions are different every time (uses random numbers).
Your quiz should contain at least five questions.
'''

#Imports
import random

#Loop through the question 5 times, each time with new random numbers
for i in range(1,6):
    #Generate 2 random numbers between 1 and 10
    first_multi = random.randint(1,11)
    second_multi = random.randint(1,11)

    #Ask the user for what the 2 random numbers multiplied together are
    user_answer = int(input(f'What is {first_multi} times {second_multi}? '))

    #Then, check if the user answered correctly using conditional statements.
    if user_answer == first_multi*second_multi:
        print("You answered correctly! ")
    else:
        print("You answered incorrectly :( ")
