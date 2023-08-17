package Treeset;

import java.util.Scanner;

public class Contact_View {
	

	public static void main(String[] args) 
	{
		Contact_Controller tec=new Contact_Controller();
		System.out.println("<<<<<<Welcome>>>>>>>");

		while(true) 
		{
			System.out.println("1.addcontact");
			System.out.println("2.removecontact");
			System.out.println("3.editcontact");
			System.out.println("4.searchcontact");
			System.out.println("5.displaycontact");
			System.out.println("6.exit");

			System.out.println("Enter the Choice");
			int c=tec.sc.nextInt();
			tec.sc.nextLine();
			switch (c) {
			
			case 1:tec.addcontact();
			break;
			case 2:tec.removecontact();
			break;
			case 3:tec.editcontact();
			break;
			case 4:tec.searchcontact();
			break;
			case 5:tec.displaycontact();
			break;
			case 6:return;
			default:System.out.println("Enter the Valid Choice");
				
			}
		}

	}

	
}
