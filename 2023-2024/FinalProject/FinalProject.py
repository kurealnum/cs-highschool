###################################################################
# Oscar Gaske
# Disease Detector
# A (fake) program to help doctors detect diseases
# 5/20/2024
###################################################################

# Note: I am viewing 1 as True, and 0 as False, per 1 == True and 0 == False


class Disease:
    def __init__(
        self,
        name,
        max_fever_102,
        min_fever_103,
        dry_cough,
        wet_cough,
        headache,
        backache,
        stomachache,
        nausea,
        sneeze,
        sore_legs,
        sleepy,
        runny_nose,
    ) -> None:
        self.name = name

        # all booleans from here on down
        self.max_fever_102 = max_fever_102
        self.min_fever_103 = min_fever_103
        self.dry_cough = dry_cough
        self.wet_cough = wet_cough
        self.headache = headache
        self.backache = backache
        self.stomach_ache = stomachache
        self.nausea = nausea
        self.sneeze = sneeze

        # new symptoms
        self.sore_legs = sore_legs
        self.sleepy = sleepy
        self.runny_nose = runny_nose

    # "magic" method for comparing objects
    def __eq__(self, user_disease) -> bool:
        if not isinstance(user_disease, Disease):
            return NotImplemented

        # we don't need to check that the names are the same, of course
        return (
            (self.max_fever_102 == user_disease.max_fever_102)
            and (self.min_fever_103 == user_disease.min_fever_103)
            and (self.dry_cough == user_disease.dry_cough)
            and (self.wet_cough == user_disease.wet_cough)
            and (self.headache == user_disease.headache)
            and (self.backache == user_disease.backache)
            and (self.stomach_ache == user_disease.stomach_ache)
            and (self.nausea == user_disease.nausea)
            and (self.sneeze == user_disease.sneeze)
            and (self.sore_legs == user_disease.sore_legs)
            and (self.sleepy == user_disease.sleepy)
            and (self.runny_nose == user_disease.runny_nose)
        )


# helper function to assign a boolean value to user_input
def yandnhelper(user_input):
    return user_input == "y"


# fmt: off
explosiveFinger = Disease("Explosive Finger", True, False, True, False, False, False, True, False, False, False, False, False)
autumnScurvy = Disease("Autumn Scurvy", False, False, False, True, True, False, False, True, False, False, False, False)
chillingFever = Disease("Chilling Fever", False, True, False, False, False, True, False, True, True, False, False, False)
avianFoot = Disease("Avian Foot", False, False, True, False, False, True, False, False, True, False, False, False)
arachnidParasite = Disease("Arachnid Parasite", True, False, False, True, False, False, True, False, False, False, False, False)
dragonParalysis = Disease("Dragon Paralysis", False, True, False, False, False, True, False, True, True, False, False, False)
uglyEye = Disease("Ugly Eye", False, False, True, True, False, False, True, False, False, False, False, False)
quiveringFoot = Disease("Quivering Foot", False, False, False, False, False, True, False, False, True, False, False, False)

# new diseases
jumpingEpilepsy = Disease("Jumping Epilepsy", False, False, True, True, False, False, True, False, True, False, False, True)
swineBaldness = Disease("Swine Baldness", False, True, True, True, False, True, True, False, False, True, True, True)
# fmt: on

diseases_list = [
    explosiveFinger,
    autumnScurvy,
    chillingFever,
    avianFoot,
    arachnidParasite,
    dragonParalysis,
    uglyEye,
    quiveringFoot,
    jumpingEpilepsy,
    swineBaldness,
]

name = input("What's your name?\n")
print("Please enter either y(es) or n(o) for the remainder of the questions.\n")

# check to see if the user has a fever
has_fever = yandnhelper(input("Do you have a fever?\n"))
if has_fever:
    fever_temp = yandnhelper(input("Do you have a minimum fever of 103?\n"))
    if fever_temp:
        max_fever_102 = False
        min_fever_103 = True
    else:
        print("In that case, we will assume that you have a maximum fever of 102.\n")
        min_fever_103 = False
        max_fever_102 = True
else:
    max_fever_102 = False
    min_fever_103 = False

# check to see if the user has a cough
has_cough = input("Do you have a cough that is dry or wet (enter b for both)?\n")
if has_cough == "b":
    dry_cough = True
    wet_cough = True

elif has_cough == "y":
    dry_or_wet = yandnhelper(input("Is your cough wet?\n"))
    if dry_or_wet:
        dry_cough = False
        wet_cough = True
    else:
        print("We will assume that your cough is dry.\n")
        dry_cough = True
        wet_cough = False
else:
    dry_cough = False
    wet_cough = False

# check to see if the user has a headache
headache = yandnhelper(input("Do you have a headache?\n"))

# check to see if the user has a backache
backache = yandnhelper(input("Do you have a backache?\n"))

# check to see if the user has a stomach ache
stomach_ache = yandnhelper(input("Do you have a stomach ache?\n"))

# check to see if the user is nauseous
nausea = yandnhelper(input("Are you nauseous?\n"))

# check to see if the user has a sneeze
sneeze = yandnhelper(input("Are you sneezing a lot?\n"))

# check to see if the user has sore_legs
sore_legs = yandnhelper(input("Are your legs sore?\n"))

# check to see if the user is sleepy
sleepy = yandnhelper(input("Are you sleepy?\n"))

# check to see if the user has a runny nose
runny_nose = yandnhelper(input("Do you have a runny nose?\n"))

user_symptoms = Disease(
    "USER_SYMPTOMS",
    max_fever_102,
    min_fever_103,
    dry_cough,
    wet_cough,
    headache,
    backache,
    stomach_ache,
    nausea,
    sneeze,
    sore_legs,
    sleepy,
    runny_nose,
)

# check what disease symptoms match the users symptoms
possible_diseases = []
for disease in diseases_list:
    if disease == user_symptoms:
        possible_diseases.append(disease.name)

# if we couldn't diagnose the user with any diseases
if not possible_diseases:
    print(f"Sorry, {name}. You may need to see a different doctor\n")

# if we could
else:
    print(f"{name}, you may have the following diseases:\n")
    for disease in possible_diseases:
        print(f"{disease}\n")
