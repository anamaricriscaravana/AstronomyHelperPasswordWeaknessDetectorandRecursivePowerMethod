#Caravana, Ana Maricris A.
#BSCpE 1-1

#X - XIII - Programming Exercises
#   Python
#   3. Recursive Power Method 

def main():
    print(" ")
    print ("Hello! This program calculate the Power using Recursion")
    print (" ")
    base = int(input("Please enter the number to be raised: "))
    print (" ")
    exponent = int(input("Please enter the exponent: "))

    print (" ")
    print(str(base) + " raised to " + str(exponent) + " is equal to " + str(power(base, exponent)))
    print (" ")
    print(str(base) + "^" + str(exponent) + " = " + str(power(base, exponent)))
    print (" ")

def power(base, exponent):
    if exponent == 0: return 1
    else: return base * power(base, exponent-1)

main()