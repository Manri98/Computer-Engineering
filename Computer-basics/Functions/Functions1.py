#-------------------------------------------------------------------------------
# Name:        Functions.py
#
# Author:      uo258425
#
# Created:     10/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------


def read_integer(minlimit, maxlimit):
    """Ask the user to type an integer untill it is between a defined range.
    Args:
        minlimit: (int) The bottom of the range.
        maxlimit: (int) The top of the range.
    Returns:
            number: (int) An integer.
    """
    number = int(raw_input("Give me an integer: "))
    while number not in range(minlimit, maxlimit+1):
        if number<minlimit:
            print"The number is too low"
        else:
            print"The number is too high"
        number = int(raw_input("Give me an integer: "))
    return number

def biggest(a, b):
    """Returns the biggest number.
    Args:
        a: (int) An integer.
        b: (int) An integer.
    Returns:
        (int) The biggest number.
    """
    if a>b:
        return a
    else:
        return b



print read_integer() + read_integer()
print biggest(read_integer(), read_integer())
print biggest(biggest(read_integer(), read_integer()), read_integer())
print inRange(read_integer(), read_integer(), read_integer())
