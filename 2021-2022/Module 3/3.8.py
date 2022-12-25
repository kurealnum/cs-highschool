#Oscar Gaske, Choice 2

encoded_message = input("Enter a message to be encoded ")
encode_choice = input("How do you want your message to be encoded (Hex or Binary): ")
message_in_list = list(encoded_message)
ascii_char_list = []

ascii_list = list(map(ord, encoded_message))

if encode_choice.lower() in ('hex', 'hexadecimal'):
    print("Your message in hexadecimal is: ")
    converted_hex = ' '.join(map(hex, ascii_list))
    print(converted_hex)
    decode_hex = input("Would you like to decode your message? ")
    if decode_hex.lower() in ('yes', 'y'):
        deconverted_hex = [int(n, 16) for n in converted_hex.split()]
        final_hex_ascii_list = list(map(chr, deconverted_hex))
        final_list = ''.join(final_hex_ascii_list) 
        print (f"Your decoded message is: {final_list}")
    else:
        quit()

else:
    print("Your message in binary is: ")
    converted_bin = ' '.join(map(bin, ascii_list))
    print(converted_bin)
    decode_bin = input("Would you like to decode your message? ")
    if decode_bin.lower() in ('yes', 'y'):
        deconverted_bin = [int(n, 2) for n in converted_bin.split()]
        final_bin_ascii_list = list(map(chr, deconverted_bin))
        final_bin_list = ''.join(final_bin_ascii_list)
        print (f"Your decoded message is: {final_bin_list}")
    else:
        quit()
