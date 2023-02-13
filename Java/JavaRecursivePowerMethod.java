/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

X - XIII - Programming Exercises
    Java
    3. Recursive Power Method    
**********************************/

import java.util.Scanner;

public class JavaRecursivePowerMethod 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int base, exponent;

        System.out.println(" ");
        System.out.println("Hello! This program calculate the Power using Recursion");
        System.out.println(" ");
        System.out.println("Please enter the number to be raised: ");
        base = input.nextInt();

        System.out.println(" ");
        System.out.println("Please enter the exponent: ");
        exponent = input.nextInt();

        System.out.println(" ");
        System.out.println(base + " raised to " + exponent + " is equal to " + power(base, exponent));
        System.out.println(" ");
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
        System.out.println(" ");
        input.close();
    }
    public static int power(int base, int exponent) 
    {
        if (exponent == 0) return 1;
        else return base * power(base, exponent-1);
    }
}