#Functions have been implemented  to make the code easier to read.
#The algorithm is the same as the uncommented version.

#Returns True if year is leap. Otherwise return False
def isLeap(year):
    return year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)

#Returns True if the month ends. Otherwise return False
def endOfMonth(month):
    return (month in months30 and day == 30) or (month in months31 and day == 31) or(month ==2 and day>=28 )
    
months30 = [4,6,9,11]
months31 = [1,3,5,7,8,10,12]
                
day = int(raw_input("Day: "))
month = int(raw_input("Month: "))
year = int(raw_input("Year: "))

#February 28 on leap years
if isLeap(year) and month ==2 and day ==28:
    day +=1
#When year ends
elif month == 12 and day == 31:
    day, month, year = 1, 1, year+1
#When month ends
elif endOfMonth(month):
    day, month = 1, month+1
else:
    day += 1
print "Date: %d/%d/%d" %(day, month, year)

        

