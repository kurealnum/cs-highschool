#Oscar Gaske

#I used Program 4 from 3.3

counter = 1
count_list = []
while True:
    if len(count_list) >= 5:
        break
    else:
        count_list.append(int(counter))
        print(count_list)
        counter += 1
