import java.util.Scanner;

public class MethodsPractice
{

    public static void main(String[] args)
    {
//        firstChar();
//        secondChar();
//        secondToLastChar();
            continueYN();
            isEven();
    }
    public static String firstChar()
    {
        String holder = "Hello";
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a word! Type EXIT to stop program");
        boolean keepRunning = true;
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

    public static String continueYN() {
        String holder = "kek";
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = false;
        System.out.println("Would you like to continue? (yes/no),(y/n)");
        String userInput = sc.next();

        do {
            if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"))
            {
                System.out.println("Continuing!");
                keepRunning = true;
                userInput = sc.next();
            }
            else
                {
                    keepRunning = false;
                }
        }
        while(keepRunning);
        return holder;
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
                System
                        .out.println( userString.charAt(userString.length() -2 ));
            }
        }
        while(keepRunning);
        return holder;
    }

    public static boolean isEven()
    {
        boolean
                holder = true;
        Scanner
                sc = new Scanner(System.in).useDelimiter("\n");
        System
                .out.println("Enter a number and I will tell you if it's even or not!");
        int
                userInput = sc.nextInt();
        if( userInput % 2 == 0)
        {
            System
                    .out.println("This number is even!");
            isEven();
        }
        else
        {
            System
                    .out.println("This number isn't even.");
            continueYN();
        }

        return holder;
    }

}
