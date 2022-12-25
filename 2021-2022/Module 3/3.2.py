'''
3 levels deep of if/elif/else !
Store variables from user !
Use the users inputs at least 4 times !
Use concatenation, typecasting, and single-line and multi-line comments in your program !
Output a few sentences about the user
'''

#I would've loved to use the .json module for this, but I couldn't figure it out for rep.lit
synonms_for_sad = ["unhappy", "down", "regretful", "depressed", "sad", 'bad', 'awful ']
synonms_for_happy = ["contented","cheerful","happy","lucky","joyful", "great", "nice"]
synonms_for_angry = ["irritated","angry","annoyed","displeased","irate"]
deleteable_words = ['a', 'an', 'the', 'why', 'to', 'do', 'I', 'them', 'they']

#3+ layers of nesting on Line 35 

def starting_func():
    global private_name
    print('Hello there! I\'m your personal robot helper!') 
    private_name = input('Before we get started, what\'s your name? ')
    User_Feeling = input(f'Alrighty then, {private_name}. How do you feel today? ')
    Split_User_Feeling = User_Feeling.split()

    for i in range(0,len(Split_User_Feeling)):
        if Split_User_Feeling[i] in synonms_for_sad:
            wrong_or_right('sad', private_name)
        elif Split_User_Feeling[i] in synonms_for_angry:
            wrong_or_right('angry', private_name)
        elif Split_User_Feeling[i] in synonms_for_happy:
            wrong_or_right('happy', private_name)
        else:
            continue

def wrong_or_right(feeling, name):
    if name == 'Monty Python':
        print('Well sir, I think you\'re feeling quite alright. You\'re my creator after all.')
        quit()
    else:
        true_or_false = input(f'Ah, I see that you feel {feeling}. Is this correct? ')
        if (true_or_false.lower() in ("yes", "y", "yep")):
            if (feeling == 'sad'):
                what_enjoyment(feeling)
            elif (feeling == 'angry'):
                what_enjoyment(feeling) 
            elif (feeling == 'happy'):
                what_enjoyment(feeling)
        elif (true_or_false.lower() in ('no', 'nah', 'n')):
            print('Oops, we\'ll try that again. ')
            starting_func()

def what_enjoyment(current_feeling):
    #I would've loved to do what I had originially planned to do here. Sadly, I couldn't figure it out to write it cleanly. The "example" is on line 62, commented out.  
    User_Enjoyment = input(f'Ok. What do you do when you feel {current_feeling}? ')
    print(f'Ok. When you\'re {current_feeling}, you {User_Enjoyment}')
    final_function(private_name, current_feeling, User_Enjoyment)

def final_function(final_name, daily_feeling, fun_things_to_do):
    print(f'Today, we learned that your name is {final_name}, and you feel {daily_feeling} today, and you like {fun_things_to_do} when you feel {daily_feeling}.')
    print('Have a good day!')
    
'''
The old code:
def what_enjoyment(what_feeling):
    User_Enjoyment = input(f'Ok. What do you do when you feel {what_feeling}? ')
    Split_User_Enjoyment = User_Enjoyment.split()
    print(Split_User_Enjoyment)
    Final_User_Enjoyment = " ".join(Split_User_Enjoyment)
    for i in range(0, len(deleteable_words)):
        x = 0
        for x in range(0, len(Split_User_Enjoyment)):
            if Split_User_Enjoyment[x] in deleteable_words[i]:
                Split_User_Enjoyment.remove(x)
            elif Split_User_Enjoyment[x] not in deleteable_words[i]:            
                print(Final_User_Enjoyment)
                pass
            else: 
                continue
'''
starting_func()

