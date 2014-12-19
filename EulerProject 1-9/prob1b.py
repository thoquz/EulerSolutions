#!/bin/python
# re-attempt to make a more elegant solution
max = int(raw_input("Please enter a number: "))
answer = 0

for x in range(1,max):	
	
	if 0 == x%3 or 0 == x%5:
		answer += x
print  answer
