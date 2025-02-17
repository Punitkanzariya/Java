//  Write  a  java  program  to  demonstrate 
//  multilevel inheritance. 

 // Parent class
class A {
    void hy() {
        System.out.println("Hy from A.");
    }
}

// Child class inheriting from Animal
class B extends A {
    void hello() {
        System.out.println("Hello from B.");
    }
}

// Grandchild class inheriting from Mammal
class C extends B {
    void hello2() {
        System.out.println("Hello from c.");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        C o = new C();
        o.hy();  // Inherited from Animal
        o.hello(); // Inherited from Mammal
        o.hello2(); // Defined in Dog
    }
}
