def binaryToDecimal(n):
    num = n;
    dec_value = 0;
     
    # Initializing base 
    # value to 1, i.e 2 ^ 0
    base1 = 1;
     
    len1 = len(num);
    for i in range(len1 - 1, -1, -1):
        if (num[i] == '1'):     
            dec_value += base1;
        base1 = base1 * 2;
    return dec_value;
num = input(); 
print(binaryToDecimal(num));