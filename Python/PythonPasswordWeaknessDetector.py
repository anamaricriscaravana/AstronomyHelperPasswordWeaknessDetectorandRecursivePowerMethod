#Caravana, Ana Maricris A.
#BSCpE 1-1

#X - XIII - Programming Exercises
#   Python
#   2. Password Weakness Detector

print ("Hello! This program Detects Password Weakness")
print ("If you want to continue")
password = input("Please enter a password: ")
hasLowerCase = False
hasUpperCase = False
hasDigit = False
hasSpecialChar = False
isConsecutiveLowercase = False
isConsecutiveUppercase = False
isConsecutiveDigit = False
isRepeating = False

for i in range(len(password)):
    char = password[i]
    if char.islower():
        hasLowerCase = True
        if i < len(password) - 1 and password[i + 1].islower() and char == password[i + 1]:
            isConsecutiveLowercase = True
    elif char.isupper():
        hasUpperCase = True
        if i < len(password) - 1 and password[i + 1].isupper() and char == password[i + 1]:
            isConsecutiveUppercase = True
    elif char.isdigit():
        hasDigit = True
        if i < len(password) - 1 and password[i + 1].isdigit() and char == password[i + 1]:
            isConsecutiveDigit = True
    elif not char.isalnum():
        hasSpecialChar = True
    if i < len(password) - 2 and password[i] == password[i + 1] and password[i + 1] == password[i + 2]:
        isRepeating = True

if len(password) < 8:
    print (" ")
    print("Password is too short")
    print (" ")
if not hasLowerCase or not hasUpperCase:
    print (" ")
    print("Password must contain at least one uppercase letter and one lowercase letter")
    print (" ")
if not hasDigit:
    print (" ")
    print("Password must contain at least one numeric digit")
    print (" ")
if not hasSpecialChar:
    print (" ")
    print("Password must contain at least one special character")
    print (" ")
if isConsecutiveLowercase:
    print (" ")
    print("Password cannot contain a sequence of consecutive lowercase letters")
    print (" ")
if isConsecutiveUppercase:
    print (" ")
    print("Password cannot contain a sequence of consecutive uppercase letters")
    print (" ")
if isConsecutiveDigit:
    print (" ")
    print("Password cannot contain a sequence of consecutive digits")
    print (" ")
if isRepeating:
    print (" ")
    print("Password cannot contain a repeating sequence of characters")
    print (" ")
if len(password) >= 8 and hasLowerCase and hasUpperCase and hasDigit and hasSpecialChar and not isConsecutiveLowercase and not isConsecutiveUppercase and not isConsecutiveDigit and not isRepeating:
    print (" ")
    print("Password is strong")
    print (" ")