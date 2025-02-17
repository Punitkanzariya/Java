//  Write  a  java  program  to  create  a  user 
//  defined package. 

// │── Java
// │   ├── mypackage
// │   │   ├── MyClass.java   // Inside 'mypackage' folder
// │   ├── Main.java          // Outside 'mypackage' folder


 import mypackage.MyClass; // Import the user-defined package

public class Userpackage {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayMessage();
    }
}


// Output: Hello from MyClass in mypackage!