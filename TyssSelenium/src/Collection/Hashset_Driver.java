package Collection;

import java.util.HashSet;

public class Hashset_Driver {

	public static void main(String[] args) {
		
		HashSet<Employee> emp=new HashSet<>(10);
		
		emp.add(new Employee(10,"leela","dev"));
		
		
		
		Employee e1=new Employee(16, "Sheela", "Test");
		emp.add(e1);
		
		emp.add(new Employee(100,"leela","devp"));
		
		for (Employee employee : emp) {
			int index=(emp.hashCode())%10;
			System.out.println("Index:"+index+"---->"+emp);
		}
		

	}

}
