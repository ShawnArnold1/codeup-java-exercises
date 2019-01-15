//package util;
//
//import java.util.Scanner;
//
//public class Input
//{
//    private  Scanner sc = new Scanner(System.in).useDelimiter("\n");
//    public String getString()
//        {
//            System.out.println("Enter a string and I will return it with MAGIC!");
//            String userString = sc.next();
//            System.out.println(userString);
//            return userString;
//        }
//
////    public static
//
//    public boolean yesNo()
//        {
//            boolean yesNoBool;
//            System.out.println("I will respond true to yes/y and false to anything else!");
//            String userInput = sc.next();
//        if( userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y" ))
//            {
//                yesNoBool = true;
//                System.out.println("True");
//                return yesNoBool;
//            }
//        else
//            {
//                yesNoBool = false;
//                System.out.println("false");
//            }
//            return yesNoBool;
//        }
//
//
//    public int getInt(int min, int max)
//        {
//            System.out.println("Guess the number between " + min + " and " + max + "!");
//            int userInt = sc.nextInt();
//        if( userInt > min && userInt < max)
//            {
//                System.out.println(userInt);
//                return userInt;
//            }
//        else
//            {
//                getInt(min, max);
//            }
//        return userInt;
//        }
//
//    public int getInt()
//        {
//            System.out.println("Give me a number pretty please");
//            int userInt = sc.nextInt();
//            System.out.println(userInt);
//        if( userInt >= 100 )
//            {
//                getInt();
//            }
//            return userInt;
//        }
//
//    public double getDouble(double min, double max)
//    {
//        System.out.println("Give me a fancy double and I will will allow you \nto break free from this loop if you guess between my double doubles!");
//        double userDouble = sc.nextDouble();
//        if(userDouble <= min || userDouble >= max )
//            {
//                getDouble(min, max);
//            }
//        else
//            {
//                System.out.println("Congrats, you may pass!");
//                return userDouble;
//            }
//        return userDouble;
//    }
//
//    public double getDouble()
//        {
//            System.out.println("Enter a double and I will return it it to you!");
//            double userDouble = sc.nextDouble();
//            System.out.println(userDouble);
//            return userDouble;
//        }
//}


package util;

import java.util.Scanner;

public class Input {
    Scanner scanner;

    // constructor returns an Input object
    public Input() {
        scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public boolean yesNo() {
        String input = getString();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if(userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("The integer must be between " + min + " and " + max);
            return getInt(min, max);
        }
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

    public String getString() {
        return scanner.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if(userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("The double must be between " + min + " and " + max);
            return getDouble(min, max);
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }
}