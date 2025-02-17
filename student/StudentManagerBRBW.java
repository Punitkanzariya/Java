// Refine  the  student  manager  program  to 
//  manipulate  the  student  information  from 
//  files  by  using  the  BufferedReader  and 
//  BufferedWriter 
import java.io.*;

public class StudentManagerBRBW {

    // Method to save student data to the file using BufferedWriter
    public static void saveStudentData(String filename, Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(student.toFileFormat());
            writer.newLine(); // Add a newline after each student record
            System.out.println("Student data saved!");
        } catch (IOException e) {
            System.out.println("Error saving student data: " + e.getMessage());
        }
    }

    // Method to read student data from the file using BufferedReader
    public static void readStudentData(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Split by comma and check if we have 3 values (name, id, age)
                String[] data = line.split(",");
                if (data.length != 3) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }

                String name = data[0];
                int id = Integer.parseInt(data[1]);
                int age = Integer.parseInt(data[2]);
                Student student = new Student(name, id, age);
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error in data format: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example of saving student data to file
        Student student1 = new Student("Punit Kanzariya", 101, 20);

        saveStudentData("students.txt", student1);

        // Example of reading student data from file
        System.out.println("Reading student data from file...");
        readStudentData("students.txt");
    }
}
