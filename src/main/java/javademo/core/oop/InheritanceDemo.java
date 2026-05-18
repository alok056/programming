package javademo.core.oop;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno");
        Cat cat = new Cat("Whiskers");

        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();

        Animal animal = new Dog("Max");
        animal.eat();
        System.out.println("instanceof Dog: " + (animal instanceof Dog));
    }
}

class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " says: Meow!");
    }
}
