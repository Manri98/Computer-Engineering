#-------------------------------------------------------------------------------
# Name:        has22.py
#
# Author:      uo258425
#
# Created:     17/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------


def has22(myArray):
    for i in range(len(myArray)):
        if myArray[i] ==2:
            if myArray[i+1]==2:
                return True
    return False

list1=[1,2,2,5,7,44,7,3,7,3,3]
print has22(list1)