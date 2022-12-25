#Name-Oscar Gaske
import time
class print_people:
  
  def pr_nt_people(self, timr, name, statment):
    print(name,':',statment)
    time.sleep(timr)
  
  def pr_nt_sleep(self, timr, statement):
    print(statement)
    time.sleep(timr)

#Here we're defining the class, for simplicitys sake
slep_timr = int(2)
#Change the slep_timr VAR for longer breaks between text
person = print_people()
#This next part will be a bit draining, bu it's better than a print statment
person.pr_nt_people(slep_timr,'Bob','How\'s a-goin, everyone? (On the stage)')
person.pr_nt_people(slep_timr,'Linda','Bob, get off the stage. You arent the mayor.')
person.pr_nt_people(slep_timr,'Bob','(Muttering, Bob walks off the stage)')
person.pr_nt_people(slep_timr,'Linda','Now where\'s the real mayor?')
person.pr_nt_people(slep_timr,'(A random person in the crowd)',"He hasn't been seen today!")
person.pr_nt_people(slep_timr,'Linda','Well, someone find him!')
person.pr_nt_sleep(slep_timr,"*A shriek can be heard from across the room*")
person.pr_nt_people(slep_timr,'(A random person)',"H-He's dead!")
person.pr_nt_sleep(slep_timr,"*Bob walks out with a knife*")
person.pr_nt_people(slep_timr,'Bob', "You should've accepted me as your ruler!")
person.pr_nt_people(slep_timr,'(Everyone)','We Doth Bow to Bob, our Savior')
time.sleep(2)
print('Fin.')
