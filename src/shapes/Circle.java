package shapes;

import java.util.Scanner;

public class Circle
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        private double radius;

        public Circle(String prompt)
            {
                System.out.println(prompt);
                double userRadius = sc.nextDouble();
                this.radius = userRadius;
            }

        public double getArea()
            {
                System.out.println("Lets get the area of the circle");
                double getArea = 3.14 * ( radius * radius);
                return getArea;
            }
    }
