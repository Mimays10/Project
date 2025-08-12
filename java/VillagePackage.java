import java.util.Scanner;

class VillagePackage extends HolidayPackage {
	Scanner scan = new Scanner(System.in);

	String addActivity, packageCode, villageName, discountCode;
	String[] packageName = new String[3];
	int quantity, villageCode;
	double price, price2, totalPrice=0, balance=0, receive, discount=0, afterDiscount;

	VillagePackage(String name, String phoneNum, String packageName[], int quantity, String packageCode) {
		super(name, phoneNum, quantity);
		this.packageName = packageName;
		this.quantity = quantity;
		this.packageCode = packageCode;
	}

	void selectVillage() {
		System.out.println("\n************ AVAILABLE PACKAGE ************");
		System.out.println("Village Code    Description          Price (RM)");
		System.out.println("        1      	Kampung Air Puteri   300.00");
		System.out.println("        2      	Kampung Sri Pantai   400.00");
		System.out.println("        3      	Kampung Sri Lalang   500.00");

		System.out.print("\nEnter Village Code : ");
		villageCode = scan.nextInt();
		scan.nextLine();
	}

	void calculatePrice() {

		if(villageCode == 1) {
			price = 300.00;
			villageName = "KAMPUNG AIR PUTERI, MERSING";

		} else if(villageCode == 2) {
			price = 400.00;
			villageName = "KAMPUNG SRI PANTAI, MERSING";

		} else if(villageCode == 3) {
			price = 500.00;
			villageName = "KAMPUNG SRI LALANG, MERSING";

		} else  
			System.out.println("Invalid Village Code");

		System.out.print("Add on cycling for RM60? (Y/N) : ");
		addActivity = scan.nextLine();

		if(addActivity.equalsIgnoreCase("y") || addActivity.equalsIgnoreCase("Y")) {
			price2 = 60.0;
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

		System.out.println("\nPackage Code \t : " + packageCode + " - " + packageName[1]);
		System.out.println("Island Name \t : " + villageName);

		System.out.println("\nPackage Price \t : RM " + price);
		if(addActivity.equalsIgnoreCase("y") || addActivity.equalsIgnoreCase("Y")) {
			System.out.println("Cycling \t : RM " + price2 + "\n");
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
		System.out.print("This is VillagePackage");
	}
}