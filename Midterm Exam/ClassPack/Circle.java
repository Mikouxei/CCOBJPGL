package ClassPack;

public class Circle extends Shape {
    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        double radius = getParam1();
        return Math.PI * radius * radius;
    }
}
