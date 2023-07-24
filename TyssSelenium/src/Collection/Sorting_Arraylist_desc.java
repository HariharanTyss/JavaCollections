package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Arraylist_desc {

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


		ArrayList <Pens> p=new ArrayList<>();
		p.add(new Pens(50,"Red"));
		p.add(new Pens(40,"Orange"));
		p.add(new Pens(10,"Yellow"));
		p.add(new Pens(10,"Red"));
		p.add(new Pens(30,"White"));
		p.add(new Pens(10,"Green"));
		p.add(new Pens(20,"Blue"));
	

		System.out.println("Before Sorting :"+p);
		Collections.sort(p, new Pens());
		System.out.println("After Sorting :"+p);


	}

}
