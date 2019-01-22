package shapes;

public class Square extends Quadrilateral
{

    public Square(double side)
    {
        super(side, side);
    }


    protected void setLength(double length)
    {
        this.length = length;
    }

    protected void setWidth(double width)
    {
        this.width = width;
    }



    @Override
    public double getPerimeter()
    {
        return 4* length;
    }

    @Override
    public double getArea()
    {
        return Math.pow(length, 2);
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
