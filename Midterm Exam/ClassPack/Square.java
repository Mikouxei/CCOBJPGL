package ClassPack;

public class Square extends Shape {
    public Square(double side) {
        super(side);
    }

    @Override
    public double getArea() {
        double side = getParam1();
        return side * side;
    }

    @Override
    public double getVolume() {
        double side = getParam1();
        return side * side * side;
    }
}
