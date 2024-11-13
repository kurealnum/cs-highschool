public class NestedLoops {
    public static void main(String[] args) {
        // exercise one
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();

        // exercise two
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
        System.out.println();

        // exericse three
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("?");
            }
            System.out.println();
        }
    }
}
