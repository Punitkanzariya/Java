//  Write  a  java  program  to  demonstrate 
//  multilevel inheritance. 

 // Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on legs.");
    }
}

// Grandchild class inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.walk(); // Inherited from Mammal
        myDog.bark(); // Defined in Dog
    }
}
