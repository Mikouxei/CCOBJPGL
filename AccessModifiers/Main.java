import ClassPack.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    // MACHINE PROBLEM #1 ----------------------------------------------------------------------

        // System.out.print("Enter your name: ");
        // String pangalan = sc.nextLine();

        // System.out.print("Enter your age: ");
        // int edad = sc.nextInt();

        // sc.close();

        // Tao objTao = new Tao(pangalan, edad);

        // System.out.println(objTao.getPangalan() + " is " + objTao.getEdad() + " years old.");

    // MACHINE PROBLEM 2 ----------------------------------------------------------------------

        // System.out.print("Enter animal type: ");
        // String type = sc.nextLine();

        // System.out.print("Enter animal name: ");
        // String name = sc.nextLine();

        // System.out.print("Enter animal breed: ");
        // String breed = sc.nextLine();

        // sc.close();

        // Animal objAnimal = new Animal(type, name, breed);

        // System.out.println("My name is " + objAnimal.getName() + "," + " I'm a " + objAnimal.getType() + " and my breed is " + objAnimal.getBreed() + ".");

    // MACHINE PROBLEM 3 ----------------------------------------------------------------------

        // Employee employee = new Employee();
 
        // System.out.print("Name: ");
        // employee.setName(sc.nextLine());

        // System.out.print("Enter Job title: ");
        // employee.setjobTitle(sc.nextLine());

        // System.out.print("Enter numbers of day present (if you have a half day please indicate it as .5): ");
        // employee.setattendance(sc.nextDouble());

        // System.out.print("Enter base salary: ");
        // employee.setsalary(sc.nextDouble());

        // sc.close();

        // System.out.print("Total Salary: " + employee.totalSalary());

    // MACHINE PROBLEM 4 ----------------------------------------------------------------------
        
        //     Circle circle = new Circle();
    
        //     System.out.print("Enter Radius: ");
        //     circle.setRadius(sc.nextDouble());
        //     sc.close();
     
        //     System.out.println("\nArea: " + circle.Area());
        //     System.out.println("Circumference: " + circle.Circum());
        //
    
    // MACHINE PROBLEM 5 ----------------------------------------------------------------------
        
        TrafficLight tl = new TrafficLight();
        
        System.out.print("Color: ");
        tl.setColor(sc.next());

        tl.checkLight();
    }
}
