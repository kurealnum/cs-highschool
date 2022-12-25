#Oscar Gaske
#4.4 Application
import random, time

def basic_math(x, y):
    print(f'The sum of your two numbers is: {x+y}')
    print(f'The product of your two numbers is {x*y}')

def greeting():
    greeting_list = ['Hi!', 'I don\'t like you, leave', 'Hello there!']
    print(greeting_list[random.randint(0,2)])

def message(your_message, repeat_length):
    for i in range(0, repeat_length):
        print(your_message)

basic_math(3,4)
time.sleep(1)
greeting()
time.sleep(1)
message('Hello there', 5)

