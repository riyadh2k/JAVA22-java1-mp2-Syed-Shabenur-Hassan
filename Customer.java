package ProductSell;

class Customer {
	private int initialProduct;
    private int totalCost;

    

    
    void totalPrice() {
        System.out.println(" Total product bought: "+initialProduct+" Total Cost: "+totalCost);
    }

    void updateProduct(int price) {
    	
    	this.initialProduct = this.initialProduct+1;
    	this.totalCost = this.totalCost+price;
    	
    }

}


