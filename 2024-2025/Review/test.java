public class test {
    public static void main(String[] args) {
        Animal a1 = new Animal("bob");
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    private String color;

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public void blank() {
        System.out.println("blank");
    }
}
