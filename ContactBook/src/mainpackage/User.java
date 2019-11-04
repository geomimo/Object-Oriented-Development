package mainpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.UUID;

public class User {

	private static Scanner keyboard = new Scanner(System.in);
	
	
	/**
	 * Creates a new contact. 
	 * Asks user to give the new contact's information, checks for valid input
	 * and saves the new contact in 'Contacts.txt'.
	 */
	public static void createContact() {
		String input;
		System.out.println("Type 'exit' anytime to exit.");
		
		Contact contact = new Contact();
		
		//Asks user for an input.
		do {
			if((input = getInputOrExit("Give name.")) == null) return; //If input is 'exit', return ;
			if(!validName(input)) { //If info is invalid, ask again for new valid input.
				System.out.println("Wrong name format. Please try again.");
				continue;				
			}
			contact.setName(input); //Set the input to the new contact's info.
			break;
		}while(true);
		
		do {
			if((input = getInputOrExit("Give phone number.")) == null) return;
			if(!validPhoneNumber(input)) { 
				System.out.println("Wrong phone number format. Please try again.");
				continue;				
			}
			contact.setPhoneNumber(input);
			break;			
		}while(true);
	
		do {
			if((input = getInputOrExit("Give email.")) == null) return;
			if(!validEmail(input)) { 
				System.out.println("Wrong email format. Please try again.");
				continue;				
			}
			contact.setEmail(input);
			break;			
		}while(true);
		
		do {
			if((input = getInputOrExit("Give address.")) == null) return;
			if(!validAddress(input)) { 
				System.out.println("Wrong address format. Please try again.");
				continue;				
			}
			contact.setAddress(input);
			break;			
		}while(true);
		
		//Check if the new contact's name or phone already exists.
		if(getContact(contact.getName()) != null || getContact(contact.getPhoneNumber()) != null) {
			System.out.println("This contact already exists.");
			return;
		}
		
		if (saveContact(contact)) System.out.println("A new contact has been created successfully!");
		
	}
	
	
	/**
	 * Deletes a contact.
	 * Asks user for a name or phone number of a contact to delete.
	 * Overloaded.
	 */
	public static void deleteContact() {
		String input;
		System.out.println("Type 'exit' anytime to exit.");
		Contact contact;
		
		do {
			if((input = getInputOrExit("Give name or phone number of a contact to delete.")) == null) return;
			if(!validName(input) && !validPhoneNumber(input)) { 
				System.out.println("Wrong name or phone number format. Please try again.");
				continue;				
			}
		}while(false);
			
		//Check if exists.
		contact = getContact(input); 
		if(contact == null) {	
			System.out.println("Contact not found!");
			return;
		}
		
		if(deleteContact(contact)) System.out.println("Contact has been deleted.");
					
	}
	
	
	/**
	 * Searches and shows a contact.
	 * Asks user for a name or phone number of a contact to search and show.
	 */
	public static void searchContact() {
		String input;
		System.out.println("Type 'exit' anytime to exit.");
		Contact contact;
		
		do {
			if((input = getInputOrExit("Give name or phone number of a contact to search.")) == null) return;
			if(!validName(input) && !validPhoneNumber(input)) { 
				System.out.println("Wrong name or phone number format. Please try again.");
				continue;				
			}
		}while(false);
			
		//Check if exists.
		contact = getContact(input); 
		if(contact == null) {	
			System.out.println("Contact not found!");
			return;
		}
				
		
		String output = "Name: " + contact.getName() + "\n" +
						"Phone Number: " + contact.getPhoneNumber() + "\n" +
						"Email: " + contact.getEmail() + "\n" +
						"Address: " + contact.getAddress() + "\n";
		System.out.println(output);
	}

	
	/**
	 * Updates a contact's information.
	 * Asks a name or phone number of a contact to update
	 * its name, phone number, address or email.
	 */
	public static void updateContact() {
		String input;
		System.out.println("Type 'exit' anytime to exit.");
		Contact oldContact, newContact;
		
		do {
			if((input = getInputOrExit("Give name or phone number of a contact to update.")) == null) return;
			if(!validName(input) && !validPhoneNumber(input)) { 
				System.out.println("Wrong name or phone number format. Please try again.");
				continue;				
			}
		}while(false);
			
		//Check if exists.
		oldContact = getContact(input); 
		if(oldContact == null) {	
			System.out.println("Contact not found!");
			return;
		}
				
		
		newContact = oldContact;
		
		if((input = getInputOrExit("Update:\n"
				+ "A: Name\n"
				+ "B: Phone Number\n"
				+ "C: Email\n"
				+ "D: Address")) == null) return;
		
		switch(input.toUpperCase()) {
		case "A":
			do {
				if((input = getInputOrExit("Give new name.")) == null) return;
				if(!validName(input)) { 
					System.out.println("Wrong name format. Please try again.");
					continue;				
				}
				newContact.setName(input);
				break;			
			}while(true);
			break;
			
		case "B":
			do {
				if((input = getInputOrExit("Give new phone number.")) == null) return;
				if(!validPhoneNumber(input)) { 
					System.out.println("Wrong phone number format. Please try again.");
					continue;				
				}
				newContact.setPhoneNumber(input);
				break;			
			}while(true);
			break;
			
			
		case "C":
			do {
				if((input = getInputOrExit("Give new email.")) == null) return;
				if(!validEmail(input)) { 
					System.out.println("Wrong email format. Please try again.");
					continue;				
				}
				newContact.setEmail(input);
				break;			
			}while(true);
			break;
			
		case "D":	
			do {
				if((input = getInputOrExit("Give new address.")) == null) return;
				if(!validAddress(input)) { 
					System.out.println("Wrong address format. Please try again.");
					continue;				
				}
				newContact.setAddress(input);
				break;			
			}while(true);
			break;		
		}
		
		
		if(getContact(newContact.getName()) != null && getContact(newContact.getPhoneNumber()) != null){
			System.out.println("This contact already exists.");
			return;
		}
		
		//Delete the old one and save the new one.
		if(deleteContact(oldContact) && saveContact(newContact)) System.out.println("Contact has been updated."); 
	
	}
	
	
	/**
	 * Shows all contacts.
	 */
	public static void viewAllContacts() {
		try {
			FileInputStream fstream = new FileInputStream("Contacts.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String line;
			int count = 0; 
			while ((line = br.readLine()) != null) {
				count++;
				String[] data = line.split(",");
						
				String output = "***********************************\n" + 
						"Name: " + data[1] + "\n" +
						"Phone Number: " + data[2] + "\n" +
						"Email: " + data[3] + "\n" +
						"Address: " + data[4] + "\n";
				System.out.println(output);
			}
			
			if(count == 0) System.out.println("Empty Address Book.");
			
			br.close();
			fstream.close();
		} catch (IOException e) {
			System.out.println("IO error. " + e);
		}
	}

	/**
	 * Checks and asks for a valid input and returns null or the input.
	 * @param print the message to print
	 * @return Null for 'exit', otherwise the input.
	 */
	private static String getInputOrExit(String print) {
		System.out.println(print);
		String input;
		input = keyboard.nextLine();		
		return input.toLowerCase().equals("exit") ? null : input;
	}
	
	
	/**
	 * Saves a contact in 'Contacts.txt'
	 * Data format: id, name, phoneNumber, email, address
	 * @param contact
	 * @return true if save was successful, false otherwise.
	 */
	private static boolean saveContact(Contact contact) {
		try {
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Contacts.txt", true), "utf-8"));
			String data = contact.getId() + "," +
						  contact.getName() + "," + 
						  contact.getPhoneNumber() + "," + 
						  contact.getEmail() + "," +
						  contact.getAddress() + "\n";
			
			writer.write(data);
			writer.close();
			return true;
		}catch(IOException e) {
			System.out.println("Saving error " + e);
			return false;
		}
	}	
	
	
	/**
	 * Deletes a contact from 'Contacts.txt'
	 * Copies the file, without the contact we want to delete. Then deletes the old file and renames the new.
	 * Overloaded.
	 * @param contact
	 * @return true if delete was successful, false otherwise.
	 */
	private static boolean deleteContact(Contact contact) {
		try {
			FileInputStream finstream = new FileInputStream("Contacts.txt");//Old file
			BufferedReader br = new BufferedReader(new InputStreamReader(finstream));
			
			FileOutputStream foutstream = new FileOutputStream("temp.txt");//New file
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(foutstream));
			
			String line;
			while ((line = br.readLine()) != null)   {
				String[] data = line.split(",");
				//Skip the contact we want to delete.
				if (data[0].equals(contact.getId().toString()) || data[1].equals(contact.getName()) || data[2].equals(contact.getPhoneNumber())) { 
					continue;
				}
				else {
					bw.write(line + "\n");
				}			  
			}
			br.close();
			finstream.close();
			bw.close();			
			foutstream.close();
		}catch(IOException e) {
			System.out.println("Deleting error " + e);
			return false;
		}
		
		File oldFile = new File("Contacts.txt");
		File newFile = new File("temp.txt");
		
		//Delete old one and rename the new one.
		try {
			Files.delete(oldFile.toPath());
			Files.move(newFile.toPath(), oldFile.toPath());			
		}catch(IOException e) {
			System.out.println("Renaming error " + e);
			return false;
		}
		return true;
	}
	
	
	/**
	 * Returns a contact based on a key.
	 * @param key, may be id, name, phone number.
	 * @return the contact
	 */
	private static Contact getContact(String key) {
		try {
			FileInputStream fstream = new FileInputStream("Contacts.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String line;
			
			while((line = br.readLine()) != null ) {
				String[] data = line.split(",");
				
				if(data[0].equals(key) || data[1].equals(key) || data[2].equals(key)) {
					br.close();
					fstream.close();
					return new Contact()
							.setId(UUID.fromString(data[0]))
							.setName(data[1])
							.setPhoneNumber(data[2])
							.setEmail(data[3])
							.setAddress(data[4]);										
				}
			}
			
			br.close();
			fstream.close();
		}catch(IOException e) {
			System.out.println("Getting error " + e);
		}
		
		return null;
	}
	
	
	/**
	 * Checks for valid name.
	 * @param name
	 * @return true if valid, false otherwise.
	 */
	private static boolean validName(String name) {
		return name.matches("^[a-zA-Z]+[\\s_a-zA-Z0-9]*$");
	}
	
	
	/**
	 * Checks for valid phone number.
	 * @param name
	 * @return true if valid, false otherwise.
	 */
	private static boolean validPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^\\d{10}$");
	}
	
	
	/**
	 * Checks for valid email.
	 * @param name
	 * @return true if valid, false otherwise.
	 */
	private static boolean validEmail(String email) {
		return email.matches("^\\w+@\\w+\\.[a-z]{2,6}$");
	}
	
	
	/**
	 * Checks for valid address.
	 * @param name
	 * @return true if valid, false otherwise.
	 */
	private static boolean validAddress(String address) {
		return address.matches("^\\w+\\s?\\w+[\\s\\,\\.]?\\s?\\w+\\-?\\w*$");
	}
	
	
	
	
}
