public class DiplomaIT extends Student {
    String name;
    public void details() {
        super.name = "Student";
        name = "Dploma Students";
        System.out.println(super.name + " and " + name);
        DiplomaIT diploma = new DiplomaIT();
        diploma.details();
    }
}
