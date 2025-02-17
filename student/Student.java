import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int id;
    private int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String toFileFormat() {
        return name + "," + id + "," + age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Age: " + age;
    }
}
