public class DataTypes {
    public static void main(String[] args) {
        // assignments
        Integer integerVariable = 3;
        Double doubleVariable = 6.5;
        Boolean trueOrFalse = true;
        String stringVar = "Hello";

        // printing
        System.out.println("Integer Variable: " + integerVariable);
        System.out.println("Double Variable: " + doubleVariable);
        System.out.println("Boolean Variable: " + trueOrFalse);
        System.out.println("String Variable: " + stringVar);

        // updating variables
        integerVariable = 6;
        doubleVariable = 1.2;
        trueOrFalse = !trueOrFalse;
        stringVar = "Goodbye";

        // printing updated variables
        System.out.println("\nUpdated Integer Variable: " + integerVariable);
        System.out.println("Updated Double Variable: " + doubleVariable);
        System.out.println("Updated Boolean Variable: " + trueOrFalse);
        System.out.println("Updated String Variable: " + stringVar);
    }
}
