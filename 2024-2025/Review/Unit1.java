import java.io.*;
import java.util.*;

public class Unit1 {
    public static void main(String[] args) {
        Main.main(args);
    }
}

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        // Unit 1 Review Code-Along: Java Fundamentals

        // Step 1: Why Programming? Why Java?
        // Imagine you're designing the next blockbuster sci-fi film.
        // Java can help you build futuristic applications—what would you create with it?

        System.out.println("");

        // Step 2: Declare variables using primitive data types
        // Think about your favorite coffee order. Declare a double for the price,
        // an int for the size in ounces, a boolean for whether it has whipped cream,
        // and a char for the first letter of your favorite flavor.

        // Step 3: Initialize variables and assign values
        // Assign values to your coffee-related variables. Maybe your large mocha is $4.75,
        // comes in a 16-ounce cup, has whipped cream, and starts with 'M'.
        double coffeePrice = 5.99;
        int coffeeSize = 16;
        boolean hasWhippedCream = true;
        char favoriteFlavor = 'b';

        // Step 4: Perform simple expressions using arithmetic operators
        // Calculate the total cost of buying three of your favorite coffees.
        // Or, subtract the number of sips you've taken to see how much coffee remains.
        System.out.println("Cost of 3 coffees: " + 3 * coffeePrice);

        double ouncePerSip = 0.1;
        System.out.println(
                "After taking 5 sips, I have " + (coffeeSize - (ouncePerSip * 5)) + " remaining.");

        // Step 5: Apply compound assignment operators
        // If you're gaming, think about an in-game inventory.
        // Use compound assignment operators to increase the number of potions after finding loot
        // or decrease the coins spent on upgrades.

        int numPotions = 3;

        boolean foundLoot = true;

        if (foundLoot) {
            numPotions++;
        }

        System.out.println("Number of potions after finding loot: " + numPotions);

        // Step 6: Demonstrate type casting
        // Imagine your favorite book was adapted into a TV series.
        // Think of casting as converting between formats. Convert a double price to an int
        // to round a ticket price, or widen an int to double when calculating discounts.

        double rawTicketPrice = 30.99;
        int roundedTicketPrice = (int) rawTicketPrice;

        int discount = 20;
        double discountPercent = 0.01 * discount;

        // Step 7: Discuss the ranges of different primitive data types
        // Compare data type ranges to real-world examples.
        // For instance, how many pages does your favorite book have? How does that compare to the
        // max value of an int?

        int bookPages = 329;

        if (Integer.MAX_VALUE > bookPages) {
            System.out.println("Book pages is less than max value of Integer");
        }
    }
}
