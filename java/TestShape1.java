public class TestShape1 {
    public static void main(String[] args) {
        Shape1 s = new Shape1();
        s.draw();
        s.area();
        
        Rectangle1 r = new Rectangle1();
        r.draw();
        r.area();

        Circle1 c = new Circle1();
        c.draw();
        c.area();

        Triangle t = new Triangle();
        t.draw();
        t.area();
    }
}
