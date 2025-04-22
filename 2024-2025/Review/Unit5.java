public class Unit5 {
    public static void main(String[] args) {}
}

// 5.1 Anatomy of a Class
// Task: Define a Book class with the following components:
// Private instance variables: title (String), author (String), and pages (int).
// A constructor that initializes all instance variables.
// A method getSummary() that returns a string summarizing the book's details.

// 5.4 Accessor Methods
// Task: In the Book class, implement accessor (getter) methods for each instance variable:
// getTitle(), getAuthor(), and getPages().

// 5.5 Mutator Methods
// Task: In the Book class, implement mutator (setter) methods for each instance variable:
// setTitle(String title), setAuthor(String author), and setPages(int pages).

// 5.6 Writing Methods
// Task: Add a method isLongBook() to the Book class that returns true if the number of
// pages is greater than 300, otherwise returns false.
class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public boolean isLongBook() {
        return pages > 300;
    }

    public String getSummary() {
        return this.title + " was written by " + this.author + " and has " + this.pages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

// 5.2 Constructors
// Task: Create a Car class with:
// Private instance variables: make (String), model (String), and year (int).
// A constructor that initializes all instance variables.
// A no-argument constructor that sets default values.

// 5.3 Documentation with Comments
// Task: Enhance the Car class by adding:
// a) Javadoc comments for the class and its constructors.
// b) Inline comments explaining the purpose of each method and variable.

/** A class that represents a car. */
class Car {
    // The make of the car
    private String make;
    // The model of the car
    private String model;
    // The year the car was made
    private int year;

    // 5.8 Scope and Access
    // Task: In the Car class, demonstrate variable scope by:
    // Declaring a local variable speed inside a method.
    // Attempting to access speed outside its method to illustrate scope limitations.
    public void test() {
        int speed = 30;
    }

    public void show() {
        // error
        System.out.println(test);
    }

    // 5.9 this Keyword
    // Task: Modify the Car class's constructor to use the this keyword to distinguish between
    // instance variables and parameters with the same names.
    // Constructor #1
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Constructor #2
    public Car() {
        this.make = "Ford";
        this.model = "Taurus";
        this.year = 2019;
    }
}

// 5.7 Static Variables and Methods
// Task: Create a Library class with:
// A static variable totalBooks to track the number of books added.
// A method addBook(Book book) that increments totalBooks.
// A static method getTotalBooks() that returns the value of totalBooks.
class Library {
    private static int totalBooks;

    public void addBook(Book book) {
        totalBooks++;
    }

    public int getTotalBooks() {
        return Library.totalBooks;
    }
}

// 5.10 ~ N/A (we did a group presentation on the ethics)
