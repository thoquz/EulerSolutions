#!/bin/python

max = int(raw_input("Please enter a number: "))
answer = 0

for x in range(1,max+1):
	if max > (x*3):
		answer += x*3
		
	if max > (x*5):
		answer += x*5
		
	
	if 0 == (x%3 or x%5):
		answer -= x

print answer
