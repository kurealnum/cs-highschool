import random

npctalks_list = []
npctalks = open("npc.txt")
for line in npctalks:
    npctalks_list.append(line.rstrip())

while True:
  user_input = input("Talk to the NPC!(Press Q to end the program!) ")
  if user_input.lower() == "q":
    break
  else:
    print(npctalks_list[random.randint(0,9)])
    

