//import util.Input;
//
//public class InputTest
//{
//    public static void main(String[] args)
//    {
//        Input input = new Input();
////        input.getString();
////        input.yesNo();
////        input.getInt(1, 100);
////        input.getInt();
//        input.getDouble(1.5, 10.5);
//    }
//}


import util.Input;

public class InputTest {
    public static void main(String[] args) {
        // dataType variableName = new ClassName();
        Input input = new Input();

        if(input.yesNo("Do you want to enter a number?")) {
            int favoriteNumber = input.getInt("What is your favorite number?");
            System.out.println("You said " + favoriteNumber);

        }

        if(input.yesNo("Do you want to exit the application?")) {
            System.exit(0);
        }

        String name = input.getString("What is your name?");
        System.out.println("Hello, " + name + "!");

    }
}