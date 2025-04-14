import java.util.*;

public class Company {
    private String firstName;
    private String lastName;

    public Company(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return this.lastName + ", " + this.firstName;
    }

    public static void main(String[] args) {
        Company company = new Company("John", "Doe");
        Manager manager = new Manager("Alice", "Smith", 1001, 12, "YES");
        Employee employee1 = new Employee("Bob", "Johnson", 2001, 12, "YES", "Cashier");
        Employee employee2 = new Employee("Emma", "Brown", 2002, 12, "NO", "Stock Associate");
        Customer customer = new Customer("Charlie", "Davis", 5555);

        System.out.println(company);
        System.out.println(manager);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(customer);

        System.out.println("\nBenefits Info:");
        System.out.println("Manager: " + manager.benefits());
        System.out.println("Employee 1: " + employee1.benefits());
        System.out.println("Employee 2: " + employee2.benefits());
    }
}

class Manager extends Company {
    private int employeeNumber;
    private int storeNumber;
    public static String vested;

    public Manager(
            String firstName, String lastName, int employeeNumber, int storeNumber, String vested) {
        super(firstName, lastName);
        this.employeeNumber = employeeNumber;
        this.storeNumber = storeNumber;
        Manager.vested = vested;
    }

    public String benefits() {
        if (Manager.vested.equalsIgnoreCase("YES")) {
            return "Employee has benefits.";
        }
        return "Employee does not have benefits.";
    }

    public String toString() {
        return super.toString()
                + "\nStore number: "
                + this.storeNumber
                + "\nVested: "
                + Manager.vested;
    }
}

class Employee extends Manager {
    private String position;

    public Employee(
            String firstName,
            String lastName,
            int employeeNumber,
            int storeNumber,
            String vested,
            String position) {
        super(firstName, lastName, employeeNumber, storeNumber, vested);
        this.position = position;
    }

    @Override
    public String benefits() {
        if (Manager.vested.equalsIgnoreCase("YES")) {
            return "Employee is full time.";
        }
        return "Employee is part time.";
    }

    public String toString() {
        return super.toString() + "\nPosition: " + this.position;
    }
}

class Customer extends Company {
    private int reward;

    public Customer(String firstName, String lastName, int reward) {
        super(firstName, lastName);
        this.reward = reward;
    }

    public String toString() {
        return super.toString() + "\nReward Number:" + this.reward;
    }
}
