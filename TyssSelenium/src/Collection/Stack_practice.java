package Collection;

import java.util.Stack;

public class Stack_practice {

	public static void main(String[] args) 
	{
		

		Stack st=new Stack<>();
		System.out.println(st.empty());
		st.add(10);
		st.add(50);
		st.add(30);
		st.add(160);
		st.add(80);
		System.out.println(st.empty());
	
		System.out.println(st);
		st.push(110);
		
		System.out.println(st);
		st.remove(0);
		st.peek();
		System.out.println("==========");
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println("index is "+st.search(160));
		

	}

}
