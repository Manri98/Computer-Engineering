from datetime import datetime, timedelta
print datetime.strptime(raw_input("Year: ") + " "+ raw_input("Month: ") +" "+ raw_input("Day: "), '%Y %m %d').date() + timedelta(days=1)
