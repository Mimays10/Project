import java.util.Scanner;

class LuxuryPackage extends HolidayPackage {
	Scanner scan = new Scanner(System.in);

	String addActivity, packageCode, hotelName, discountCode;
	String[] packageName = new String[3];
	int quantity, hotelCode;
	double price, price2, totalPrice=0, balance=0, receive, discount=0, afterDiscount;

	LuxuryPackage(String name, String phoneNum, String packageName[], int quantity, String packageCode) {
		super(name, phoneNum, quantity);
		this.packageName = packageName;
		this.quantity = quantity;
		this.packageCode = packageCode;
	}

	void selectHotel() {
		System.out.println("\n************ AVAILABLE PACKAGE ************");
		System.out.println("Hotel Code    Description                 Price (RM)");
		System.out.println("        1     Amari Hotel, JB             950.00");
		System.out.println("        2     Double Tree, JB             1550.00");
		System.out.println("        3     Suasana Suite Hotel, JB     2250.00");

		System.out.print("\nEnter Hotel Code : ");
		hotelCode = scan.nextInt();
		scan.nextLine();
	}

	void calculatePrice() {

		if(hotelCode == 1) {
			price = 950.00;
			hotelName = "AMARI HOTEL, JOHOR BAHRU";

		} else if(hotelCode == 2) {
			price = 1550.00;
			hotelName = "DOUBLE TREE BY HILTON, JOHOR BAHRU";

		} else if(hotelCode == 3) {
			price = 2250.00;
			hotelName = "SUASANA SUITE HOTEL, JOHOR BAHRU";

		} else  
			System.out.println("Invalid Hotel Code");

		System.out.print("Add on Jacuzzi & Spa for RM250? (Y/N) : ");
		addActivity = scan.nextLine();

		if(addActivity.equalsIgnoreCase("y") || addActivity.equalsIgnoreCase("Y")) {
			price2 = 250.0;
		} else 
			price2 = 0.0;

		totalPrice = (price+price2) * quantity;
	}

	void calculateDiscount() {
			try {
				System.out.print("Enter Discount Code : ");
				discountCode = scan.nextLine();
				if(discountCode.length() != 4) {
					throw new IllegalArgumentException("Invalid Discount code");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}

			if(discountCode.length() == 4) {
				discount = 50.0;
			}

			afterDiscount = totalPrice - discount;
	}

	public void displaySummary() {
		super.displaySummary();

		System.out.println("\nPackage Code \t : " + packageCode + " - " + packageName[2]);
		System.out.println("Island Name \t : " + hotelName);

		System.out.println("\nPackage Price \t : RM " + price);
		if(addActivity.equalsIgnoreCase("y") || addActivity.equalsIgnoreCase("Y")) {
			System.out.println("Jacuzzi & Spa \t : RM " + price2 + "\n");
		}
		
		System.out.println("Total Price \t : RM " + totalPrice);
		if(discountCode.length() == 4) {
			System.out.println("Discount Code \t : " + discountCode);
			System.out.println("Discount \t : RM (" + discount + ")");
			System.out.println("After Discount \t : RM " + afterDiscount);
		}
		
		do { //calculate balance
			System.out.print("\n Amount Receive \t : RM ");
			receive = scan.nextDouble();

			balance = receive - afterDiscount;
			if(receive < afterDiscount) 
				System.out.println("-> Short RM " + (afterDiscount-receive) +"\n");
		} while(receive < afterDiscount);

		System.out.println("Balance \t : RM " + balance);
		
		System.out.println("\n****** THANK YOU. ENJOY YOUR HOLIDAY *******");
		System.out.print("This is LuxuryPackage");
	}
}