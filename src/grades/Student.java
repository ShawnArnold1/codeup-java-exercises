package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Student

{
    private String name;
    private ArrayList<Integer> grades;






    public Student(String name)
    {
        this.name = name;
        this.grades = new ArrayList<>();
    }




    public String getName() {
        return this.name;
    }


    public ArrayList<Integer> getGrades()
    {
        return this.grades;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addGrades(int grades)
    {
        this.grades.add(grades);
    }


    public int calculateAverage()
    {
        Integer sum = 0;
        if(!grades.isEmpty()) {
            for (Integer grade : grades) {
                sum += grade;
            }
            return sum.intValue() / grades.size();
        }
        return sum;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> student1Grades = new ArrayList<>();



        Student student1 = new Student("Shawn");
        Student student2 = new Student("Tristy");

        student1.addGrades(100);
        student1.addGrades(50);
        student1.addGrades(150);
        System.out.println(student1.getName());
        System.out.println(student1.getGrades());
        System.out.println(student1.name + " average grade is " + student1.calculateAverage());
        student2.addGrades(100);
        student2.addGrades(150);
        student2.addGrades(150);
        System.out.println(student2.name + student2.grades);
        System.out.println(student2.calculateAverage());

    }

}
