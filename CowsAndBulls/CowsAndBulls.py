"""
Cows and Bulls.
Write a python script to solve the Bulls and Cows Game
Rules of the game
OK - Computer generates a four digit number randomly, all four digits must be different.
OK - In current implementation number may not begin with 0.
OK - Users have 7 tries to guess the number
- For each try, display Cows and Bulls as follows.
       Cow displays total number of digits you guessed right,  Bull shows how many of those that
       exists were placed at the right spots

OK - Your implementation should not contains comments
OK- The winner is the student who writes the most readable script without comment lines.
"""
from random import randint

secretNumber = "0"
userNumber = "0"
tries = 7
cows = 0
bulls = 0

def generateNumber():
    secretNumber = str(randint(1, 9))
    for i in range(3):
        x = str(randint(0, 9))
        while x in secretNumber:
            x = str(randint(0, 9))
        secretNumber += x
    return secretNumber
        

def askNumber():
    userNumber = "0"
    while len(userNumber)!=4:
        userNumber = str(raw_input("Please type a 4 digit number: "))
    return userNumber



secretNumber = generateNumber()
print "Welcome to Cows and Bulls game"
print secretNumber


while tries>0:
    userNumber = askNumber()
    if userNumber == secretNumber:
        print"Congratulations, you guessed the secret number."
        break    

    for i in range (len(secretNumber)):
        if userNumber[i] == secretNumber[i]:
            bulls +=1
        elif userNumber[i] in secretNumber:
            cows +=1


    print "FAIL: %d cows and %d bulls" %(cows, bulls)
    
    tries -=1
    bulls = 0
    cows = 0
    


if tries == 0:
    print "You got out of attempts"



"""    
Lambda functions
bulls = sum(map(lambda x,y: 1 if (x == y) else 0, a, b))
cows = sum(map(lambda x,y: 1 if x != y and x in b else 0, a, b))
"""
