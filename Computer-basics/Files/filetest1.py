#-------------------------------------------------------------------------------
# Name:        filetest1.py
#
# Author:      uo258425
#
# Created:     01/12/2016
# Copyright:   (c) uo258425 2016
#-------------------------------------------------------------------------------
EOF = ""
f = open("students.txt","r")
myList=[]
myLine = f.readline()
f = open("students.txt","r")
while myLine!=EOF:
    cleanLine=myLine.strip(" \t\n")
    print myLine
    if cleanLine!="":
        myList.append(cleanLine)
    myLine = f.readline()
print " ".join(myList)
f.close()



"""
myFile = open("test.txt","w")
for i in range 10:
    myFile.write(i)
myFile.close()
"""
