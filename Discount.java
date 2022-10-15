package ProductSell;

public class Discount extends Product {
	private double discount = .10;
	
	Discount(String name,int price,int amount){
		super(name,price, amount);
		
		
	}
	
	void finalDiscount() {
		int newPrice=(int)(getPrice()-(getPrice()*discount));
		setPrice(newPrice);
		
		
	}

}
