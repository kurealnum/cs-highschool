import java.util.Scanner;

public class ConcatenationOne {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your favorite color!");
        String favoriteColor = myScanner.nextLine();
        System.out.println("I like the color " + favoriteColor + " too!");
        myScanner.close();
    }
}
