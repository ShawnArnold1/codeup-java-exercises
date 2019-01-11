import java.util.Scanner;

public class HighLow
{
    public static void main(String[] args) {
        highLow();
    }

    public static long highLow()
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean keepRunning = true;
        int computerNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Random number is " + computerNumber);
        System.out.println("Please guess the number!");
        int userNumber = sc.nextInt();
        int counter = 1;

        do {
            if (userNumber < computerNumber) {
                System.out.println("You must go higher!");
                System.out.println(counter);
                userNumber = sc.nextInt();
                counter++;
                keepRunning = true;
            }
            if (userNumber > computerNumber)
            {
                System.out.println("You must go lower!!");
                System.out.println(counter);
                userNumber = sc.nextInt();
                counter++;
                keepRunning = true;
            }
            if (userNumber == computerNumber)
            {
                System.out.println("Congratulations!!!!");
                keepRunning = false;
            }
            if( counter == 10)
            {
                keepRunning =false;
            }
        }
        while (keepRunning);
        return computerNumber;
    }
}

