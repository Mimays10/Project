public class WashingMachine {
    int warranty;
    
    public void setWarranty(int x) {
        warranty = x;
    }
    public int getWarranty() {
        return warranty;
    }
    public float extendsWarranty() {
        warranty = warranty + 1;
        return warranty;
    }
    public void displayWashingMachine() {
        System.out.println("Warranty: " + warranty);
    }
}
