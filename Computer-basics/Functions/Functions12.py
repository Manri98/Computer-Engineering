#-------------------------------------------------------------------------------
# Name:        Functions12.py
#
# Author:      uo258425
#
# Created:     10/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------

def isPrime(num):
    if num > 1:
       for i in range(2,num):
           if (num % i) == 0:
               return False
               break
       else:
           return True
    else:
       return False

num = 1

while not num == 0:
    num = int(raw_input("Type an integer: "))
    if isPrime(num):
        print "%d is prime" %num
    else:
        print "%d is not prime" %num

