// Create  a  class  called  Student.  Write  a 
//  student  manager  program  to  manipulate 
//  the  student  information  from  files  by 
//  using  FileInputStream  and 
//  FileOutputStream 



import java.io.*;

public class StudentManager {

    public static void saveStudentData(String filename, Student student) {
        try (FileOutputStream fos = new FileOutputStream(filename, true); 
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student); // Write student object to file
            System.out.println("Student data saved!");
        } catch (IOException e) {
            System.out.println("Error saving student data: " + e.getMessage());
        }
    }

    public static void readStudentData(String filename) {
        try (FileInputStream fis = new FileInputStream(filename); 
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            System.out.println("Reading student data from file...");
            while (true) {
                Student student = (Student) ois.readObject();
                System.out.println(student);
            }
        } catch (EOFException e) {
            // End of file reached, nothing more to read
            System.out.println("End of file reached.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example of saving student data to file
        Student student1 = new Student("punit", 101, 20);

        saveStudentData("students.dat", student1);

        // Example of reading student data from file
        readStudentData("students.dat");
    }
}


// Output:
// Student data saved!
// Reading student data from file...
// Name: punit, ID: 101, Age: 20
// End of file reached.