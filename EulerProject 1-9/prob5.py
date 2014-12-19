#!/bin/python

def div_check(number, divisors):
	for x in range(1, divisors):
		if (number%x != 0):
			return False
	return True

divisors = int(raw_input("Please to which divisors to check: "))

solve = True
counter = 0

while (solve):
	counter += 1
	
	if ( div_check(counter, divisors) ):
		print "Smallest number: " + str(counter)
		solve = False	
