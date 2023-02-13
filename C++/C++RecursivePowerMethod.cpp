/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

X - XIII - Programming Exercises
    C++
    3. Recursive Power Method 
**********************************/

#include <iostream>

using namespace std;

int power(int base, int exponent);

int main() {
    int base, exponent;
    cout << " " << endl;
    cout << "Hello! This program calculate the Power using Recursion" << endl;
    cout << " " << endl;
    cout << "Please enter the number to be raised: ";
    cout << " " << endl;
    cin >> base;
    cout << " " << endl;
    cout << "Please enter the exponent: ";
    cout << " " << endl;
    cin >> exponent;

    cout << " " << endl;
    cout <<base << " raised to " << exponent << " is equal to " << power(base, exponent) << "\n";
    cout << " " << endl;
    cout <<base << "^" << exponent << " = " << power(base, exponent);
    cout << " " << endl;
    return 0;
}
int power(int base, int exponent) 
{
    if (exponent == 0) return 1;
    else return base * power(base, exponent-1);
}