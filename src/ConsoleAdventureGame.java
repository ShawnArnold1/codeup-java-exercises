import java.util.Scanner;

public class ConsoleAdventureGame
{
    public static void main(String[] args)
    {
        Scanner
                sc = new Scanner(System.in).useDelimiter("\n");

        System
                .out.println("What is your name, hero?");
        String
                heroName = sc.next();
        System
                .out.println("Dare to start your quest, " + heroName + " ?");
        String
                startGameValue = sc.next();
        int
                heroHealth = 150;
//        int
//                heroArmour = 50;
        int
                potionValue = 10;
        int
                heroDamage = 10;
        String
                enemyName = "Vaughn";
        int
                enemyHealth = 100;
        int
                enemyDamage = 12;

        if( startGameValue.equalsIgnoreCase("yes")) {
            System
                    .out.println("Here are your stats Hero " + heroName + "!");
            System
                    .out.println("Your health: " + heroHealth + " \n" + "Your damage is: " + heroDamage + "\n" + "Amount of Health Potions: " + potionValue);
            System
                    .out.println("------------------------");
            System
                    .out.println("Your enemy is one of the Seven Deadly Sins, Vaughn!");
            System
                    .out.println("Vaughn's health: " + enemyHealth);
            System
                    .out.println("Vaughn's damage is: " + enemyDamage);
            System
                    .out.println("-----------------------");
            boolean
                    gameStart;
            do
                {
                    gameStart = ( enemyHealth <= 0 && heroHealth <= 0);

                System
                        .out.println("What would you like to do, " +heroName + "?");
                System
                        .out.println("1) Attack your enemy! \n2) Heal yourself! \n3) Run away like a coward");
                String
                        heroAction = sc.next();
                if( Integer.parseInt(heroAction) == 1)
                {
                    System
                            .out.println("POW!");
                    enemyHealth -= 10;
                    System
                            .out.println("You have attacked " + enemyName + " for " +heroDamage + " damage!" + "\n" + heroName + ": " + heroHealth + " health!" + "\n" + enemyName + ": " + enemyHealth + " health!");
                    System
                            .out.println("----------------");
                }
            }
            while( heroHealth > 0 && enemyHealth > 0 );
        }
        else
        {
            System
                    .out.println("Guess you aren't strong enough.... Pitiful");
        }
    }
}
