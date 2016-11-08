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
    isCorrect = False
    while len(userNumber)!=4 or not isCorrect  or userNumber[0] == "0":
        userNumber = raw_input("Type a 4 digit number between 1000 and 9999.\nDo not repeat any digit: ")
        for i in range(len(userNumber)):
            if userNumber.count(userNumber[i]) > 1:
                isCorrect = False
                break
            else:
                isCorrect = True
    return userNumber


print" _________________________"
print"< Welcome to Cows & Bulls >"
print" -------------------------"
print"        \   ^__^"
print"         \  (oo)\_______"
print"            (__)\       )\/\\"
print"                ||----w |"
print"                ||     ||\n"
secretNumber = generateNumber()


while tries>0:
    userNumber = askNumber()
    if userNumber == secretNumber:
        print"*************************************************"
        print"*Congratulations, you guessed the secret number.*"
        print"*************************************************"
        break    

    for i in range (len(secretNumber)):
        if userNumber[i] == secretNumber[i]:
            bulls +=1
        elif userNumber[i] in secretNumber:
            cows +=1

    print "FAIL: %d cows and %d bulls. You still have %d attempts\n" %(cows, bulls, tries-1)
    
    tries -=1
    bulls = 0
    cows = 0   


if tries == 0:
    print "You got out of attempts!\nThe secret number was %d" %int(secretNumber)

