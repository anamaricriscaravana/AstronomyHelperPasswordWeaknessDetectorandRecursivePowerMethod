/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

X - XIII - Programming Exercises
    Java
    2. Password Weakness Detector
**********************************/

import java.util.Scanner;

public class JavaPasswordWeaknessDetector 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! This program Detects Password Weakness");
        System.out.println("If you want to continue");
        System.out.println("Please enter a password: ");
        String password = input.nextLine();

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        boolean isConsecutiveLowercase = false;
        boolean isConsecutiveUppercase = false;
        boolean isConsecutiveDigit = false;
        boolean isRepeating = false;

        for (int i = 0; i < password.length(); i++) 
        {
            char character = password.charAt(i);
            if (Character.isLowerCase(character)) 
            {
                hasLowerCase = true;
                if (i < password.length() - 1 && Character.isLowerCase(password.charAt(i + 1)) && character == password.charAt(i + 1)) 
                {
                    isConsecutiveLowercase = true;
                }
            } else if (Character.isUpperCase(character)) 
            {
                hasUpperCase = true;
                if (i < password.length() - 1 && Character.isUpperCase(password.charAt(i + 1)) && character == password.charAt(i + 1)) 
                {
                    isConsecutiveUppercase = true;
                }
            } else if (Character.isDigit(character)) 
            {
                hasDigit = true;
                if (i < password.length() - 1 && Character.isDigit(password.charAt(i + 1)) && character == password.charAt(i + 1)) 
                {
                    isConsecutiveDigit = true;
                }
            } else if (!Character.isLetterOrDigit(character)) 
            {
                hasSpecialChar = true;
            }
            if (i < password.length() - 2 && password.charAt(i) == password.charAt(i + 1) && password.charAt(i + 1) == password.charAt(i + 2)) 
            {
                isRepeating = true;
            }
        }
        if (password.length() < 8) 
        {
            System.out.println(" ");
            System.out.println("Password is too short");
            System.out.println(" ");
        }
        if (!hasLowerCase || !hasUpperCase) 
        {
            System.out.println(" ");
            System.out.println("Password must contain at least one uppercase letter and one lowercase letter");
            System.out.println(" ");
        }
        if (!hasDigit) 
        {
            System.out.println(" ");
            System.out.println("Password must contain at least one numeric digit");
            System.out.println(" ");
        }
        if (!hasSpecialChar) 
        {
            System.out.println(" ");
            System.out.println("Password must contain at least one special character");
            System.out.println(" ");
        }
        if (isConsecutiveLowercase) 
        {
            System.out.println(" ");
            System.out.println("Password cannot contain a sequence of consecutive lowercase letters");
            System.out.println(" ");
        }
        if (isConsecutiveUppercase) 
        {
            System.out.println(" ");
            System.out.println("Password cannot contain a sequence of consecutive uppercase letters");
            System.out.println(" ");
        }
        if (isConsecutiveDigit) 
        {
            System.out.println(" ");
            System.out.println("Password cannot contain a sequence of consecutive digits");
            System.out.println(" ");
        }
        if (isRepeating) 
        {
            System.out.println(" ");
            System.out.println("Password cannot contain a repeating sequence of characters");
            System.out.println(" ");
        }
        if (password.length() >= 8 && hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar && !isConsecutiveLowercase && 
            !isConsecutiveUppercase && !isConsecutiveDigit && !isRepeating) 
            {
            System.out.println(" ");
            System.out.println("Password is strong");
            System.out.println(" ");
        }
        input.close();
    }
}