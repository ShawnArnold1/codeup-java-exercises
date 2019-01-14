import java.util.Scanner;

public class MethodsPractice
{

    public static void main(String[] args)
    {
//        firstChar();
//        secondChar();
//        secondToLastChar();
//            continueYN();
//            isEven();
//        countEvens();
//        isOdd(5);
//        countOdds();
//        oddEven();
//        isVowel("a");
        hasVowels("Mckayla means the world to me");
//        fizzBuzz();
    }
    public static String firstChar()
    {
        String holder = "Hello";
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a word! Type EXIT to stop program");
        boolean
                keepRunning = true;
        do
            {
                String userString = sc.next();

                if (userString.equals("EXIT"))
                    {
                        keepRunning = false;
                    }
                else
                    {
                        System.out.println(userString.charAt(0));
                     }

            }
            while(keepRunning);
        return holder;
    }

    public static String secondChar()
    {
        String holder = "Hello";
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a word to get the 2nd char. EXIT to break free");
        boolean keepRunning = true;
        do
            {
                String userString = sc.next();
                if( userString.equals("EXIT"))
                    {
                        keepRunning = false;
                    }
                else
                {
                    System.out.println(userString.charAt(1));
                }
            }
            while(keepRunning);

        return holder;
    }

    public static boolean continueYN() {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = false;
        System.out.println("Would you like to continue? (yes/no),(y/n)");
        String userInput = sc.next();
            if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"))
            {
                System
                        .out.println("Continuing!");
                keepRunning = true;
            }
            else
                {
                    keepRunning = false;
                }
        System.out.println(keepRunning);
        return keepRunning;
        }

//
//    public static boolean exitProgram()
//    {
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        boolean
//        System.out.println("Type EXIT to exit out of the program");
//        String userInput = sc.next();
//        if( userInput.equals("EXIT"))
//        {
//
//        }
//    }

    public static String lastChar()
    {
        String holder = "Hello";
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a word to receive final char. Type EXIT to break free");
        boolean keepRunning = true;
        do
            {
                String userString = sc.next();
                if( userString.equals("EXIT"))
                {
                    keepRunning = true;
                }
                else
                {
                    System.out.println( userString.charAt(userString.length() -1 ));
                }
            }
        while(keepRunning);
        return holder;
    }

    public static String secondToLastChar()
    {
        String holder = "lol";
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a word to receive final char. Type EXIT to break free");
        boolean keepRunning = true;
        do
        {
            String userString = sc.next();
            if( userString.equals("EXIT"))
            {
                keepRunning = true;
            }
            else
            {
                System.out.println( userString.charAt(userString.length() -2 ));
            }
        }
        while(keepRunning);
        return holder;
    }

    public static boolean isOdd(int num1)
    {
        boolean holder =true;
        if( num1 %  2 == 1 )
        {
            System.out.println("Odd! " +num1);
        }
        return holder;
    }


    public static boolean isEven(int num1)
    {
        boolean holder = true;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
            if( num1 % 2 == 0)
            {
                System.out.println("Even! " + num1);

            }
        return holder;
    }

    public static int countEvens()
    {
        int holder = 0;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter 2 numbers to gather the odds!");
        String userInput = sc.nextLine();
        String[] newUserInput = userInput.split(" ");
        int newUserInt1 = Integer.parseInt(newUserInput[0]);
        int newUserInt2 = Integer.parseInt(newUserInput[1]);
        System.out.println(newUserInt1);
        System.out.println(newUserInt2);
        for( int i = newUserInt1; i < newUserInt2; i++)
        {
            isEven(i);
        }
        return holder;
    }

    public static int countOdds()
    {
        int holder = 0;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter 2 numbers to gather the odds!");
        String stringNumber = sc.next();
        String[] arrayNumber = stringNumber.split(" ");
        int userNumber2 = Integer.parseInt(arrayNumber[1]);
        int userNumber1 = Integer.parseInt(arrayNumber[0]);
        for( int i = userNumber1; i < userNumber2; i++)
        {
            isOdd(i);
        }
        return holder;
    }

    public static int oddEven()
    {
        int holder = 1;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter 2 numbers to find out if it's odd or even!");
        String stringNumber = sc.next();
        String[] arrayNumber = stringNumber.split(" ");
        int userNum1 = Integer.parseInt(arrayNumber[0]);
        int userNum2 = Integer.parseInt(arrayNumber[1]);
        for( int i = userNum1; i < userNum2; i++)
        {
            isOdd(i);
            isEven(i);
        }
        return holder;
    }


    public static boolean isVowel(String letter) {
        boolean isVowels = false;
        if (letter.length() > 1) {
            return false;
        }
        if (letter.equalsIgnoreCase("a")
                || letter.equalsIgnoreCase("i")
                || letter.equalsIgnoreCase("e")
                || letter.equalsIgnoreCase("o")
                || letter.equalsIgnoreCase("u"))
        {
            System.out.println("Vowel!" + letter);
            isVowels = true;
        }
        return isVowels;
    }

    public static String hasVowels(String userString)
    {
        int counter = 0;
        String[] arrayInput = userString.split("");
        for ( int i = 0; i < arrayInput.length; i++)
        {
            if(isVowel(arrayInput[i]))
            {
                counter += 1;
            }
        }
        System.out.println(counter);
        return userString;
    }


    //    public static String hasVowels()
//    {
//        String holder = "hello";
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Please enter words or phrase to find out the vowels");
//        String userStringInput = sc.next();
//        String[] arrayInput = userStringInput.split("");
//        for ( int i = 0; i < arrayInput.length; i++)
//        {
//            isVowel(arrayInput[i]);
//        }
//        return holder;
//    }
//
//    public static String countVowels(String userSting)
//    {
//
//    }

    public static int fizzBuzz()
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a number and I will fizzBuzz up to it!");
        int userInput = sc.nextInt();
        int counter = 1;
        if (counter <= userInput) {
            if (counter % 3 == 0) {
                System.out.println("Fizz!");
                counter++;
            } else if (counter % 5 == 0) {
                System.out.println("Buzz!");
                counter++;
            } else if (counter % 3 == 0 && userInput % 5 == 0) {
                System.out.println("Fizz Buzz!");
                counter++;
            } else {
                System.out.println(userInput);
            }
        }
        return counter;
    }

}
