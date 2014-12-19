#!/bin/python

one = 0
two = 0

for x in range(1,101):
	one += x**2

print "one"
print one

for y in range(1,101):
	two += y

two = two**2
print
print "two"
print two
print
print two - one
