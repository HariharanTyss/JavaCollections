package Treeset;

import java.util.ArrayList;
import java.util.Scanner;


public class Driver_book {

	public static void main(String[] args) 
	{

		//create &store 5 Books
		ArrayList<Book> lib=new ArrayList<>();
		lib.add(new Book(1, "harryporter1", 2500));
		lib.add(new Book(2, "barbie1", 1800));
		lib.add(new Book(3, "mission Impossible1", 2000));
		lib.add(new Book(4, "RRR1", 2300));
		lib.add(new Book(5, "KGF1", 4000));
		
		lib.add(new Book(6, "harryporter2", 2500));
		lib.add(new Book(7, "barbie2", 1800));
		lib.add(new Book(8, "mission Impossible2", 2000));
		lib.add(new Book(9, "RRR2", 2300));
		lib.add(new Book(10, "KGF2", 4000));
		
		lib.add(new Book(11, "harryporter3", 2500));
		lib.add(new Book(12, "barbie3", 1800));
		lib.add(new Book(13, "mission Impossible3", 2000));
		lib.add(new Book(14, "RRR3", 2300));
		lib.add(new Book(15, "KGF3", 4000));

		//Read the Title from User and Check for the Availability
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Required Title");
		boolean available =false;
		Book temp=null;
		String search_data=sc.nextLine();

		long start=System.nanoTime();
		//Start search
		for (Book book : lib) 
		{
			if(search_data.equalsIgnoreCase(book.getTitle()))
			{
				//available
				available=true;
				temp=book;
			}
		}
		//end the Search
		long stop=System.nanoTime();
		
		if(available) 
		{
			System.out.println(temp.getTitle()+" is available");
		}
		else {
			System.out.println("not available");
		}

		System.out.println("Time Taken is: "+(stop-start)+"ns");
	}

}
