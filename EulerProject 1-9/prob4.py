#!/bin/python

#function to check if number is palindrome (same number if reversed)

def rev_check(num):
	if ( str(num) == ''.join(reversed(str(num))) ):
		return True
	return False

max = 0
for x in range(100,1000):
	for y in range(x, 1000):
		if ( rev_check(x*y) ):
			if ( max < x*y):
				max = x*y
				print "Found: " + str(max)
				print "Using:" + str(x) + "*" + str(y)
