#-------------------------------------------------------------------------------
# Name:        AngryBirds1.py
#
# Author:      uo258425
#
# Created:     03/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------


from math import pi, sin

G = 32.2
speed = 1
angle = 0
distance = 0
pigDistance = 70



while speed !=0:

    print"Angry Birds!\nThe pig is %i feet far away." %pigDistance
    speed = float(raw_input("What speed to launch at (fps) (0 to stop)?"))

    if speed==0:
        print"Good Bye!"
        break

    while speed <0:
        speed = float(raw_input("Speed must be greater than zero (0 to stop)"))

    angle = float(raw_input("What angle(in degrees)?"))

    print"For a bird launched at %.2f feet per sec with an angle of %.2f degrees \
         from the horizontal the distance traveled is  %.2f" %(speed, angle, distance)
    angle = (angle*pi)/180
    distance = speed**2*sin(2*angle)/G
    print"The distance traveled is %.2f feet." %distance

    if distance<(pigDistance-2):
		print"Too short to kill the pig"

    elif distance>(pigDistance+2):
		print"Too long to kill the pig."

    else:
		print"You killed the pig"
