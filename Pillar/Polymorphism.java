import ClassPack.ClassPolymorphism.*;
public class Polymorphism {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.print("My cat eats with a sound of ");
        myCat.eat();

        Dog myDog = new Dog();
        System.out.print("\n\nMy dog eats with a sound of ");
        myDog.eat(5);

    }
}