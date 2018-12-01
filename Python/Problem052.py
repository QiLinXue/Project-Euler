'''
It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.

Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
'''

# 11/30/2018: 978692864 ns

import time
startTime = time.time()*1000000000

def digits_same(a,b):
    a = [int(d) for d in str(a)]
    a.sort()
    b = [int(d) for d in str(b)]
    b.sort()
    return a==b

x = 10
foundIt = False
while(not foundIt):
    x = x + 1

    if(int(str(x)[:2]) < 15):
        foundIt = True
        for i in range (2,7):
            if not digits_same(x,i*x):
                foundIt = False

print(x)
print("%s ns" % (time.time()*1000000000 - startTime))