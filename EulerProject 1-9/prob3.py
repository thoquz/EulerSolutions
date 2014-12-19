#!/bin/python

def prime_check(num):
	for k in range(2,num):
		if (num%2 == 0):
			return False
	return True

def next_prime(start):
	while (True):	
		counter = start+15

		if (counter%2 == 0):
			counter += 1

		for j in range(start+1, counter):
			if ( prime_check(j) ):
				return j
prime = 2

value = int(raw_input("Please enter a number: "))

factors = ""

while (value > 1):
	if (value%prime == 0):
		value = value/prime
		factors += " " + str(prime)
	else:
		prime = next_prime(prime)

print factors

	
