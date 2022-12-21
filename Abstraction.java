
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Mustang myhorse = new Mustang();
        // Animal--> Horse-->Mustang
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changecolor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks in 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("chicken constructor called");
    }

    void changecolor() {
        color = "white";
    }

    void walk() {
        System.out.println("walks in 2 legs");
    }
}
