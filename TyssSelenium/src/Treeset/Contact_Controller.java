package Treeset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Contact_Controller 
{
	public Scanner sc=new Scanner(System.in);
	TreeSet<contact> phonebook=new TreeSet<>();
	

	public contact getcontact() {
		System.out.println("enter contact name");
		String name=sc.nextLine();
		
		System.out.println("enter contact num");
		long num=sc.nextLong();	
		
		return new contact(num,name);

	}

	public void addcontact() {
		if (phonebook.add(getcontact())) {
			System.out.println("contact added Sucessful");	
		}
		else {
			System.out.println("contact Already added ");
		}
		

	}
	public void removecontact() {
		contact con=getcontact();
		if(phonebook.contains(con)) {
			phonebook.remove(con);
			System.out.println("Contact Sucessfully Deleted");
			
		}
		else {
			System.out.println("contact not found");
		}
		
		
	}
	public void editcontact() {
		System.out.println("enter name to Search");
		String searchname = sc.nextLine();
		Iterator<contact> it = phonebook.iterator();
		boolean found = false;
		while (it.hasNext()) {
			if(it.next().getName().equalsIgnoreCase(searchname)) {
				found=true;
				it.remove();
				System.out.println("enter the new Contact detaills");
				phonebook.add(getcontact());
			}
		}
		if (found==false) {
			System.out.println("contact not found");
		}
		
	}
	public void searchcontact() {
		System.out.println("enterr name to search");
		String name=sc.nextLine();
		for (contact contact : phonebook) {
			if (contact.getName().equals(name)) {
				System.out.println("contact Found");
				System.out.println(contact);
				
			}
			else {
				System.out.println("contact not found");
			}
			
		}
	}
	public void displaycontact() {
		System.out.println(phonebook);
		
	}
	


}
