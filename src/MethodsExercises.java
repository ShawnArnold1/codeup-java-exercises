import java.util.Scanner;

public class MethodsExercises
{
    public static void main(String[] args)
    {
        Scanner
                sc = new Scanner(System.in).useDelimiter("\n");
        System
                .out.println("Hello");
        System
                .out.println(doAddition(5, 10));
        System
                .out.println(doDivision(15, 94));
        System
                .out.println(doSubtraction(94, 43));
        System
                .out.println(doMultiplication(21, 4));
        System
                .out.println(doModulus(58, 6));

//        doBetween(1, 10);
////        System.out.println("Enter another number between 1 and 10 to get the factorial value!");
//
//        getFactorial(5);
//        diceRoll();
//        guessingGame();
    }

public static int doAddition( int num1, int num2 )
{
    return num1 + num2;
}

    public static int doSubtraction( int num1, int num2 )
    {
        return num1 - num2;
    }


    public static int doMultiplication( int num1, int num2 )
    {
        return num1 * num2;
    }

    public static int doDivision( int num1, int num2 )
    {
        return num1 / num2;
    }

    public static int doModulus(int num1, int num2)
    {
        return num1 % num2;
    }

    public static int doBetween(int numMin, int numMax)
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a number between number 1 and 10!");
        int userInput = sc.nextInt();

            if( userInput > numMin && userInput < numMax)
            {
                System.out.println("Your number has passed the test!");
            }
            else
                {
                    return doBetween(1, 10);
                }
            return userInput;
            }
//
//    public static int getFactorial(int num1)
//    {
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        int holder = 1;
//        System.out.println("Please enter another number between 1 and 10");
//        int userNumber = sc.nextInt();
//        if( userNumber < 1 && userNumber > 10)
//        {
//            System.out.println("Please enter a correct number");
//            userNumber = sc.nextInt();
//            getFactorial(userNumber);
//        }
//        for( int i = 1; i <= userNumber; i++ )
//        {
//
//            holder *= i;
//            System.out.println(holder);
//        }
//        return  getFactorial(userNumber);
//
//    }

    public static long diceRoll()
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter enter amount of sides for your dye!");
        int userChoice = sc.nextInt();
        System.out.println("You will now be rolled 2 " + userChoice + "sided dice");
        int side1 ;
        int side2 ;
        Boolean reRoll = false;
        System.out.println("Would you like to roll the dice?");
        String userContinue = sc.next();
        if( userContinue.equalsIgnoreCase("yes"))
        {
            do {
                side1 = (int) (Math.random() * userChoice) + 1;
                side2 = (int) (Math.random() * userChoice) + 1;
                System.out.println(side1);
                System.out.println(side2);
                System.out.println("Would you like to roll again?");
                String userReRoll = sc.next();
                if( userReRoll.equalsIgnoreCase("yes"))
                {
                    reRoll = false;
                }
                else
                {
                    reRoll = true;
                }

            }
            while(!reRoll);
        }
        return userChoice;
    }

    public static int rollDie(int side)
    {
        int random = (int) Math.ceil(Math.random() * side);
        return  random;
    }


    public static int rollTwoDice(int sides)
    {
        int firstNum = rollDie(sides);
        int secondNum = rollDie(sides);
        return firstNum + secondNum;
    }
//
//    public static int dndRoll(String input)
//    {
//        int indexOfD input.indexOf('d');
//        String
//    }

    public static boolean isVowel(String input)
    {
        if( input.length() > 1)
        {
            return false;
        }
        return input.equalsIgnoreCase("a") ||
        input.equalsIgnoreCase("e") ||
        input.equalsIgnoreCase("i") ||
        input.equalsIgnoreCase("o") ||
        input.equalsIgnoreCase("u");
    }

    public static boolean hasVowels(String input)
    {
        String letter = "";
        for( int i = 0; i < input.length(); i++)
        {
            letter = input.charAt(i) + "";
            if (isVowel(letter))
            {
                return true;
            }
        }
        return false;
    }

    public static int countVowels(String input)
    {
        int count = 0;
        String letter = "";
        for( int i = 0; i < input.length(); i++)
        {
            letter = input.charAt(i) + "";
            if(isVowel(letter))
            {
                count++;
            }
        }
        return count;
    }


//    public static int guessingGame() {
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        boolean keepRunning = true;
//        int computerNumber = (int) (Math.random() * 100) + 1;
//        System.out.println("Random number is " + computerNumber);
//               System.out.println("Please guess the number!");
//               int userNumber = sc.nextInt();
//
//        do
//           {
//
//            if (userNumber < computerNumber) {
//                System.out.println("You must go higher!");
//                userNumber = sc.nextInt();
//                keepRunning = true;
//            }
//             if (userNumber > computerNumber) {
//                System.out.println("You must go lower!!");
//                 userNumber = sc.nextInt();
//                 keepRunning = true;
//            }
//             if (userNumber == computerNumber) {
//                System.out.println("Congratulations!!!!");
//                keepRunning = false;
//            }
//            return computerNumber;
//        }
//            while(keepRunning);
//    }

//    public static int doBetween(int numMin, int numMax) {
//        boolean
//                runCondition = true;
//        do
//            {
//            Scanner
//                    sc = new Scanner(System.in).useDelimiter("\n");
//            System
//                    .out.println("Enter a number between 1 and 10");
//            int
//                    userNumber = sc.nextInt();
//
//            if (userNumber < 10 && userNumber > 1)
//            {
//                System
//                        .out.println("This number is between 1 and 10!");
//                System
//                        .out.println("Would you like to enter another number? (yes/no)");
//                String
//                        userRedo = sc.next();
//
//                if (userRedo.equalsIgnoreCase("yes")) {
//                    return doBetween(1, 10);
//                }
//                else
//                {
//                    System.out.println("Suhh");
//                    runCondition = false;
//                }
//            } else if (userNumber >= 10 || userNumber <= 1) {
//                System
//                        .out.println("This number is incorrect");
//            }
//            return doBetween(numMin, numMax);
//
//        }
//        while (runCondition);
    }
