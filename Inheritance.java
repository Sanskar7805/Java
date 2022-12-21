public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}

// Base Class
class Animal {
    String color; // property

    void eat() { // function
        System.out.println("eats");
    }

    void breathe() { // function
        System.out.println("breathes");
    }
}

// Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}
