class Animal {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ",Age: " + age);
    }

    void eat() {
        System.out.println(name + "is eating.");
    }
}

// Subclass1
class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println(name + " says: Meow.");
    }
}

// subclass 2
class Cat extends Animal {
    boolean indoor;

    void meow() {
        System.out.println(name + "says: Meow!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Bruno";
        d.age = 3;
        d.breed = "Labrador";
        d.display();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.name = "Whiskers";
        c.age = 2;
        c.display();
        c.meow();

    }
}
