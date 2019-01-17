package shapes;

public class Square extends Quadrilateral
{

    public Square(double length, double width)
    {
        super(length, width);
    }


    protected void setLength(double length)
    {
        this.length = length;
    }

    protected void setWidth(double width)
    {
        this.width = width;
    }






    //    private double side;
//
//    public Square(double side)
//    {
//        super(side, side);
//        this.side = side;
//    }
//@Override
//    public double getPerimeter()
//    {
//        double perimeter = (side * 2) + (side * 2);
//        System.out.println(perimeter);
//        return perimeter;
//    }
//@Override
//    public double getArea()
//    {
//        double area = side * side;
//        System.out.println(area);
//        return area;
//    }
//



}
