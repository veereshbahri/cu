package shop;

import java.util.List;

public class Service {

	Cart cart=new Cart();
	Invoice invoice;
	public static List<Item> getItems()
	{
		return ItemDao.getItems();
	}
	public void addtoCart(Item item)
	{
		cart.addItem(item);
	}
	public Cart getCart()
	{
		return cart;
	}
	public Invoice getInvoice(Customer cus)
	{
		return new Invoice(cus, cart);
	}
}
