#!/bin/python
from datetime import datetime

def prime_check(num):
	for x in range(2,num):
		if (num%x == 0):
			return False
	return True

#Using a innefective exaustive search by counting throught all numbers
# and using exaustive prime checker

target = int(raw_input("Enter number of prime to find: "))

count = 1
test = 1

startTime = datetime.now()

while (count < target):
	test += 2
	
	if ( prime_check(test) ):
		count += 1

print test
print("Time it took: " +str(datetime.now()-startTime) )	
	
