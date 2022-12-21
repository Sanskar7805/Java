public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog mylo = new Dog();
        mylo.eat();
        mylo.breathe();
        mylo.legs = 4;
        System.out.println(mylo.legs);
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class 1
class Mammal extends Animal {
    int legs;
}

// Derived class 2
class Dog extends Mammal {
    String breed;
}
