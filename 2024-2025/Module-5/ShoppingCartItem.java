public class ShoppingCartItem {
    private String name;
    private int count;
    private double weight; // weight in pounds
    public static int totalItems; // maintains how many items have been created

    public ShoppingCartItem(String name, int count, double weight) {
        this.name = name;
        this.count = count;
        this.weight = weight;
        totalItems++;
    }

    public static void itemsCreated() {
        System.out.println(totalItems);
    }

    // getter methods
    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    public double getWeight() {
        return this.weight;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        if (count >= 0) {
            this.count = count;
        }
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

    public String toString() {
        return "Your "
                + this.name
                + " are "
                + this.weight
                + " pounds each. You have "
                + this.count
                + " of them.";
    }

    // adds items by weight -- this is not exact. for instance, if an apple weighs 1 pound, and you
    // call addItemsByWeight(1.6), this.count will be incremented by 2
    public void addItemsByWeight(double weight) {
        int numberOfNewItems = (int) Math.round((weight / this.weight));
        this.count += numberOfNewItems;
    }

    public static void main(String args[]) {
        ShoppingCartItem peaches = new ShoppingCartItem("Peaches", 3, 0.4);
        ShoppingCartItem milk = new ShoppingCartItem("Bottle of milk", 2, 0.5);

        System.out.println(peaches.getName());
        System.out.println(peaches.getCount());
        System.out.println(peaches.getWeight());
        peaches.setName("Fresh Peaches");
        peaches.setCount(5);
        peaches.setWeight(0.45);
        System.out.println(peaches.toString());
        peaches.addItemsByWeight(2.0);
        System.out.println(peaches.getCount());

        System.out.println(milk.getName());
        System.out.println(milk.getCount());
        System.out.println(milk.getWeight());
        milk.setName("Organic Milk");
        milk.setCount(4);
        milk.setWeight(0.55);
        System.out.println(milk.toString());
        milk.addItemsByWeight(1.0);
        System.out.println(milk.getCount());

        ShoppingCartItem.itemsCreated();
    }
}
