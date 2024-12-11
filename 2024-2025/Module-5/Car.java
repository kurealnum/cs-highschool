public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println(
                "You turn the keys on in your "
                        + this.year
                        + " "
                        + this.model
                        + ", and drive away.");
    }

    public static void main(String[] args) {
        Car supra = new Car("Toyota", "Supra", 2002);
        supra.drive();
    }
}
