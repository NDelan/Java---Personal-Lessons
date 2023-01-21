// Interface lists all methods
// Assumes all methods are abstract
interface AnimalInterface {
    void bark();
    void sound();
}

abstract class Animal {
    public void sound() {
        System.out.println("Animal sounds!");
    }
    public abstract void bark();
}

// or class Dog implement AnimalInterface

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barked!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal myObj1 = new Dog();
        myObj1.bark();
    }
}