import java.util.Scanner;

public class NumberCalculation {
    public static void main(String[] args) {
        // exercise 1
        Scanner myScanner = new Scanner(System.in);
        Integer input = myScanner.nextInt();

        // incrementing
        input++;
        System.out.println("The new number is " + input);
        input++;
        System.out.println("The new number is " + input);
        input++;
        System.out.println("The new number is " + input);

        // decrementing
        input--;
        System.out.println("The new number is " + input);
        input--;
        System.out.println("The new number is " + input);
        input--;
        System.out.println("The new number is " + input);

        // exercise 2
        Integer inches = myScanner.nextInt();
        System.out.println("Total number of feet = " + Math.round(inches / 12));

        // exercise 3
        Double area =
                myScanner
                        .nextDouble(); // using double because assignment says that answer should be
        // "decimal values"
        System.out.println("Length = " + area / 2);

        // exercise 4
        System.out.println("Input the price of an item: ");
        Double price = myScanner.nextDouble();
        System.out.println("Change = $" + (20 - price));

        myScanner.close();
    }
}
