###################################################################
# Oscar Gaske
# Chatbot 2.0
# A bot that chats with you!
# 1/11/23
###################################################################
from random import choice


class ChatBot:
    def __init__(self, name):
        self.name = name
        self.helloPhrases = [
            "Hello, how are you?",
            "Hey there, what's up?",
            "Good morning, it's nice to see you.",
            "Hi, how have you been?",
            "Greetings, I hope you're doing well.",
        ]
        self.dogPhrases = [
            "Who's a good boy?",
            "Let's go for a walk!",
            "Time for a bath, buddy.",
            "Sit! Stay!",
            "Fetch the ball!",
        ]
        self.carPhrases = [
            "Vroom vroom!",
            "I need to fill up the tank.",
            "Check the oil and tires.",
            "I love driving with the windows down.",
            "I'm stuck in traffic again.",
        ]
        self.musicPhrases = [
            "What's your favorite genre?",
            "I can't stop humming this tune.",
            "Music always lifts my mood.",
            "Let's go to a concert together.",
            "I enjoy playing instruments.",
        ]
        self.familyPhrases = [
            "Family comes first.",
            "We're planning a family reunion.",
            "I miss my siblings.",
            "Dinner with the whole family tonight.",
            "My parents are visiting this weekend.",
        ]
        self.randomPhrases = [
            "Life is full of surprises.",
            "I need a vacation ASAP.",
            "I'm craving some chocolate.",
            "The stars look beautiful tonight.",
            "Let's try something new today!",
        ]

    def chat(self, userPhrase):
        # split the users input on every space (" ") and check if any of the words are valid
        keywords = userPhrase.split(" ")
        if "hello" in keywords:
            print(choice(self.helloPhrases))
        elif "dog" in keywords:
            print(choice(self.dogPhrases))
        elif "car" in keywords:
            print(choice(self.carPhrases))
        elif "music" in keywords:
            print(choice(self.musicPhrases))
        elif "family" in keywords:
            print(choice(self.familyPhrases))
        else:
            print(choice(self.randomPhrases))


ChatBot1 = ChatBot("Timothy")
ChatBot2 = ChatBot("Alice")

username = input("What's your name? ")

# Loop variable, checks to see if the user still wants to talk to the chatbot
isTalking = True

while isTalking:
    userPhrase = input("Say something to the chatbots! ")
    if userPhrase.lower() == "bye":
        isTalking = not isTalking
    else:
        ChatBot1.chat(userPhrase)
        ChatBot2.chat(userPhrase)

print("Nice talking with you, " + username)
