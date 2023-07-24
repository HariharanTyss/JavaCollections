package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_Practice 
{
	public static void main(String[] args)
	{
		ArrayList arr=new ArrayList();
		pen p=new pen(10,"blue");
	
		//Adding the Element
		arr.add("Qspiders");
		arr.add(p);
		arr.add(10);
		arr.add("Cello");
		arr.add(true);
		arr.add(4, false);
		arr.add('A');
		arr.add(new pen(20,"Green"));
		
		
		//System.out.println(arr);
		
		//Print All elements
		for (int i = 0; i < arr.size(); i++) 
		{
			System.out.println(i+"--->"+arr.get(i));
		}
		System.out.println("===================");
		
		//Remove and Replace the Element and print
		
		arr.remove(2);
		arr.remove(p);
		arr.set(0,"Jspiders");
		
		
		for (Object object : arr) 
		{
			System.out.println(object);
			
		}
		System.out.println("++++++++++++++++++++++");
		
		//Using Iterator
		Iterator i=arr.iterator();
		
		while(i.hasNext()) {
				System.out.println(i.next());
		}
		System.out.println("=======+======>");
		
		//Using List Iterator frwd
		ListIterator li=arr.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("=============>");
		
		//Using List Iterator Bckwrd
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		

	}

}
