package Collection;

public class Emp {

	public String name;
	public int sal;
	public String dept;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	Emp(String name,int sal,String dept)
	{
		this.name=name;
		this.sal=sal;
		this.dept=dept;
	}
	
	
	@Override
	public String toString() {

		return "{"+name+","+sal+","+dept+"}";
	}
	
	
	

}
