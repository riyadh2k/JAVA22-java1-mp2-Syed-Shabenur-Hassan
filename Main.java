package ProductSell;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customer kund = new Customer();
		Product varor = new Product("Pringles", 50, 20);
		Product varor2 = new Product("Chips", 20, 10);
		Discount dsp = new Discount("Ballon",100,15);
		dsp.finalDiscount();

		int input;

		do {
			System.out.println("\n1. Buy "+varor.getName()+", "+varor.getPrice()+" SEK, "+ varor.getAmount());
			System.out.println("2. Buy "+varor2.getName()+", "+varor2.getPrice()+" SEK, "+ varor2.getAmount());
			System.out.println("3. Buy "+dsp.getName()+", "+dsp.getPrice()+" SEK, "+ dsp.getAmount());
			System.out.println("4. Quit");
			System.out.println("Choose Your Option: ");

			input = sc.nextInt();

			switch (input) {

			case 1:
				if(varor.getAmount()==0) {
				break;
				}
				kund.updateProduct(varor.getPrice());
				varor.setAmount();
				break;

			case 2:
				if(varor2.getAmount()==0) {
					break;
					}
					kund.updateProduct(varor2.getPrice());
					varor2.setAmount();
					break;

			case 3:
				if(dsp.getAmount()==0) {
					break;
					}
					kund.updateProduct(dsp.getPrice());
					dsp.setAmount();
					break;
			}

		} while (input != 4);
		
		kund.totalPrice();

	}
}
