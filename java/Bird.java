public class Bird extends Pet{

    public Bird() {
        super("Buddy", "Parrot", 2);
    }

    public void display() {
        System.out.println("\nBird Details:");
        super.display();
        System.out.println("Wing Span: 0.8 meter");
    }
    
}
