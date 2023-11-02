###################################################################
# Oscar Gaske
# Adventure.py
# Text-based adventure game that takes you on a journey through a mystical land!
# 11/2/23
###################################################################


def main():
    print("You find yourself standing at a crossroads. Which path will you choose?")

    # loops until the user either quits, wins, or dies
    while True:
        print("\n1. Go left")
        print("2. Go right")
        print("3. Go straight")
        print("4. Go back")
        print("5. Quit")

        # choice input
        choice = input("Enter your choice (1/2/3/4/5): ")

        # deciding where to go, with function calls
        if choice == "1":
            go_left()
        elif choice == "2":
            go_right()
        elif choice == "3":
            go_straight()
        elif choice == "4":
            go_back()
        elif choice == "5":
            quit_game()
        else:
            print("Invalid choice. Please enter 1, 2, 3, 4, or 5.")


# function called if user chooses 1
def go_left():
    print("\nYou chose to go left. You find yourself in a dark forest.")
    print("1. Explore the forest")
    print("2. Return to the crossroads")

    choice = input("Enter your choice (1/2): ")

    if choice == "1":
        explore_forest()
    elif choice == "2":
        main()
    else:
        print("Invalid choice. Please enter 1 or 2.")


# function called if user chooses 2
def go_right():
    print("\nYou chose to go right. You arrive at a beautiful meadow.")
    print("1. Have a picnic")
    print("2. Follow a hidden path into the woods")

    choice = input("Enter your choice (1/2): ")

    if choice == "1":
        have_picnic()
    elif choice == "2":
        follow_hidden_path()
    else:
        print("Invalid choice. Please enter 1 or 2.")


# function called if user chooses 3
def go_straight():
    print("\nYou chose to go straight. You reach a riverbank.")
    print("1. Build a raft")
    print("2. Try to swim across")

    choice = input("Enter your choice (1/2): ")

    if choice == "1":
        build_raft()
    elif choice == "2":
        try_to_swim()
    else:
        print("Invalid choice. Please enter 1 or 2.")


# function called if user chooses 4
def go_back():
    print("\nYou chose to go back to the crossroads.")
    main()


# function called if user chooses 5
def quit_game():
    print("Thanks for playing! Goodbye.")
    exit()


##############################
# a bunch of helper functions
def explore_forest():
    print("\nYou explore the dark forest and discover a hidden treasure!")
    print("Congratulations, you win!")
    quit_game()


def have_picnic():
    print("\nYou have a lovely picnic and enjoy the serene meadow.")
    print("But, the game continues. You can go back to the crossroads.")
    main()


def follow_hidden_path():
    print("\nYou follow the hidden path into the woods.")
    print("You stumble upon a friendly village.")
    print("1. Explore the village")
    print("2. Return to the meadow")

    # user input for where to go
    choice = input("Enter your choice (1/2): ")

    if choice == "1":
        explore_village()
    elif choice == "2":
        go_right()
    else:
        print("Invalid choice. Please enter 1 or 2.")


def explore_village():
    print("\nYou explore the village and meet the villagers.")
    print("You make new friends and have a great time.")
    print("The villagers invite you to stay, and you live a happy life.")
    print("Congratulations, you win!")
    quit_game()


def build_raft():
    print("\nYou build a sturdy raft and cross the river safely.")
    print("You continue your adventure.")
    main()


def try_to_swim():
    print("\nYou attempt to swim across the river but get caught in a strong current.")
    print("Unfortunately, you drown. Game over.")
    quit_game()


# end of helper functions
###########################


# driver code, just calling the main function
if __name__ == "__main__":
    main()
