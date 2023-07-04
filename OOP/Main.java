package OOP;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Slon", 32, "true", "white", "Mammal", "Stas", 4);
        Animal animal1 = new Animal("black", "bird", 4);
        System.out.println(animal.getAge());
        animal.setAge(3);
        System.out.println(animal.getAge());
        Animal.foo();
        System.out.println(animal);
        Waterfowl.Fly();
        Waterfowl.Swim();
        Waterfowl.toGo();
        Flying.Swim();
    }
}
