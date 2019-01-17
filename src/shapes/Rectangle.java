package shapes;

public class Rectangle extends Quadrilateral implements Measurable
{


    public void setLength(double length)
    {
        this.length = length;
    }


    public void setWidth(double width)
    {
        this.width = width;
    }

    public Rectangle(double length, double width)
    {
        super(length, width);
    }


    //    private double length;
//    private double width;
//
//    public static void main(String[] args)
//    {
//        Rectangle myRect = new Rectangle(4.0, 5.0);
//        myRect.getArea();
//        myRect.getPerimeter();
//    }
//    public Rectangle(double length, double width)
//    {
//        this.length = length;
//        this.width = width;
//    }
//
//
//    public double getArea()
//    {
//        double area = length * width;
//        System.out.println(area);
//        return area;
//
//    }
//
//    public double getPerimeter()
//    {
//        double perimeter = (length * 2) + (width * 2);
//        System.out.println(perimeter);
//        return perimeter;
//    }
}
