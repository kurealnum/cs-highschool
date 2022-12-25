#Oscar Gaske

choice = input('Choice 1 or 2: ')
if choice == '1':
    things_i_like = ['bike', 'computer', 'computer', 'trading', 'videogames', 'videogames']
    things_i_like.remove('computer')
    print(things_i_like)
    print("Now we\'ll use the .pop function.")
    saved_var = things_i_like.pop(3)
    things_i_like.pop(3)
    things_i_like.append('videogames')
    print(things_i_like)

if choice == '2':
    garden = ['grass','zinnias','grass','tomato','pepper','dandelion','chickweed','grass','strawberry','dandelion','raspberry','chickweed','grass','chickweed','grass']
    weeds = ['grass','chickweed','dandelion']
    for i in range(0,len(garden)):
        if weeds[0] in garden:
            garden.remove(weeds[0])
        elif weeds[1] in garden:
            garden.remove(weeds[1])
        elif weeds[2] in garden:
            garden.remove(weeds[2])

    print(garden)
