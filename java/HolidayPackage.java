public abstract class HolidayPackage {
	public String name, phoneNum;
	public int quantity;

	HolidayPackage(String name, String phoneNum, int quantity) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.quantity = quantity;
	}

	abstract void calculatePrice();
	abstract void calculateDiscount();

	public void displaySummary() {
		System.out.println("\n************ ORDER INFO ************");
		System.out.println("Name \t\t : " + name);
		System.out.println("Phone Number \t : " + phoneNum);
		System.out.println("Quantity \t : " + quantity);
	}
}