###################################################################
# Oscar Gaske
# Even or Odd
# Checks if a user's input is even or odd!
# 11/3/23
###################################################################
def even(num):
    print("Even" if num % 2 == 0 else "Odd")


def main():
    user_input = input("Please enter any valid integer: ")
    even(int(user_input))


main()
