import java.util.ArrayList;

public class Unit9 {
    public static void main(String[] args) {
        // 9.1 (cont. below)
        // 9.5 Creating References Using Inheritance Hierarchies
        // Task: Demonstrate polymorphism by creating a Person reference that points to a Student
        // object. Then, call a method defined in Person to show that it works with the Student
        // object.
        Person s = new Student();
        s.getAge();

        // 9.6 Polymorphism
        // Task: Create a list of Person objects that includes both Person and Student instances.
        // Iterate through the list and call a method (e.g., getInfo()) on each object to
        // demonstrate polymorphism.

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Student());
        list.add(new Person());
        list.add(new Student());

        for (Person p : list) {
            System.out.println(p.getName());
        }
    }
}

// 9.1 Inheritance
// Task: Create a superclass Person with attributes name and age. Then, create a subclass
// Student that adds an attribute studentID. Write constructors for both classes and
// demonstrate creating a Student object.
//
// 9.2 Writing Constructors for Subclasses
// Task: Extend the Person and Student classes from the previous task. Ensure that the
// Student constructor uses the super keyword to call the Person constructor.

class Person {
    private String name;
    private int age;

    public Person() {
        name = "name";
        age = 30;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void superMethod() {
        System.out.println("I have been called.");
    }
}

class Student extends Person {
    private int studentId;

    public Student() {
        super();
        studentId = 3;
    }

    // 9.7 The Object Superclass
    // Task: Override the equals() method in the Student class to compare studentIDs. Also,
    // override the toString() method to provide a string representation of the Student object.
    public boolean equals(Student s) {
        return s.getStudentId() == getStudentId();
    }

    // 9.4 The super Keyword
    // Task: In the Student class, create a method that calls a method from the Person class
    // using the super keyword. For example, if Person has a method getInfo(), call it from
    // Student.
    public void test() {
        super.superMethod();
    }

    public int getStudentId() {
        return studentId;
    }

    // 9.3 Overriding Methods
    // Task: In the Student class, override the toString() method to include all attributes
    // (name, age, and studentID).
    public String toString() {
        return getName() + " is " + getAge() + " years old, and their student ID is " + studentId;
    }
}
