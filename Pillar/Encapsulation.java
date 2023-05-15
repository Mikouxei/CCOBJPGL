import ClassPack.ClassEncapsulation.*;

public class Encapsulation {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("mingming", 2, "Cat");

        System.out.println(myAnimal.getName());

        myAnimal.setName("blacky");
        System.out.println(myAnimal.getName());
    }
}
