package Collection;

public class Employee 
{
	int id;
	String name;
	String dept;
	
	public Employee(int id, String name, String dept) {
		
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		
		
		return "("+id+","+name+","+dept+")";
	}
	@Override
	public int hashCode() {
		
		return name.hashCode()+dept.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		return dept.equals((Employee)obj);
	}

}
