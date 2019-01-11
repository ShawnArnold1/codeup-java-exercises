import java.util.Scanner;

public class ControlFlowExercises
{
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15)
//        {
//            System
//                  .out
//                  .println(i);
//            i++;
//        }

//
//        int ii = 5;

        for (int ii = 5; ii < 15; ii++) {
            System
                    .out
                    .println(ii);
        }


        int b = 0;


        do {
            System
                    .out
                    .println(b);
            b += 2;
        }
        while (b <= 100);


        int c = 100;

        for (int l = 100; l >= -10; l--) {
            System
                    .out
                    .println(l);
        }

        do {
            System
                    .out
                    .println(c);
            c -= 5;
        }
        while (c >= -10);


        long a = 2;

        do {
            System
                    .out
                    .println(a);
            a = a * a;
        }
        while (a <= 1000000);


        Scanner testScan = new Scanner(System.in).useDelimiter("\n");

        System
                .out
                .println("What number would you like to go up to?");

        Integer
                upToNumber = testScan.nextInt();

        System
                .out
                .println("number | squared | cubed");
        System
                .out
                .println("------ | ------- | -----");


        for (int i = 0; i <= upToNumber; i++) {
            int i1 = i * i;
            int i2 = i * i * i * i;
            System
                    .out
                    .println(i + "         |" + i1 + "        |" + i2);
//            System
//                   .out
//                    .println();
//            System
//                    .out
//                        .println();
        }


        System
              .out
              .println("Enter your numeric grade here");

        Integer
                numGrade = testScan.nextInt();

        System
                .out
                .println("Are you sure you would like to continue?");
        String
                userResponse = testScan.next();
        if( userResponse.contains("yes"))
        {
            if (numGrade <= 59)
            {
                System
                        .out
                        .println("You are a F, for failure you!");
            } else if (numGrade < 66 && numGrade > 60) {
                System
                        .out
                        .println("Your grade is a D");
            } else if (numGrade <= 79 && numGrade >= 67) {
                System
                        .out
                        .println("Your grade is a C!");
            } else if (numGrade <= 87 && numGrade >= 80) {
                System
                        .out
                        .println("You are passing with a B!!");
            }
        }


//        String fizzBuzz = "";
//        for( int j =0;j <= 100; j++)
//        {
//            if( j % 3 == 0)
//            {
//                fizzBuzz += "Fizz!";
//            }
//            if( j % 5 == 0)
//            {
//                fizzBuzz += "Buzz!";
//            }
//            if ( j % 3 == 0 && j % 5 == 0)
//            {
//                fizzBuzz += "FIZZ BUZZ YA BOI";
//            }
//            System
//                    .out
//                    .println(fizzBuzz);
//            fizzBuzz = "";
//        }
//






    }
}

