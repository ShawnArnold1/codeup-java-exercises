import java.util.Arrays;

public class ArraysExercise
    {
        public static void main(String[] args)
        {
            Person[] people = new Person[3];
            people[0] = new Person("Shawnyboi");
            people[1] = new Person("Azizzy");
            people[2] = new Person("Tristy");
            Person[] newArrayOfPeople = addPerson(people, "BigBaller");

            for(int i =0; i < newArrayOfPeople.length; i++)
            {
                System.out.println(newArrayOfPeople[i].getName());
            }

            for(Person individual : newArrayOfPeople)
            {
                System.out.println(individual.getName() + " HI");
            }
        }




        public static Person[] addPerson(Person[] people, String userInput)
            {
                Person[] newPeopleArray = new Person[people.length + 1];
                for( int i = 0; i < people.length; i++)
                    {
                        newPeopleArray[i] = people[i];
                    }
                Person newPerson = new Person(userInput);
                newPeopleArray[people.length] = newPerson;
                return newPeopleArray;
            }

    }
