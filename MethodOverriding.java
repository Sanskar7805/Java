public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
// jab hum child class bala object bnayenge toh child class bala object he call
// karega
// Method Overriding -- parents and child class parameters are same but
// different definition.
// its an example of Run time polymorphism