import java.util.Scanner;

public class Unit2 {
    public static void main(String[] args) {
        Book book1 = new Book("Richard Little", "Bobby Joe");
        Book book2 = new Book("Moby Dick", "Mary Sue");
        System.out.println(book1);
        System.out.println(book2);

        // 2.6 String Objects: Concatenation, Literals & More
        // Task: Write a program that takes a user’s first name and last name (as String variables),
        // concatenates them into a full name with a space in between, and prints "Welcome, [Full
        // Name]!".

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = myScanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = myScanner.nextLine();

        String fullName = firstName + " " + lastName;

        System.out.println("Welcome, " + fullName);

        // 2.7 String Methods
        // Task: Ask the user to input a sentence. Print out: 1) The number of characters 2) The
        // sentence in
        // all lowercase 3) Whether it contains the word “Java”
        // Use length(), toLowerCase(), and contains().

        System.out.print("Enter a sentence: ");
        String sentence = myScanner.nextLine();

        System.out.println("Number of characters: " + sentence.length());
        System.out.println("In lowercase: " + sentence.toLowerCase());

        if (sentence.contains("Java")) {

            System.out.println("Does contain \"Java\" ");
        } else {

            System.out.println("Does not contain \"Java\" ");
        }

        // 2.8 Wrapper Classes: Integers and Doubles
        // Task: Create a program that takes two integer values and two double values using Integer
        // and
        // Double wrapper classes.
        // Print their sum using intValue() and doubleValue().

        Integer i1 = 3;
        Integer i2 = 4;
        Double d1 = 3.5;
        Double d2 = 4.2;

        System.out.println(i1.intValue() + d1.doubleValue());
        System.out.println(i2.intValue() + d2.doubleValue());

        // 2.9 Using the Math Class
        // Task: Write a calculator that does the following using the Math class:
        // Find the absolute value of -15
        // Find the larger of two user-given numbers
        // Raise 3 to the power of 4
        // Find the square root of 81

        System.out.println(Math.abs(-15));

        System.out.print("Enter a number: ");
        int n1 = myScanner.nextInt();
        System.out.print("Enter a number: ");
        int n2 = myScanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 is greater than n2");
        } else {
            System.out.println("n2 is greater than n1");
        }

        System.out.println(Math.pow(3, 4));
        System.out.println(Math.sqrt(81));

        myScanner.close();
    }
}

// Note to grader: I am treating `Unit2` as my `Main` class

// 2.1 Instances of Classes - Create a class Book with instance variables title and author.
// Task: Add a constructor that sets both variables.
// Then, in a Main class, create two Book objects and print out their details.

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return this.title + " is written by " + this.author;
    }
}

// 2.2 Creating and Storing Objects (Instantiation)
// Task: Create a class Movie with instance variables name and rating.
// Create an array of 3 Movie objects in main() and print the name and rating of each movie.

class Movie {
    private String name;
    private double rating; // out of 5

    public Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String toString() {
        return this.name + " has a rating of " + rating + " stars.";
    }

    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Harry Potter", 3.4), new Movie("Dobby", 4.7), new Movie("Airplane", 4.2)
        };
    }
}

// 2.3 Calling a Void Method
// Create a class Printer with a method printWelcome() that prints "Welcome to the Java World!".
// In the main() method, create a Printer object and call printWelcome().

class Printer {
    public void printWelcome() {
        System.out.println("Welcome to the Java World!");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printWelcome();
    }
}

// 2.4 Calling a Void Method with Parameters
// Create a class Greeter with a method sayHello(String name) that prints "Hello, [name]!".
// In main(), call sayHello() with at least two different names.

class Greeter {
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        sayHello("Oscar");
        sayHello("Bob");
    }
}

// 2.5 Calling a Non-void Method
// Task: Create a class MathHelper with a method cube(int x) that returns the cube of a number.
// In main(), call the method with a few values and print the results.

class MathHelper {
    public static int cube(int x) {
        return (int) Math.pow(x, 3);
    }

    public static void main(String[] args) {
        System.out.println(cube(3));
        System.out.println(cube(2));
        System.out.println(cube(1));
    }
}
