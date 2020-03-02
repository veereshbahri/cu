package shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<Item> list=new ArrayList<Item>();

	public List<Item> getList() {
		return list;
	}

	public void setList(List<Item> list) {
		this.list = list;
	}
	public void addItem(Item item)
	{
		list.add(item);
	}

}
