import java.util.Scanner;

class IslandPackage extends HolidayPackage {
	Scanner scan = new Scanner(System.in);

	String addActivity, packageCode, islandName, discountCode;
	String[] packageName = new String[3];
	int quantity, islandCode;
	double price, price2, totalPrice=0, balance=0, receive, discount=0, afterDiscount;

	IslandPackage(String name, String phoneNum, String packageName[], int quantity, String packageCode) {
		super(name, phoneNum, quantity);
		this.packageName = packageName;
		this.quantity = quantity;
		this.packageCode = packageCode;
	}

	public void selectIsland() {
		System.out.println("\n************ AVAILABLE PACKAGE ************");
		System.out.println("Island Code    Description     Price (RM)");
		System.out.println("        1      Tinggi Island   550.00");
		System.out.println("        2      Tioman Island   720.00");
		System.out.println("        3      Rawa Island     1100.50");

		System.out.print("\nEnter Island Code : ");
		islandCode = scan.nextInt();
		scan.nextLine();
	}

	public void calculatePrice() {

		if(islandCode == 1) {
			price = 550.00;
			islandName = "TINGGI ISLAND";

		} else if(islandCode == 2) {
			price = 720.00;
			islandName = "TIOMAN ISLAND";

		} else if(islandCode == 3) {
			price = 1100.50;
			islandName = "RAWA ISLAND";

		} else  
			System.out.println("Invalid Island Code");

		System.out.print("Add on snorkeling for RM150? (Y/N) : ");
		addActivity = scan.nextLine();

		if(addActivity.equalsIgnoreCase("y")) {
			price2 = 150.0;
		} else 
			price2 = 0.0;

		totalPrice = (price+price2) * quantity;
	}

	public void calculateDiscount() {
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

		System.out.println("\nPackage Code \t : " + packageCode + " - " + packageName[0]);
		System.out.println("Island Name \t : " + islandName);

		System.out.println("\nPackage Price \t : RM " + price);
		if(addActivity.equalsIgnoreCase("y")) {
			System.out.println("Snorkeling \t : RM " + price2 + "\n");
		}
		
		System.out.println("Total Price \t : RM " + totalPrice);
		if(discountCode.length() == 4) {
			System.out.println("Discount Code \t : " + discountCode);
			System.out.println("Discount \t : RM (" + discount + ")");
			System.out.println("After Discount \t : RM " + afterDiscount);
		}
		
		do { //calculate balance
			System.out.print("\nAmount Receive \t : RM ");
			receive = scan.nextDouble();

			balance = receive - afterDiscount;
			if(receive < afterDiscount) 
				System.out.println("-> Short RM " + (afterDiscount-receive) +"\n");
		} while(receive < afterDiscount);

		System.out.println("Balance \t : RM " + balance);
		
		System.out.println("\n****** THANK YOU. ENJOY YOUR HOLIDAY *******");
		System.out.print("This is IslandPackage");
	}
}

		// try {
		// 	packageCode = scan.nextInt();
		// 	if(packageCode<1 || packageCode>3) {
		// 		throw new IllegalArgumentException("Invalid Island Code");
		// 	} 
		// } catch(Exception e) {
		// 		System.out.println(e.getMessage());
		// 	}
