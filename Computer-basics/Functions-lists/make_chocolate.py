#-------------------------------------------------------------------------------
# Name:        make_chocolate.py
# Purpose:
#
# Author:      uo258425
#
# Created:     17/11/2016
# Copyright:   (c) uo258425 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def make_chocolate(small, big, goal):
  bigBars = 0
  if goal<big*5 and goal<=small:
      return goal
  elif goal<=(big*5+small):
    while goal%(5)==0:
      bigBars+=1
    return goal-bigBars*5
  else:
    return -1


print make_chocolate(5,4,9)
