import java.util.Scanner;

public class Booking {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String name, phoneNum, packageCode;
		String[] packageName = {"ISLAND PACKAGE", "VILLAGE PACKAGE", "LUXURY PACKAGE"};
		int quantity=0;
		
		boolean validInput;

		System.out.println("************ ENTER BOOKING INFO ************");
		System.out.print("Enter Name : ");
		name = scan.nextLine();
		System.out.print("Enter Phone Number : ");
		phoneNum = scan.nextLine();

		do { //do-while loop
			System.out.print("Enter Quantity : ");
			validInput = true;

			try { //try-catch concept
				quantity = scan.nextInt();
				scan.nextLine();
				if(quantity < 0) {
					System.out.println("value should be more than 0");
					validInput = false;
				}
			} catch(Exception e) {
				System.out.println("You must enter number in quantity");
				scan.nextLine();
				validInput = false;
			} finally {
				
			}
		} while(!validInput);

		System.out.println("\n************ CHAMPION TRAVEL AGENCY ************");
		System.out.println("Package Code     Description");
		System.out.println("        P001     ISLAND PACKAGE");
		System.out.println("        P002     VILLAGE PACKAGE");
		System.out.println("        P003     LUXURY PACKAGE");

		System.out.print("\nEnter Package Code : ");
		packageCode = scan.nextLine();

		if(packageCode.equalsIgnoreCase("P001")) {
			HolidayPackage Hpackage = new IslandPackage(name, phoneNum, packageName, quantity, packageCode);
			IslandPackage Ipackage = (IslandPackage) Hpackage;

			Ipackage.selectIsland();
			Hpackage.calculatePrice();
			Hpackage.calculateDiscount();
			Ipackage.displaySummary();

		} else if(packageCode.equalsIgnoreCase("P002")) {
			HolidayPackage Hpackage = new VillagePackage(name, phoneNum, packageName, quantity, packageCode);
			VillagePackage Vpackage = (VillagePackage) Hpackage;

			Vpackage.selectVillage();
			Hpackage.calculatePrice();
			Hpackage.calculateDiscount();
			Vpackage.displaySummary();

		} else if(packageCode.equalsIgnoreCase("P003")) {
			HolidayPackage Hpackage = new LuxuryPackage(name, phoneNum, packageName, quantity, packageCode);
			LuxuryPackage Lpackage = (LuxuryPackage) Hpackage;

			Lpackage.selectHotel();
			Hpackage.calculatePrice();
			Hpackage.calculateDiscount();
			Lpackage.displaySummary();

		} else  
			System.out.println("Invalid Package Code.");
	}
}