package Encapsulation;
class products{
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public products(int id , String name, double price , int quantity) {
		setId(id);
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}
	
	public int getId() {
		return id;
	}
	 public void setId(int id) {
	        this.id = id;
	    }

	  
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	   
	    public double getPrice() {
	        return price;
	    }
	    
	    public void setPrice(double price) {
	    	if(price>=0) {
	    		this.price=price;
	    	}
	    	else {
	    		   System.out.println("Error: Price cannot be negative.");

	    	}
	    	
	    }
	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        if (quantity >= 0) {
	            this.quantity = quantity;
	        } else {
	            System.out.println("Error: Quantity cannot be negative.");
	        }
	    }

	  
	    public double calculateTotalCost() {
	        return price * quantity;
	    }


}

public class Product {

	public static void main(String[] args) {
		products prod = new products(101, "Laptop", 750.50, 3);
        System.out.println("Product: " + prod.getName());
        System.out.println("Price per unit: " + prod.getPrice());
        System.out.println("Quantity: " + prod.getQuantity());
        System.out.println("Total Cost: " + prod.calculateTotalCost());


	}

}
