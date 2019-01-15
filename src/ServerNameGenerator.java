public class ServerNameGenerator
    {

        public static void main(String[] args)
        {
        String[] arrayOfNouns = {"table", "gun", "duck", "JEEP", "money", "JUGS", "BoneThugs", "GangWars", "Eye", "Illuminati"};
        String[] arrayOfAdj = {"Fat", "furry", "yummy", "hideous", "Ginger", "Golden", "pimpin", "smashed", "moist", "grool"};

            System.out.print(randomServerNames(arrayOfAdj));
            System.out.print("-");
            System.out.print(randomServerNames(arrayOfNouns));
        }

        public static String randomServerNames(String[] randomArray)
        {
            int randomIndex = (int) (Math.random() * 9) + 1;
            return randomArray[randomIndex];
        }
    }
