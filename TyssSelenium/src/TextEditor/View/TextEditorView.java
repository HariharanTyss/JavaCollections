package TextEditor.View;

import TextEditor.Controller.TextEditorController;

public class TextEditorView {

	public static void main(String[] args)
	{
		TextEditorController tec=new TextEditorController();
		System.out.println("Welcome to TextEditor....!!");

		while(true) 
		{
			System.out.println("1.save");
			System.out.println("2.undo");
			System.out.println("3.redo");
			System.out.println("4.display");
			System.out.println("5.AddWordsToDictionary");
			System.out.println("6.exit");

			int c=tec.sc.nextInt();
			tec.sc.nextLine();
			switch (c) {
			
			case 1:tec.save();
			break;
			case 2:tec.undo();
			break;
			case 3:tec.redo();
			break;
			case 4:tec.display();
			break;
			case 5:tec.addWordsToDictionary();
			break;
			case 6:return;
			default:System.out.println("Enter the Valid Choice");
				
			}
		}

	}

}
