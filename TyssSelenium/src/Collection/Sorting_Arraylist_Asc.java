package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Arraylist_Asc {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList<>();

		al.add(10);
		al.add(30);
		al.add(60);
		al.add(20);
		al.add(50);	
		al.add(40);

		System.out.println("Before Sorting :"+al);
		Collections.sort(al);
		System.out.println("After Sorting :"+al);


		ArrayList <pen> p=new ArrayList<>();
		p.add(new pen(50,"Red"));
		p.add(new pen(40,"Orange"));
		p.add(new pen(10,"Yellow"));
		p.add(new pen(10,"Red"));
		p.add(new pen(30,"White"));
		p.add(new pen(10,"Green"));
		p.add(new pen(20,"Blue"));
	

		System.out.println("Before Sorting :"+p);
		Collections.sort(p);
		System.out.println("After Sorting :"+p);


	}

}
