###################################################################
# Oscar Gaske
# Pick a Card
# Generates a random card, and prints information about that card
# 11/8/23
###################################################################
import random


# Define the Card class
class Card:
    # create an instance of Card class
    def __init__(self):
        # random number from 1 to 4
        self.suitValue = random.randint(1, 4)
        # set the self.suit to "hearts", "diamonds", "clubs", or "spades" based on suitValue
        suits = {1: "hearts", 2: "diamonds", 3: "clubs", 4: "spades"}
        self.suit = suits[self.suitValue]

        # random number from 2 to 14
        self.faceValue = random.randint(2, 14)
        # set the self.card equal to the string of faceValue (1-10) or "jack","queen", "king", or "ace" based on faceValue
        royals = {11: "jack", 12: "queen", 13: "king", 14: "ace"}
        self.card = (
            royals[self.faceValue] if self.faceValue in royals else str(self.faceValue)
        )

        # calculate self.score
        self.score = self.suitValue * self.faceValue


# main program
# get user input
name = input("What is your name? ")

# create an instance of the Card class
userCard = Card()

# output the card and the score
print(
    f"Hello, {name}! Your card is {userCard.card} of {userCard.suit}. Your score is {str(userCard.score)}"
)
