import ClassPack.ClassInheritance.*;
public class Inheritance {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println("My cat ");
        myCat.play();
        System.out.println(myCat.legs);

        Bird myBird = new Bird();
        System.out.println("My bird ");
        myBird.hungry();
        System.out.println(myBird.wings);
    }
}