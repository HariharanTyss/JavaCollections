package Treeset;

public class contact implements Comparable<contact>
{
	private long num;
	private String name;
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public contact(long num, String name) {
	
		this.num = num;
		this.name = name;
	}
	@Override
	public int compareTo(contact o)
	{
		return 0;
	}
	@Override
	public String toString() {
		
		return "[name:"+name+",num:"+num+"]";
	}
	
}
