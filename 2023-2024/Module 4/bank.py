###################################################################
# Oscar Gaske
# Bank.py
# Manages a users bank acount
# 11/17/23
###################################################################


class Account:
    def __init__(self, name, balance):
        self.name = name
        self.balance = balance

    # withdraws a certain amount of money from a users account
    def withdraw(self, withdrawl):
        if self.balance >= withdrawl:
            self.balance -= withdrawl
            self.checkBalance()
            return self.balance

        # else
        print(self.name + " Requested withdrawal exceeds balance")
        return self.balance

    # deposit a certain amount of money into an acocunt
    def deposit(self, deposit):
        self.balance += deposit
        self.checkBalance()
        return self.balance

    # return the amount of money that is in the account
    def checkBalance(self):
        print(self.name, self.balance)
        return self.balance


# create Account instances
account1 = Account("Barbara", 500.00)
account2 = Account("Joe", 150.00)
account3 = Account("Frank", 20.00)

# get user's desired action (w, d, or c)
user_input = input("Please enter either w, d, or c: ")

# perform the action depending on the user's input.

# withdrawing money
if user_input == "w":
    amount = float(input("How much do you want to withdraw? "))
    account1.withdraw(amount)
    account2.withdraw(amount)
    account3.withdraw(amount)

# depositing money
elif user_input == "d":
    amount = float(input("How much do you want to deposit? "))
    account1.deposit(amount)
    account2.deposit(amount)
    account3.deposit(amount)

# checking balance
else:
    account1.checkBalance()
    account2.checkBalance()
    account3.checkBalance()
