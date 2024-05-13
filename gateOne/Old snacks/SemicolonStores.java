import java.util.*;

public class SemicolonStores{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

		System.out.print("What is the customer's name ? : ");

			String customerName = scanner.nextLine();
	String decisionMade;
		ArrayList<String> goods = new ArrayList<String>();
		ArrayList<Integer> quantities = new ArrayList<Integer>();
		ArrayList<Float> totalPrice = new ArrayList<Float>();
		ArrayList<Float> total = new ArrayList<Float>();
		float totalAmount1 = 0;
		int count = 0;

	do {
		System.out.print(" ");
			String blank = scanner.nextLine();
		System.out.println("What did user buy ?");
			String goodsPurchased = scanner.nextLine();
					goods.add(goodsPurchased);
					count += 1;

		System.out.println("how many pieces ? ");
			int quantity = scanner.nextInt();
				quantities.add(quantity);

		System.out.println("How much per unit ? ");
			float pricePerUnit = scanner.nextFloat(); 
				totalAmount1 += pricePerUnit * quantity;
				totalPrice.add(pricePerUnit);

		System.out.println("Add more items ?(yes / no): ");
			 decisionMade = scanner.next();

		total.add(quantity * pricePerUnit);
		} while(decisionMade.equalsIgnoreCase("yes"));

		

System.out.print(" ");
			String blan = scanner.nextLine();
System.out.println("What is your name  ? ");
	String nameOfCashier = scanner.nextLine();

System.out.println("How much discount will He/She get ? ");
	int customerDiscount = scanner.nextInt();
System.out.print(" ");
float discount = totalAmount1 * customerDiscount /100;
double vat = totalAmount1 * 17.50 /100;
double bill = totalAmount1 - discount + vat;




System.out.print("\n\nSemicolon stores\nMain  Branch\nLocation: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS.\nTel : 03293828343\nDate : 18 - Dec - 22 8 : 48 : 11 pm");
System.out.print("\nCashier  : " + nameOfCashier);
System.out.print("\nCustomer Name  : " + customerName);
System.out.print("\n\n============================================");

System.out.println("\n" + "\tITEM\tQTY\tPRICE\tTOTAL(NGN)\n\n----------------------------------------------------------------------");
for(int i = 0; i < goods.size(); i++){
System.out.println("\t" + goods.get(i) + "\t"+ quantities.get(i) + "\t" + totalPrice.get(i) + "\t"+ total.get(i));
}
System.out.print("-------------------------------------------------------------------------------");
System.out.print("\n" + "\t\t\tSub Total : " + totalAmount1);
System.out.print("\n" + "\t\t\tDiscount : " + discount);
System.out.print("\n" +"\t\t\tVat @ 17.50% :" + vat);
System.out.print("\n-----------------------------------------------------------------------------");
System.out.print("\n\t\t\tBill Total : " + bill);
System.out.print("\n==========================================================");
System.out.print("\nThis Is Not An RECEIPT KINDLY Pay  " + bill);
System.out.print("\n" + "=====================================================");


System.out.println("\n" + "How much did the customer give to you? ");
int customerInput = scanner.nextInt();



System.out.print("\n\n\n\n\n\n\n ");



double balance = customerInput - bill;
System.out.print("SEMICOLON STORES\nMAIN BRANCH\nLOCATION : 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL : 18-Dec-22 8 : 57 : 31 pm\nCashier : " + nameOfCashier +"\nCustomer Name : " + customerName);
System.out.print("\n\n===========================================================================");

System.out.println("\n\tITEM\tQTY\tPRICE\tTOTAL(NGN)\n\n-----------------------------------------------------------------------------------------");
for(int i = 0; i < goods.size(); i++){
System.out.println("\t" + goods.get(i) + "\t"+ quantities.get(i) + "\t" + totalPrice.get(i) + "\t"+ total.get(i));
}
System.out.print("------------------------------------------------------------------------------------------------------");
System.out.print("\n" + "\t\t\tSub Total : " + totalAmount1);
System.out.print("\n" + "\t\t\tDiscount : " + discount);
System.out.print("\n" +"\t\t\tVat @ 17.50% :" + vat);
System.out.print("\n-----------------------------------------------------------------------------------------------------");
System.out.print("\n\t\t\tBill Total : " + bill);
System.out.print("\n" + "\t\t\tAmount Paid : " + customerInput);
System.out.print("\n" + "\t\t\tBalance : " + balance);
System.out.print("\n================================================================================");
System.out.print("\nThanks You For Your Patronage");
System.out.print("\n================================================================================");

}

}