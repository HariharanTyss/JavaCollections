package Treeset;

public class Book implements Comparable<Book>
{
	private int bid;
	private String title;
	private double price;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int bid, String title, double price) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book:[bid:"+bid+", title:"+title+", price:"+price+"]";
	}
	@Override
	public boolean equals(Object obj) {
		Book b=(Book)obj;
		
		if(this.bid!=b.bid)
			return false;
		if(this.price!=b.price)
			return false;
		if(this.title.equals(b.title))
			return false;
		return true;
		
	}
	@Override
	public int hashCode() {
		int hc=bid;
		hc+=title.hashCode();
		hc+=Double.valueOf(price).hashCode();
		
		return hc;
	}
	@Override
	public int compareTo(Book o) 
	{
		if(this.hashCode()>o.hashCode())
		return 1;
		if(this.hashCode()<o.hashCode())
			return -1;
		else
			return 0;
	}
	
	
	

}
