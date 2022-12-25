#Oscar Gaske

import random
random_num = random.randint(33,126)
if (random_num % 2) == 0:
    print(f"The random number, {random_num}, is an even number. ")
else:
    print(f"The random number, {random_num}, is an odd number. ")
print(f"The ASCII character for the random number is {chr(random_num)}")
print(f"The hexadecimal for the random number is {hex(random_num)}")
print(f"The binary num for the random number is {bin(random_num)}")
