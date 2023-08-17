package Cart.ItemView;

import java.util.Scanner;

import Cart.Item;
import Cart.ItemController.ItemController;

public class CartItemView {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		ItemController itemcontrol=new ItemController();
		System.out.println("<<<<<<WELCOME>>>>>>>>>");
		
		while(true) 
		{
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("1.additem");
			System.out.println("2.removeitem");
			System.out.println("3.searchitem");
			System.out.println("4.displayitem");
			System.out.println("5.CalculateTotalPrice");
			System.out.println("6.exit");
			
			int c=sc.nextInt();
			switch (c) 
			{
			
			case 1:itemcontrol.additems(createItem());
			break;
			case 2:itemcontrol.removeitems(createItem());
			break;
			case 3:itemcontrol.searchitems(createItem());
			break;
			case 5:itemcontrol.calculateTotalprice();
			break;
			case 4:itemcontrol.display();
			break;
			case 6:return;
			
			default:System.out.println("ENTER VALID CHOICE");
				break;
			}
		}
	}
	public static Item createItem() {
		System.out.println("Enter Item id");
		int id=sc.nextInt();
		System.out.println("Enter Item name");
		String name=sc.next();
		System.out.println("Enter Item price");
		double price=sc.nextDouble();
		Item item=new Item(id, name, price);
		return item;	
		}
}
