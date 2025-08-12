public class CalculatePrice extends PriceItem{
    
    public CalculatePrice(double price) {
        super(price);
    }  
    
    public double getTotalPrice() {
        return price - (price * discount / 100);
    }
}
