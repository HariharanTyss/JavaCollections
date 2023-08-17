package Treeset;

public class Driver {

	public static  void main(String[] args) 
	{

		//Instance for String
		print<String> p1=new print();
		p1.print("QSP");
		
		//Instance for int
		print<Integer> p2=new print<>();
		p2.print(100);
		
		//Instance for double
		print<Double> p3=new print<>();
		p3.print(100.11);		
		
	}

}
