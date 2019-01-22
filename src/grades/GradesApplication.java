package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication
{
    public static void main(String[] args)
    {
        Input s = new Input();
        HashMap<String, Student> students = new HashMap<>();
        Student makeVio = new Student("MakeVio");
//        Student student1 = new Student("Tristy");
//        Student student2 = new Student("Devin");
//        Student student3 = new Student("CheesePuffs");
//        Student student4 = new Student("Skiller");
        students.put("TopDogT", new Student("Tristy"));
        students.put("BadMamaJama",new Student("Devin"));
        students.put("Cheese_Puffs", new Student("Cheese_Puffs"));
        students.put("ShadowBornHunter", new Student("Skiller"));
        students.get("TopDogT").addGrades(100);
        students.get("TopDogT").addGrades(100);
        students.get("TopDogT").addGrades(100);
        students.get("TopDogT").addGrades(90);
        students.get("BadMamaJama").addGrades(80);
        students.get("BadMamaJama").addGrades(100);
        students.get("BadMamaJama").addGrades(90);
        students.get("ShadowBornHunter").addGrades(100);
        students.get("ShadowBornHunter").addGrades(100);
        students.get("ShadowBornHunter").addGrades(90);
        students.get("Cheese_Puffs").addGrades(100);
        students.get("Cheese_Puffs").addGrades(100);
        students.get("Cheese_Puffs").addGrades(90);
//        System.out.println(students.get("Student 4").getName());
//        System.out.println(students.get("Student 4").getGrades());
//        int val = students.get("student1");
//        System.out.println(student1.getName());
//        System.out.println(student1.);

        System.out.println(students.get("Tristy").getGrades());

//        do
//        {
//            System.out.println("Which student would you like to see more of?");
//            System.out.println(students.keySet());
//            String userInput = s.getString();
//            if( userInput.equals("TopDogT") )
//            {
//                System.out.println(students.get(userInput).getGrades());
//            }
//            else if ( userInput.equals("BadMamaJama") )
//            {
//                System.out.println(students.get(userInput).getGrades());
//            }
//            else if( userInput.equals("ShadowBornHunter") )
//            {
//                System.out.println(students.get(userInput).getGrades());
//            }
//            else if( userInput.equals("Cheese_Puffs") )
//            {
//                System.out.println(students.get(userInput).getGrades());
//            }
//            else
//            {
//                System.out.println("I don't appear to have a user by that name :(");
//            }
//            System.out.println("Would you like to continue?");
//        }
//        while(s.yesNo());

    }
}
