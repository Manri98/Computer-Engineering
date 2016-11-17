#-------------------------------------------------------------------------------
# Name:        divisors_isprime.py
#
# Author:      uo258425
#
# Created:     17/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------
def isPrime(num):
    if num > 1:
       for i in range(2,num):
           if (num % i) == 0:
               return False
       else:
           return True
    else:
       return False

def divisors(num):
    myList=[]
    for i in range(1, num):
        if num%i == 0:
            myList.append(i)
    return myList

#print isPrime(int(raw_input("Check if it is prime: ")))
#print divisors(int(raw_input("Get divisors: ")))
