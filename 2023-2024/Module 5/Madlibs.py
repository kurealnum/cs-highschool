###################################################################
# Oscar Gaske
# Madlibs.py
# A mad libs game in python!
# 12/15/23
###################################################################


import random


def makeStory1(name1: str, name2: str, verb1: str, verb2: str, noun1: str, noun2: str):
    print(
        f"{name1} and {name2} decided to {verb1} to the {noun1}, where they {verb2} on top of the {noun2} hill."
    )


def makeStory2(name1: str, name2: str, verb1: str, verb2: str, noun1: str, noun2: str):
    print(
        f"{name1} and {name2} planned to {verb1} to the {noun1}, where they would {verb2} in the {noun2}"
    )


def makeStory3(name1: str, name2: str, verb1: str, verb2: str, noun1: str, noun2: str):
    print(
        f"{name1} and {name2} planned to go to the {noun1}, where they were hoping to find {noun2} by {verb1} and {verb2}"
    )


# getting user input
name1 = input("Give me a name: ")
name2 = input("Give me another name: ")
verb1 = input("Give me a verb: ")
verb2 = input("Give me another verb: ")
noun1 = input("Give me a noun: ")
noun2 = input("Give me another noun: ")

# randomly deciding which story to go with
random_num = random.randint(1, 3)
if random_num == 1:
    makeStory1(
        name1=name1, name2=name2, verb1=verb1, verb2=verb2, noun1=noun1, noun2=noun2
    )
if random_num == 2:
    makeStory2(
        name1=name1, name2=name2, verb1=verb1, verb2=verb2, noun1=noun1, noun2=noun2
    )
else:
    makeStory3(
        name1=name1, name2=name2, verb1=verb1, verb2=verb2, noun1=noun1, noun2=noun2
    )
