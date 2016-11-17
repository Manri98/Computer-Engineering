#-------------------------------------------------------------------------------
# Name:        primes.py
#
# Author:      uo258425
#
# Created:     17/11/2016
# Copyright:   (c) uo258425 2016
#--------------------------------------------------------------------------------------------------------------------------------------------------------------
from divisors_isprime import *


def primes(m, n):
    myList=[]
    for i in range(m, n):
        if isPrime(i)==True:
            myList.append(i)
    return myList


print primes(int(raw_input("First number of the range: ")),int(raw_input("Last number of the range: ")))
