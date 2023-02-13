/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

X - XIII - Programming Exercises
    C++
    2. Password Weakness Detector 
**********************************/

#include <iostream>

using namespace std;

int main() 
{
    string password;
    bool hasLowerCase = false;
    bool hasUpperCase = false;
    bool hasDigit = false;
    bool hasSpecialChar = false;
    bool isConsecutiveLowercase = false;
    bool isConsecutiveUppercase = false;
    bool isConsecutiveDigit = false;
    bool isRepeating = false;

    cout << " " << endl;
    cout << "Hello! This program Detects Password Weakness" << endl;
    cout << "If you want to continue" << endl;
    cout << "Please enter a password: ";
    cout << " " << endl;
    getline(cin, password);

    for (int i = 0; i < password.length(); i++) 
    {
        char character = password[i];
        if (islower(character)) 
        {
            hasLowerCase = true;
            if (i < password.length() - 1 && islower(password[i + 1]) 
                    && character == password[i + 1]) 
                    {
                isConsecutiveLowercase = true;
            }
        } else if (isupper(character)) 
        {
            hasUpperCase = true;
            if (i < password.length() - 1 && isupper(password[i + 1]) 
                    && character == password[i + 1]) 
                    {
                isConsecutiveUppercase = true;
            }
        } else if (isdigit(character)) 
        {
            hasDigit = true;
            if (i < password.length() - 1 && isdigit(password[i + 1]) 
                    && character == password[i + 1]) 
                    {
                isConsecutiveDigit = true;
            }
        } else if (!isalnum(character)) 
        {
            hasSpecialChar = true;
        }
        if (i < password.length() - 2 && password[i] == password[i + 1] 
                    && password[i + 1] == password[i + 2]) 
                    {
            isRepeating = true;
        }
    }
    if (password.length() < 8) 
    {
        cout << " " << endl;
        cout << "Password is too short" << "\n";
        cout << " " << endl;
    }
    if (!hasLowerCase || !hasUpperCase) 
    {
        cout << " " << endl;
        cout << "Password must contain at least one uppercase letter and one lowercase letter" << "\n";
        cout << " " << endl;
    }
    if (!hasDigit) 
    {
        cout << " " << endl;
        cout << "Password must contain at least one numeric digit" << "\n";
        cout << " " << endl;
    }
    if (!hasSpecialChar) 
    {
        cout << " " << endl;
        cout << "Password must contain at least one special character" << "\n";
        cout << " " << endl;
    }
    if (isConsecutiveLowercase) 
    {
        cout << " " << endl;
        cout << "Password cannot contain a sequence of consecutive lowercase letters" << "\n";
        cout << " " << endl;
    }
    if (isConsecutiveUppercase) 
    {
        cout << " " << endl;
        cout << "Password cannot contain a sequence of consecutive uppercase letters" << "\n";
        cout << " " << endl;
    }
    if (isConsecutiveDigit) 
    {
        cout << " " << endl;
        cout << "Password cannot contain a sequence of consecutive digits" << "\n";
        cout << " " << endl;
    }
    if (isRepeating) 
    {
        cout << " " << endl;
        cout << "Password cannot contain a repeating sequence of characters" << "\n";
        cout << " " << endl;
    }
    if (password.length() >= 8 && hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar 
        && !isConsecutiveLowercase && !isConsecutiveUppercase && !isConsecutiveDigit && !isRepeating) 
    {
        cout << " " << endl;
        cout << "Password is strong" << "\n";
        cout << " " << endl;
    }
    return 0;
}