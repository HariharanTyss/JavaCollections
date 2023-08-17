package Collection;

import java.util.Comparator;

public class Hotel implements Comparable<Hotel>
{
	int price;
	String dish="Dosa";

	Hotel(int price)
	{
		this.price=price;
		this.dish=dish;
	}
	@Override
	public String toString() {

		return "{"+price+","+dish+"}";
	}
	@Override
	public int compareTo(Hotel o) {
		
		return dish.compareTo(o.dish);
	}
}
