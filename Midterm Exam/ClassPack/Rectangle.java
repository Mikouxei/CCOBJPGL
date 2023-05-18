package ClassPack;

public class Rectangle extends Shape {
    private double height;

    public Rectangle(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double getArea() {
        double length = getParam1();
        double width = getParam2();
        return length * width;
    }

    @Override
    public double getVolume() {
        double length = getParam1();
        double width = getParam2();
        return length * width * height;
    }
}
