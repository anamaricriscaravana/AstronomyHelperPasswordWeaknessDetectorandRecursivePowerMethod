/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

X - XIII - Programming Exercises
    C++
    1. Astronomy Helper  
**********************************/

#include <iostream>
using namespace std;

int main() 
{
    int choice = 0;
    while (choice != 5) 
    {
        cout << " " << endl;
        cout << "Select a Planet:" << endl;
        cout << " " << endl;
        cout << "  1. Mercury" << endl;
        cout << " " << endl;
        cout << "  2. Venus" << endl;
        cout << " " << endl;
        cout << "  3. Earth" << endl;
        cout << " " << endl;
        cout << "  4. Mars" << endl;
        cout << " " << endl;
        cout << "  5. Exit the program" << endl;
        cout << " " << endl;
        cout << "Please enter the number of your selected Planet: ";
        cin >> choice;
        switch (choice) 
        {
            case 1:
                cout << " " << endl;
                cout << "\tMERCURY:" << endl;
                cout << " " << endl;
                cout << "Average distance from the sun: 57.9 million kilometers" << endl;
                cout << " " << endl;
                cout << "Mass: 3.31 x 10^23kg" << endl;
                cout << " " << endl;
                cout << "Surface temperature: -173 to 430 degrees Celsius" << endl;
                cout << " " << endl;
                break;
            case 2:
                cout << " " << endl;
                cout << "\tVENUS:" << endl;
                cout << " " << endl;
                cout << "Average distance from the sun: 108.2 million kilometers" << endl;
                cout << " " << endl;
                cout << "Mass: 4.87 x 10^24kg" << endl;
                cout << " " << endl;
                cout << "Surface temperature: 472 degrees Celsius" << endl;
                 cout << " " << endl;
                break;
            case 3:
                cout << " " << endl;
                cout << "\tEARTH:" << endl;
                cout << " " << endl;
                cout << "Average distance from the sun: 149.6 million kilometers" << endl;
                cout << " " << endl;
                cout << "Mass: 5.967 x 10^24kg" << endl;
                cout << " " << endl;
                cout << "Surface temperature: -50 to 50 degrees Celsius" << endl;
                cout << " " << endl;
                break;
            case 4:
                cout << " " << endl;
                cout << "\tMARS:" << endl;
                cout << " " << endl;
                cout << "Average distance from the sun: 227.9 million kilometers" << endl;
                cout << " " << endl;
                cout << "Mass: 0.6424 x 10^24kg" << endl;
                cout << " " << endl;
                cout << "Surface temperature: -140 to 20 degrees Celsius" << endl;
                cout << " " << endl;
                break;
            case 5:
                cout << " " << endl;
                cout << "\tExiting the program..." << endl;
                cout << " " << endl;
                break;
            default:
                cout << " " << endl;
                cout << "\tInvalid choice, please try again." << endl;
cout << " " << endl;
        }
    }
    return 0;
}