package Exception;
class ProductOutOfStockException extends Exception{
	public  ProductOutOfStockException(String msg) {
		super(msg);
	}
}
class  InventoryControl{
	public static void checkstock(int product) throws ProductOutOfStockException{
		if(product<=0) {
			throw new ProductOutOfStockException("Product is out of stock.");
		}
		System.out.println("Stock is sufficient: " + product + " items.");
		
	}
}
public class Assignment2_ProductOutofStockException {

	public static void main(String[] args) {
		 try {
			 InventoryControl.checkstock(0); 
	        } catch (ProductOutOfStockException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	}

	

}
