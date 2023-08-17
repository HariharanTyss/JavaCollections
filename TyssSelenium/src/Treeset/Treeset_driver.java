package Treeset;

import java.util.TreeSet;

public class Treeset_driver {

	public static void main(String[] args)
	{
		TreeSet<Pen> p=new TreeSet<>();
		
		p.add(new Pen(10, "red"));
		p.add(new Pen(12, "blue"));
		p.add(new Pen(13, "green"));
		p.add(new Pen(14, "orange"));
		p.add(new Pen(10, "red"));
		System.out.println(p);
		System.out.println("-------------");
		Pen p1=new Pen(10, "red");
		Pen p2=new Pen(10, "red");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		

	}

}
