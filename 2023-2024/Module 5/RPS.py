###################################################################
# Oscar Gaske
# Rock Paper Scissors
# Plays a game of rock paper scissors with a computer
# 12/5/23
###################################################################

# import random methods
from random import randint

# initialize wins variables
userWins = 0
computerWins = 0

# create a while loop until userWins or computerWins is equal to 5
while userWins < 5 and computerWins < 5:
    # inside the loop, the program should get the user's choice (1, 2, or 3),
    user_choice = int(
        input("Please input an integer from 1-3 (enter 0 to exit the game): ")
    )
    # exit the loop if the user types in a zero(0)
    if not user_choice:
        break
    # generate a random choice for the computer (1, 2, or 3)
    computer_choice = randint(1, 3)
    # compare the choices to see who wins and print out the winner of that round
    if user_choice == computer_choice:
        print("It's a tie!")
    # add 1 to userWins if the user wins or add 1 to computerWins if the computer wins
    elif (
        (user_choice == 3 and computer_choice == 2)
        or (user_choice == 2 and computer_choice == 1)
        or (user_choice == 1 and computer_choice == 3)
    ):
        print("The user won!")
        userWins += 1
    else:
        print("The computer won!")
        computerWins += 1

    print(
        f"The user currently has {userWins} points, and the computer has {computerWins} points!"
    )
