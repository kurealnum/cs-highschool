#Oscar G 
#I did the second choice 
"""
Keep in mind that there are a LOT of weird variables. Like _print_, or slep_tim. This is because standard "time" variables conflicts with the "time" module. (And any other class)
"""
import time

class general():

  def starting_func(self):
    global name_
    name_ = input('What\'s your name?: ')
    if (name_ == 'Monty_Python'):
      the_class_print.print_(slep_tim, 'Welcome home good sir.')
      general.get_age()
    elif name_.isupper():
      the_class_print.print_(slep_tim, 'There\'s no need to shout!')
      general.get_age()
    else:
      the_class_print.print_(slep_tim, f'Hello, {name_}')
      general.get_age()
        
  def get_age(self):
    global age
    age = int(input('How old are you? (No floats, or strings please): '))
    time.sleep(slep_tim)
    if (age >= 100000000000000000000000000000000000000000000):
      the_class_print.print_(slep_tim, "How long did it take you to type that?")
      general.third_step()
    elif (age == 23428492852395):
      the_class_print.print_(slep_tim, "Dude... I'm just confused at this point.")
      general.third_step()
    else:
      general.third_step()

  def third_step(self):
    double_check = input(f"Nice to meet you! Let me check, your name is {name_} and you are {age} years old? (Yes or No): ")
    if (double_check == "Yes" or "yes"):
      the_class_print.print_(slep_tim, 'Cool!') 
      general.fourth_step()
    elif (double_check == "No" or "no"):
      the_class_print.print_(slep_tim, "Let's try this whole thing again...")
      general.starting_func()

  def fourth_step(self):
    detective = input(f"So {name_}... who sent you here? ")
    if (detective == name_):
      print("So you're here by yourself, are ya? I'll let you go... ")
      quit()
    else:
      print(f"{detective} doesn't seem like a great reason")
      for i in range(1,4):
        print("Bang!")
      
class _print_():
  
  def print_(self, tim_to_sleep, print_statment):
    print(print_statment)
    time.sleep(tim_to_sleep)

#Define class so it can be used with ease
the_class_print = _print_() 
general = general()
slep_tim = float(input("How long would you like to wait between messages? (1 is reccomended): "))
time.sleep(slep_tim)
#input slep_time from input, to function, that function is from class "time"
general.starting_func()
