import java.util.Scanner;

public class ConcatenationTwo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your favorite class!");
        String favoriteClass = myScanner.nextLine();
        System.out.println("Enter your favorite season!");
        String favoriteSeason = myScanner.nextLine();
        System.out.println(
                "I like studying " + favoriteClass + " in the " + favoriteSeason + " as well.");
        myScanner.close();
    }
}
