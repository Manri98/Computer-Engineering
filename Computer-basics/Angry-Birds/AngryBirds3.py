#-------------------------------------------------------------------------------
# Name:        AngryBirds3.py
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
pigDistance = 50
score = 0
ammo = 5

def angleOK():
    angle = float(raw_input("What angle(in degrees)?"))
    while angle<0 or angle >90:
        angle = float(raw_input("Angle must be between 0 and 90"))
    return angle

def degreesToRadians(angle):
    angle = (angle*pi)/180
    return angle

def calculateDistance(speed, angle):
    distance = speed**2*sin(2*angle)/G
    print"The distance traveled is %.2f feet." %distance
    return distance

while speed !=0:

    print"Angry Birds!\nThe pig is %i feet far away." %pigDistance
    speed = float(raw_input("What speed to launch at (fps) (0 to stop)?"))

    if speed==0:
        print"Good Bye!\nYou killed %i pigs and you have %i attempts left" %(score, ammo)
        break

    while speed <0:
        speed = float(raw_input("Speed must be greater than zero (0 to stop)"))

    angle = angleOK()

    print"For a bird launched at %.2f feet per sec with an angle of %.2f degrees \
         from the horizontal the distance traveled is  %.2f" %(speed, angle, distance)

    angle = degreesToRadians(angle)
    distance = calculateDistance(speed, angle)

    if distance<(pigDistance-2):
		print"Too short to kill the pig"

    elif distance>(pigDistance+2):
		print"Too long to kill the pig."

    else:
		print"???You killed the pig!!!"
		score += 1
		pigDistance += 10

    ammo -= 1

    if pigDistance>70:
        print"Good game and good bye!\nYou killed %i pigs. And you have %i attempts left" %(score, ammo)
        break
    if ammo == 0:
        print"Good game and good bye!\n You killed %i pigs. No more attempts left." %score
        break


