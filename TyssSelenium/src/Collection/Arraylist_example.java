package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_example {

	public static void main(String[] args) 
	{

		ArrayList bag=new ArrayList();
		pen p=new pen(300,"Red");
		bag.add(p);
		bag.add(new pen(400,"Yellow"));
		bag.add(new pen(500,"pink"));
		bag.add(new pen(600,"green"));
		bag.add(new pen(700,"white"));
		

	
		//To get all element and print
		for (int i = 0; i < bag.size(); i++)
		{
			System.out.println((pen)bag.get(i));
		}

		System.out.println("++++++++++++++++");
		
		//To use ListIterator
		ListIterator li=bag.listIterator();

		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("+============+");

		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
