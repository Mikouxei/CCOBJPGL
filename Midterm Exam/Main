import ClassPack.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nList of figures: ");
        System.out.println("\n1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("\nSelect a figure to compute:");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\nEnter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of the circle: " + circle.getArea());
                break;

            case 2:
                System.out.print("\nEnter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the rectangle: ");
                double height = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width, height);
                System.out.println("Area of the rectangle: " + rectangle.getArea());
                System.out.println("Volume of the rectangular prism: " + rectangle.getVolume());
                break;

            case 3:
                System.out.print("\nEnter the side length of the square: ");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.println("Area of the square: " + square.getArea());
                System.out.println("Volume of the cube: " + square.getVolume());
                break;
            
            case 4:
                System.out.print("\nEnter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double triangleHeight = scanner.nextDouble();
                Triangle triangle = new Triangle(base, triangleHeight);
                System.out.println("Area of the triangle: " + triangle.getArea());
                System.out.println("Volume of the triangular prism: " + triangle.getVolume());
                break;
    
            default:
                System.out.println("Invalid choice.");
        }
    
        scanner.close();
    }
}
