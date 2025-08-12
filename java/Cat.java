public class Cat extends Pet {
    public Cat() {
        super("Cat", "Tiger", 5);
    }

    public void display() {
        System.out.println("Cat Details:");
        super.display();
        System.out.println("Favorite Toys: Ball");
    }
}
