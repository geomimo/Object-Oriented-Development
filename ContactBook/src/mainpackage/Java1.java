package mainpackage;

import java.io.IOException;
import java.util.Scanner;

public class Java1 {

	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
 
		
		boolean exit = false;
		do {
			System.out.println("Choose:\n"
					+ "A: Create Contact.\n"
					+ "B: Delete Contact.\n"
					+ "C: Search Contact.\n"
					+ "D: Update Contact.\n"
					+ "E: View All Contacts.\n"
					+ "X: Exit.");
			
			switch(keyboard.nextLine().toUpperCase()) {
			case("A"):
				User.createContact();
				break;
			case("B"):
				User.deleteContact();
				break;
			case("C"):
				User.searchContact();
				break;
			case("D"):
				User.updateContact();
				break;
			case("E"):
				User.viewAllContacts();
				break;
			case("X"):
				System.out.println("Goodbye!");
				exit = true;
				break;
			default:
				System.out.println("This option does not exist!");
				break;
			}
		
		}while(!exit);
		

	}

}
