class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor"); // Output: Animal constructor
    }
}

class Mammal extends Animal {
    String furType;

    Mammal(String name, String furType) {
        super(name); // Calls Animal constructor
        this.furType = furType;
        System.out.println("Mammal constructor"); // Output: Mammal constructor
    }
}

class Dog extends Mammal {
    String breed;

    Dog(String name, String furType, String breed) {
        super(name, furType); // Calls Mammal constructor
        this.breed = breed;
        System.out.println("Dog constructor"); // Output: Dog constructor
    }
}

public class p02 {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "Fur", "Golden Retriever");
    }
}
