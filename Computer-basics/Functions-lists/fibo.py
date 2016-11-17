#-------------------------------------------------------------------------------
# Name:        Functions+lists.py
#
# Author:      uo258425
#
# Created:     17/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------

def fibonacci(n):
    myList=[]
    a,b = 1, 1
    for i in range(n-1):
        a,b = b,a+b
        myList.append(a)
    print myList





fibonacci(int(raw_input("How many terms do you want to calculate?:")))
