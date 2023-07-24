package Collection;

import java.util.ArrayList;

public class Arraylist_Bag {

	public static void main(String[] args) 
	{
		ArrayList bag=new ArrayList();
		bag.add("Java");
		bag.add("selenium");
		bag.add("Sql");
		//System.out.println(bag);

		bag.add(2, "Manual");
		//System.out.println(bag);

		ArrayList bag2=new ArrayList();
		bag2.add(10);
		bag2.add(20);
		bag2.add(10);
		bag2.add(true);
		bag2.add( bag);
		System.out.println(bag2);

		//		bag2.remove(2);
		//		System.out.println(bag2);

		//		Object o=10;
		//		bag2.remove(o);
		//		System.out.println(bag2);

		bag.removeAll(bag);
		System.out.println(bag2);
		
//		bag.clear();
//		System.out.println(bag);





	}

}
