package shapes;

public class ShapesTest
{
    public static void main(String[] args)
    {
           Rectangle box1 = new Rectangle(4.0, 5.0);
           box1.getArea();
           box1.getPerimeter();



        Measurable myShape;
        Measurable shape;
        myShape = new Rectangle(1.5, 1.5);
        shape = new Square( 1.5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println("++++++");
        System.out.println(myShape.getArea());
        System.out.println(shape.getPerimeter());


//            @Override
//            public double getPerimeter() {
//                return 0;
//            }
//
//            @Override
//            public double getArea() {
//                return 0;
//            }
//        };
//        {

//            public double getPerimeter(double length, double width)
//            {
//                return (length * 2) + (width * 2);
//            }
//
//
//            public double getArea(double length, double width)
//            {
//                return length * width;
//            }
//        };
//        double rect = new Rectangle(4.5, 8.5);
//        ((Measurable) myShape).getArea(44, 44);
//        System.out.println(myShape.getArea());
    }
}

