package ProductSell;

class Customer {
	private int initialProduct;
    private int totalCost;

    

    
    void totalPrice() {
        System.out.println(" Total product bought: "+initialProduct+" Total Cost: "+totalCost);
    }
//    void printAll() {
//    	printIt();
//    }

    int getProdAmount() {
        return this.initialProduct;
    }

    int getsumCost() {
        return this.totalCost;
    }
    void updateProduct(int price) {
    	
    	this.initialProduct = this.initialProduct+1;
    	this.totalCost = this.totalCost+price;
    	
    }

}


