#-------------------------------------------------------------------------------
# Name:        Functions4.py
#
# Author:      uo258425
#
# Created:     10/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------

def isLeap(year):
    """Checks if a given year is leap or not.
    Args:
        year: (int) A year
    Return:
        (boolean) True if it is leap. Otherwise, False
    """
    return year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)

THISYEAR = 2016

for i in range (THISYEAR):
    if (isLeap(i)):
        print"%d is leap" %i
    else:
        print"%d is not leap" 
