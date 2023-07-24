package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class OperationOnLinkedlist {

	public static void main(String[] args)
	{
		LinkedList<Integer>li=new LinkedList<>();
		li.add(0);
		li.add(2);
		li.add(7);
		li.add(1);
		li.add(3);
		li.add(4);
		li.add(8);
		li.add(5);
		System.out.println(li);

		int maxeven=0;
		int minodd=0;
		int sum;

		Collections.sort(li);
		
		for (int i = 0; i <li.size(); i++) 
		{
			int n=li.get(i);
			
			if (n%2==0) 
			{
				maxeven=n;
			
			}
		}
		for (int i = li.size(); i <1; i++) 
		{
			int n=li.get(i);
			if (n%2!=1) 
			{
				minodd=n;
			
			}
		}
		
		System.out.println("max : "+maxeven);
		System.out.println("min odd: "+minodd);
		

		System.out.println(maxeven+minodd);

	}

}
