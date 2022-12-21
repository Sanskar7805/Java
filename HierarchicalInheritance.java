public class HierarchicalInheritance {
    public static void main(String[] args) {
        Bird nee = new Bird();
        nee.fly();
        nee.eat();
        Mammal human = new Mammal();
        human.eat();
        human.walk();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Mammal {
    void swim() {
        System.out.println("swims in water");
    }
}

class Bird extends Fish {
    void fly() {
        System.out.println("Birds in fly");
    }
}