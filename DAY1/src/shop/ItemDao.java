package shop;

import java.util.ArrayList;
import java.util.List;

public class ItemDao {

	public static List<Item> getItems()
	{
		List<Item> list=new ArrayList<Item>();
		list.add(new Item("tv",100000));
		list.add(new Item("phone",10000));
		list.add(new Item("microv",9000));
		return list;
		
		
	}
}
