'''
How many, not necessarily distinct, values of  nCr, for 1 ≤ n ≤ 100, are greater than one-million?
'''

# 12/01/2018: 2835456 ns

import time
startTime = time.time()*1000000000

pTri = [None] * (100+2)

counter = 0
for row in range(0,len(pTri)):
    pTri[row] = [None] * row
    for i in range(0,row):
        if i == 0 or i == row-1:
            pTri[row][i] = 1
        else:
            pTri[row][i] = pTri[row-1][i] + pTri[row-1][i-1]
            if pTri[row][i] > 1000000:
                counter += 1
print(counter)
print("%s ns" % (time.time()*1000000000 - startTime))