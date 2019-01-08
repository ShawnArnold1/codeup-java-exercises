import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {
        String myString = "Make violence not war";
        int myFavoriteNumber = 1337;
        float myNumber;
        System.out.println("Hello World");
        System.out.println(myFavoriteNumber);
        System.out.println(myString);
        myNumber = 3.14F;
        System.out.println(myNumber);
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";


//        int x = 4;
//        x += 5;


//        int x = 3;
//        int y = 4;
//        x+=20
//        y*=x;

//        System.out.println(y);


        int x = 10;
        int y = 2;
        x/=y;
        y -=x;

        System.out.println(x);
        System.out.println(y);

        double pi = 3.14159;


        System.out.format("The Value of Pie is approximately: %f%n ", pi);

        Scanner testScan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("EnterSomething: ");
        Integer userInput = testScan.nextInt();
        System.out.println("You have entered: --> \"" + userInput + "\" <--");


        System.out.println("Enter three words please: ");
        String userString1 = testScan.next();
        String userString2 = testScan.next();
        String userString3 = testScan.next();
        System.out.format("You have entered: --> %s, %s, %s", userString1, userString2, userString3);

        System.out.println("Enter a sentence");











    }
}

