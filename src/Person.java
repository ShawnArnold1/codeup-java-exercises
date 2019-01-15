public class Person
{
    private String name;

    public String getName()
    {
        return name;
    }

    public Person(String name)
    {
        setName(name);
    }

    public static void main(String[] args)
    {
        Person shawn = new Person("Shawn");
        Person Aziz = new Person("Aziz");
        Aziz.sayHello();
        shawn.sayHello();
        Person person1 = new Person("Shawny");
        person1.sayHello();
    }

    public void sayHello()
    {
        System.out.println("Hello, " + name + "!");
    }


    public void setName(String name)
    {
        this.name = name;
    }
}
