package TextEditor.Controller;

import java.util.LinkedList;
import java.util.Scanner;

public class TextEditorController 
{
	public LinkedList<String> textlist= new LinkedList();
	public LinkedList<String> dictionary= new LinkedList();
	
	public Scanner sc=new Scanner(System.in);
	int position=-1;
	
	public void save() 
	{
		System.out.println("Enter the TEXT :");
		String str=sc.nextLine();
		
		while(position<textlist.size()-1)
		{
		textlist.removeLast();	
		}
		System.out.println("Want a Suggestion enter y");
		String st=sc.next();
		
		if(st.equalsIgnoreCase("y")) {
			textlist.add(AutoSuggestion(str));
		}
		dictionary.add(str);
		position++;
		System.out.println("Save sucess");

	}
	public void undo() 
	{
		if(position>-1)
		{
			position--;
			
		}
		
	}
	public void redo() 
	{
		if(position<textlist.size()-1) {
			position++;
			
		}
	}
	public void display() 
	{
		for (int i = 0; i <=position&&position>=0; i++) {
//			System.out.println(textlist.get(i));
			System.out.println(textlist.get(i));
			
		}
		
	}
	public void addWordsToDictionary() 
	{
		System.out.println("Enter exit or quit After adding words..");
		System.out.println("Enter the Words");
		
		String str="";
		while(true) {
			str=sc.nextLine();
			
			if(str.equalsIgnoreCase("exit"))
			{
				break;
			}
			dictionary.add(str);
			
		}
		System.out.println(dictionary.size()+" Words Added Sucessfully.....!");
	}
	public String AutoSuggestion(String str) 
	{
		int i=0;
		System.out.println("Select the Words..");
		for (String word : dictionary)
		{
			i++;
			if(word.startsWith(str)) {
				System.out.println(i+"."+word);
			}
			
		}
		int n=sc.nextInt();
		return dictionary.get(--n);
		
	}
	

}
