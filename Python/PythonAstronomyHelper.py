#Caravana, Ana Maricris A.
#BSCpE 1-1

#X - XIII - Programming Exercises
#   Python
#   1. Astronomy Helper

while True:
    print("Select a Planet:")
    print(" ")
    print("  1. Mercury")
    print(" ")
    print("  2. Venus")
    print(" ")
    print("  3. Earth")
    print(" ")
    print("  4. Mars")
    print(" ")
    print("  5. Exit the program")
    print(" ")
    choice = int(input("Please enter the number of the planet you selected: "))

    if choice == 1:
        print(" ")
        print("\tMERCURY:")
        print(" ")
        print("Average distance from the sun: 57.9 million kilometers")
        print(" ")
        print("Mass: 3.31 x 10^23kg")
        print(" ")
        print("Surface temperature: -173 to 430 degrees Celsius")
        print(" ")

    elif choice == 2:
        print(" ")
        print("\tVENUS:")
        print(" ")
        print("Average distance from the sun: 108.2 million kilometers")
        print(" ")
        print("Mass: 4.87 x 10^24kg")
        print(" ")
        print("Surface temperature: 472 degrees Celsius")
        print(" ")

    elif choice == 3:
        print(" ")
        print("\tEARTH:")
        print(" ")
        print("Average distance from the sun: 149.6 million kilometers")
        print(" ")
        print("Mass: 5.967 x 10^24kg")
        print(" ")
        print("Surface temperature: -50 to 50 degrees Celsius")
        print(" ")

    elif choice == 4:
        print(" ")
        print("\tMARS:")
        print(" ")
        print("Average distance from the sun: 227.9 million kilometers")
        print(" ")
        print("Mass: 0.6424 x 10^24kg")
        print(" ")
        print("Surface temperature: -140 to 20 degrees Celsius")
        print(" ")

    elif choice == 5:
        print(" ")
        print("\tExiting the program...")
        print(" ")
        break
    else:
        print(" ")
        print("\tInvalid choice, please try again.")
        print(" ")