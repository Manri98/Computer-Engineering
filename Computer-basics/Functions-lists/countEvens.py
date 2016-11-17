#-------------------------------------------------------------------------------
# Name:        countEvens.py
#
# Author:      uo258425
#
# Created:     17/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------

def countEvens(myArray):
    myArray2=[]
    for i in range(len(myArray)):
        if myArray[i]%2==0:
            myArray2.append(myArray[i])
    return myArray2

list1 = [2,12,523,642,6,7,4568,4,8,235,23]

print countEvens(list1)
