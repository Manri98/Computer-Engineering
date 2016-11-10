#-------------------------------------------------------------------------------
# Name:        Functions7.py
#
# Author:      uo258425
#
# Created:     10/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------
from math import sqrt


point = [0, 0]


def getDistanceToOrigin(point):
    return sqrt(point[0]**2+point[1]**2)


def getPoint():
    point[0] = int(raw_input("Type the X coordinate: "))
    point[1] = int(raw_input("Type the Y coordinate: "))
    return point


print getDistanceToOrigin(getPoint())
