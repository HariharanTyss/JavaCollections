package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_practice {

	public static void main(String[] args) {
		Vector vc=new Vector<>();
		vc.add(70);
		vc.add(1, 60);
		vc.add(30);
		vc.add(30);
		vc.add(40);
		vc.add(5, 50);
//		vc.add("qsp");
//		vc.add("jsp");
//		vc.add("jsp");
//		vc.add("pysp");
		
		Collections.sort(vc);
		System.out.println(vc);
		System.out.println();
		
		Enumeration<Integer> e=vc.elements();
		
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		

	}

}
