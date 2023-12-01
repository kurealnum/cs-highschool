###################################################################
# Oscar Gaske
# Chatbot
# Chatbot that responds to the user with a random prompt
# 12/1/23
###################################################################

#############################################
# Chatbot starter code
#############################################

# import random number generator methods
import random


# define Chatbot class
class Chatbot:
    def __init__(self, name, phrases):
        self.name = name
        self.phrases = phrases

    def chat(self):
        num = random.randint(0, len(self.phrases) - 1)
        return self.phrases[num]


# create a list of phrases for Chatbot Bob
bobPhrases = [
    "Hello",
    "How are you?",
    "Are you okay?",
    "What's up!",
    "I don't have time right now",
]

# create the "bob" instance of Chatbot
bob = Chatbot("Bob", bobPhrases)

# create a list of phrases for Chatbot Joe
joePhrases = [
    "Not right now",
    "Hi!",
    "How are you doing?",
    "Hello there!",
    "I can't talk right now",
]

# create the "joe" instance of Chatbot
joe = Chatbot("Joe", joePhrases)

# get the user's name
name = input("What is your name? ")

# print a random response from bob
print(name + ", " + bob.name + " says " + bob.chat())

# print a random response from joe
print(name + ", " + joe.name + " says " + joe.chat())
