package shop;

public class Invoice {

	private Customer cus;
	private Cart cart;
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Invoice(Customer cus, Cart cart) {
	
		this.cus = cus;
		this.cart = cart;
	}
	
	
}
