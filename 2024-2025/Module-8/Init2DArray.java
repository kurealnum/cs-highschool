public class Init2DArray {
    public static void main(String[] args) {
        String[][] names = {
            {"Maria", "Love"},
            {"John", "Jazz"},
            {"Blaze", "Griffin"},
            {"Christinia", "Fry"},
            {"Max", "Muffle"}
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i][1] + ", " + names[i][0]);
        }

        System.out.println(names[4][0]);
    }
}
