package Treeset;

public class Pen implements Comparable <Pen>{
	double price;
	String color;
	public Pen(double price, String color) {
		super();
		this.price = price;
		this.color = color;
	}
	@Override
	public int hashCode() {
		int hc=0;
		hc=hc+Double.valueOf(price).hashCode();
		hc=hc+color.hashCode();
		return hc;
	}
	@Override
	public int compareTo(Pen o) {
		Pen p1=(Pen)o;
		if(this.price>o.price) 
		{
			return 1;
		}
		else if(this.price<o.price) 
		{
			return -1;
		}
		
		
		return 0;
	}

}
