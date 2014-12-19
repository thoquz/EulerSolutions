import math

max = 1000
for a in range(1,max):
	for b in range(a+1,max):
		c = math.sqrt(a**2 + b**2)
		
		if (c%1 ==0):
			if (a+b+c == 1000):
				print "Triplet found!:  a=" + str(a) + " b=" + str(b)+ " c=" + str(c)
				print "Product abc: " + str(a*b*c)
