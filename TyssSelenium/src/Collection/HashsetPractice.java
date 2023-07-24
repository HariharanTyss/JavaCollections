package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashsetPractice {

	public static void main(String[] args) 
	{

		ArrayList al=new ArrayList<>();
		al.add(100);
		al.add("jsp");
		al.add(100);
		System.out.println(al);
		
		HashSet hs=new HashSet<>();
		hs.add(10);
		hs.add("Qsp");
		hs.add(true);
		hs.add(10.2);
		hs.add('a');
		hs.add(10);
		hs.add(100);
		hs.addAll(al);
		hs.add(null);
		
		//Collections.sort(hs);
		System.out.println(hs);
	}

}
