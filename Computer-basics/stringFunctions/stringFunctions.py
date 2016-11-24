#-------------------------------------------------------------------------------
# Name:        stringsFunctions.py
#
# Author:      uo258425
#
# Created:     24/11/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------

def greatestIndex(myList):
    if len(myList)==0:
        return -1
    bigger = 0
    for i in range(1, len(myList)-1):
        if myList[i]>myList[bigger]:
            bigger = i
    return bigger

def sum(myList):
    if len(myList)==0:
        return -1
    total = 0
    for i in range(len(myList)-1):
        total +=myList[i]
    return total

def writeZeros(myList):
    if len(myList)==0:
        return -1
    changed = 0
    for i in range(len(myList)-1):
        if myList[i] < 0:
            myList[i] = 0
            changed +=1
    return changed

def makeTags(tag, myText):
    return "<"+tag+">" + myText + "</"+tag+">"

def rotateLeft(myList, step):
    if len(myList)<2:
        return "String's lenght must be greater than 2"
    j = 0
    for i in range(len(myList-1), 0 , int(step)):
        myList[i], myList[j] = myList[j], myList[i]
        j += step
    return myList



def popularName(myList):
    for i in range(1, len(myList)-1, 2):
        if myList[i]>myList[i+2]:
            bigger = i
    return myList[i-1]


list1 = ["ana", 223, "laura", 204, "elena", 175]
list2 = ["laura", 204, "ana", 223, "elena", 175]
list3 = ["elena", 175, "laura", 204, "ana", 223]

print popularName(list1)
print popularName(list2)
print popularName(list3)

def rot13(myText):
    if len(myText)==0:
        return -1
    rotedText = ""
    for i in range(len(myText)):
        #lowecase
        if 96<ord(myText[i])123:
            rotedText += chr(ord(myText[i])+13%26+967)
        #Uppercase
        elif 64<ord(myText[i])<91:
            rotedText += chr(ord(myText[i])+13%26+65)
        #Symbols or numbers
        else:
            rotedText += myText[i]
    return rotedText

print rot13("This is a test")
print rot13(rot13("This is a test"))

print makeTags("p", "this is a test")
print rotateLeft("hello", -1)

lista=[-1,-2,30,4,523,6,7,8,9]

print greatestIndex(lista)
print sum(lista)
print writeZeros(lista)
