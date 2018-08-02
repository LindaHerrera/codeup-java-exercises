package shapes;

public class Square extends Rectangle {

//    private String coolSquare;

    public Square(double side){

        super(side, side);
        }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }
}
