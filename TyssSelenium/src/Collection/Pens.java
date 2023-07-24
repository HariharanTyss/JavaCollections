package Collection;

import java.util.Comparator;

public class Pens implements Comparator<Pens>
{
	int price;
	String color;

	Pens(int price,String color)
	{

		this.price=price;
		this.color=color;
	}
	@Override
	public String toString() {

		return "{"+price+","+color+"}";
	}
	

	@Override
	public int compare(Pens o1, Pens o2) {
		
		return o1.price-o2.price;
	}

	public Pens(){
		
	}

}
