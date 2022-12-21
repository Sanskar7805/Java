public class HybridInheritance {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.eat();
    }
}

class Animal {
    class Fish extends Animal {
        String shark;

        void swim() {
            System.out.println("swims in water");
        }

        String Tuna;
        int fins;

        void breathe() {
            System.out.println("Breathes");
        }
    }

    class Bird extends Animal {
        String peacock;

        void fly() {
            System.out.println("fly in cloud");
        }
    }

    class Mammal extends Animal {
        String Dog;

        void eat() {
            System.out.println("eats");
        }

        String cat;

        void walks() {
            System.out.println("walks in pathway");
        }

        String human;

        void drink() {
            System.out.println("drinks");
        }
    }
}