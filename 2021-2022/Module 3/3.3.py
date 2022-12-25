#Oscar Gaske

#Choice 1 is Program 2, Choice 2 is Program 4, Choice 3 is Program 3, and Choice 4 is Program 6

print('There are four options!')
choice = int(input('Please choose one (1-4): '))
if choice == 1:
    statement = input("Input a statement please: ")
    count = 0
    for i in statement.lower():
        if i == "e":
            count += 1
    print(count)

elif choice == 2:
    n = 5
    for i in range(1, n+1):
        for j in range(1, i+1):
            print(j, end=' ')
        print()

elif choice == 3:
    final_count = 0
    while True:
        pos_int = int(input("Please input a positive integer: "))
        if pos_int > 0:
            length_between_int = pos_int-0
            for i in range(0,length_between_int):
                final_count += i

            print(final_count+pos_int)
            quit()
        else:
            continue   

elif choice == 4:
    counting_number = int(input("Please enter a number between 1-50: "))
    usable_number = counting_number
    for i in range(1,100):
        if usable_number >= 100:
            quit()
        else:
            print(counting_number+usable_number)
            usable_number += counting_number
