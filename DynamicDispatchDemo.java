//   Write  a  java  program  to  demonstrate  the 
//  use of dynamic method dispatch.


 // Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate dynamic method dispatch
public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Animal myAnimal; // Reference of superclass
        
        myAnimal = new Dog(); // Dog object assigned to Animal reference
        myAnimal.makeSound(); // Calls Dog's makeSound method
        
        myAnimal = new Cat(); // Cat object assigned to Animal reference
        myAnimal.makeSound(); // Calls Cat's makeSound method
    }
}
