package ClassPack;

public class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double getArea() {
        double base = getParam1();
        double height = getParam2();
        return 0.5 * base * height;
    }
}
