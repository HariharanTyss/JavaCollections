package Collection;

import java.util.LinkedList;

public class Driver {

	public static void main(String[] args)
	{

		LinkedList<Emp> e=new LinkedList<>();
		e.add(new Emp("Ram",10000,"Dev"));
		e.add(new Emp("Miller",15000,"Dev"));
		e.add(new Emp("Smith",20000,"Test"));
		
		//Print All elememnts
		System.out.println(e);
	}

}
