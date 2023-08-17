package Cart.ItemController;

import java.util.HashSet;

import Cart.Item;

public class ItemController {

	private HashSet<Item>control=new HashSet<>();
	
	public void additems(Item item) 
	{
		control.add(item);
		System.out.println("Item added Sucess");
	}
	
	public void removeitems(Item item) 
	{
		if(control.remove(item)) 
		{
			System.out.println("Item removed sucess");
		}
		else {
			System.out.println("item not present");
		}
	}
	public void searchitems(Item item) 
	{
		if(control.contains(item)) 
		{
			System.out.println("Item is present");
			System.out.println(item);
		}
		else {
			System.out.println("item not present");
		}
	}
	public void calculateTotalprice() 
	{
		int totprice=0;
		for (Item item : control) 
		{
			totprice+=item.getItemprice();
		}
		System.out.println("Total price:"+totprice);
	}
	
	public void  display() 
	{
		System.out.println("Cart item.....!!!");
		for (Item item : control) {
			System.out.println(item);
		}
		
		
	}
	
	
	

}
