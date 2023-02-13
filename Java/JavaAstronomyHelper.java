/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

X - XIII - Programming Exercises
    Java
    1. Astronomy Helper  
**********************************/

import java.util.Scanner;

public class JavaAstronomyHelper 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) 
        {
            System.out.println(" ");
            System.out.println("Select a Planet:");
            System.out.println(" ");
            System.out.println("1. Mercury");
            System.out.println(" ");
            System.out.println("2. Venus");
            System.out.println(" ");
            System.out.println("3. Earth");
            System.out.println(" ");
            System.out.println("4. Mars");
            System.out.println(" ");
            System.out.println("5. Exit the program");
            System.out.println(" ");
            System.out.print("Please enter the number of the planet you selected: ");
            System.out.println(" ");
            choice = input.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println(" ");
                    System.out.println("\tMERCURY:");
                    System.out.println(" ");
                    System.out.println("Average distance from the sun: 57.9 million kilometers");
                    System.out.println(" ");
                    System.out.println("Mass: 3.31 x 10^23kg");
                    System.out.println(" ");
                    System.out.println("Surface temperature: -173 to 430 degrees Celsius");
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println("\tVENUS:");
                    System.out.println(" ");
                    System.out.println("Average distance from the sun: 108.2 million kilometers");
                    System.out.println(" ");
                    System.out.println("Mass: 4.87 x 10^24kg");
                    System.out.println(" ");
                    System.out.println("Surface temperature: 472 degrees Celsius");
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println("\tEARTH:");
                    System.out.println(" ");
                    System.out.println("Average distance from the sun: 149.6 million kilometers");
                    System.out.println(" ");
                    System.out.println("Mass: 5.967 x 10^24kg");
                    System.out.println(" ");
                    System.out.println("Surface temperature: -50 to 50 degrees Celsius");
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println(" ");
                    System.out.println("\tMARS:");
                    System.out.println(" ");
                    System.out.println("Average distance from the sun: 227.9 million kilometers");
                    System.out.println(" ");
                    System.out.println("Mass: 0.6424 x 10^24kg");
                    System.out.println(" ");
                    System.out.println("Surface temperature: -140 to 20 degrees Celsius");
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println(" ");
                    System.out.println("\tExiting the program...");
                    System.out.println(" ");
                    break;

                default:
                    System.out.println(" ");
                    System.out.println("\tInvalid choice, please try again.");
                    System.out.println(" ");
            }
        }
        input.close();
    }
}