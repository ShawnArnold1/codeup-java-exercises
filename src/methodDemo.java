public class methodDemo
{
    // Visibility (public, protected, private)
    // static vs. instance (static keyword or no static keyword)
    // for now, static means "just a function"
    // return type of the method (int, boolean, String, void)
    // name of the method
    // paremeters in parenthesis
    // b/c java is strictly typed, we need to provide types
    public static void main(String[] args)
    {
        String name = "Pat";
        String output = sayHi(name);
        System.out.println(output);
    }

    public static String sayHi(String name)
    {
        return "Hi There, " + name;
    }
}
