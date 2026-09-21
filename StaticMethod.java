class Student {

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    static void collegeName() {
        System.out.println("College: Mumbai University");
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");

        s1.displayStudent();

        Student.collegeName();
    }
}