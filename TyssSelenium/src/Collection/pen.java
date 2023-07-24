package Collection;

public class pen implements Comparable<pen>
{
	int price;
	String color;

	pen(int price,String color)
	{

		this.price=price;
		this.color=color;
	}
	@Override
	public String toString() {

		return "{"+"price:"+price+" color:"+color+"}";
	}

	int res;
	@Override
	public int compareTo(pen o) 
	{
		if(this.price>o.price)
			return 10;

		if(this.price<o.price)
			return -10;
	
		if(this.price==o.price)
			res=this.color.compareTo(o.color);

		return res;
	}


}
