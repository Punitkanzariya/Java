//  Write  a  java  program  to  demonstrate  the 
//  concept of interface.

// Defining an interface
interface Animal {
    void makeSound(); // Abstract method
}

// Implementing the interface in Dog class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class to demonstrate interface
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Dog object assigned to Animal reference
        myDog.makeSound(); // Calls Dog's implementation
    }
}
