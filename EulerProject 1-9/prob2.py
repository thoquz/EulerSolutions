#!/bin/python
#Euler project problem 2
# 2 May 2014 Philip Goosen

a = 1
b = 2

sum = 2
c=0

while c < 4000000:
	c = a+b
	a = b
	b = c
	
	if (c%2 == 0):
		print c
		print sum
		print "-----------"
		sum += c

print sum
