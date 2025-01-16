import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {
        String[] countries = {
            "China",
            "Egypt",
            "France",
            "Germany",
            "India",
            "Japan",
            "Kenya",
            "Mexico",
            "United Kingdom",
            "United States"
        };
        String[] capitals = {
            "Beijing",
            "Cairo",
            "Paris",
            "Berlin",
            "New Delhi",
            "Tokyo",
            "Nairobi",
            "Mexico City",
            "London",
            "Washington D.C."
        };
        String[] languages = {
            "Chinese",
            "Arabic",
            "French",
            "German",
            "Hindi",
            "Japanese",
            "Swahili",
            "Spanish",
            "English",
            "English"
        };

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10");
        int userInput = myScanner.nextInt();
        int index = userInput - 1;
        System.out.println(
                "The capital of "
                        + countries[index]
                        + " is "
                        + capitals[index]
                        + " where they speak "
                        + languages[index]);

        myScanner.close();
    }
}
