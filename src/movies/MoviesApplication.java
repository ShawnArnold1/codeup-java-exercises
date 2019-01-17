package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication
{

    public static Movie[] moviesArray = MoviesArray.findAll();

    public static void main(String[] args)
    {
        boolean keepAsking = false;
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        do
        {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
            Input myInput = new Input();

            int userInput = myInput.getInt();
            if (userInput == 1) {
                for (int i = 0; i < moviesArray.length; i++) {
                    System.out.println(moviesArray[i].getName() + " is " + moviesArray[i].getCatagorey());
                }


            }
            else if (userInput == 2) {
                for (int i = 0; i < moviesArray.length; i++)
                {
                    if (moviesArray[i].getCatagorey().equals("animated"))
                        System.out.println("Catagorey for this movie is " + moviesArray[i].getCatagorey());
                }

            }
            else if (userInput == 3)
            {
                for (int i = 0; i < moviesArray.length; i++)
                {
                    if (moviesArray[i].getCatagorey().equals("drama"))
                        System.out.println("Movie " + i + " is a " + moviesArray[i].getCatagorey());
                }

            }
            else if (userInput == 4) {
                for (int i = 0; i < moviesArray.length; i++)
                {
                    if (moviesArray[i].getCatagorey().equals("horror"))
                        System.out.println("Movie " + i + " is a " + moviesArray[i].getCatagorey());
                }

            }
            else if (userInput == 5) {
                for (int i = 0; i < moviesArray.length; i++)
                {
                    if (moviesArray[i].getCatagorey().equals("scifi"))
                        System.out.println("Movie " + i + " is a " + moviesArray[i].getCatagorey());
                }
            }
            System.out.println("Would you like to continue?");
            keepAsking = myInput.yesNo();
        }
        while (keepAsking);
    }
}
