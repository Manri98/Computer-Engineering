months30, months31 = [4,6,9,11], [1,3,5,7,8,10,12]                
day, month, year = int(raw_input("Day: ")), int(raw_input("Month: ")), int(raw_input("Year: "))
if (year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)) and month ==2 and day ==28:
    day +=1
elif month == 12 and day == 31:
    day, month, year = 1, 1, year+1
elif (month in months30 and day == 30) or (month in months31 and day == 31) or(month ==2 and day>=28):
    day, month = 1, month+1
else:
    day += 1
print "Date: %d/%d/%d" %(day, month, year)
