package lib;

import java.util.Scanner;

public class Menu {

	private Scanner scan;
	
	public Menu() {
		scan = new Scanner(System.in);
	}
	
	public void display() {
		System.out.println("========================");
		System.out.println("1 - add human to the list");
		System.out.println("2 - remove human from the list");
		System.out.println("3 - display list");
		System.out.println("4 - display human data");
		System.out.println("5 - find human by name");
		System.out.println("6 - exit programm");
		System.out.println("========================");		
	}
	public int getChoice() {
		//scan = new Scanner(System.in);
		System.out.print("Select operation: ");
		int choice = Integer.parseInt(scan.nextLine());
		//scan.close();
		return choice;
	}
	
	public boolean allowContinue() {
		//scan = new Scanner(System.in);
		System.out.println("Continue? (y/n) - ");
		String answer = scan.nextLine();
		//scan.close();
		if(answer.equals("y")) 
			return true;
		return false;
	}
	
	public Human addHumanDialog() {
		//scan = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter birth date: ");
		String birthDate = scan.nextLine();
		
		System.out.print("Enter phone: ");
		String phone = scan.nextLine();
		
		System.out.print("Enter coutry: ");
		String coutry = scan.nextLine();
		
		System.out.print("Enter city: ");
		String city = scan.nextLine();
		
		System.out.print("Enter address: ");
		String addr = scan.nextLine();
		//scan.close();
		
		return new Human(name, birthDate, phone, coutry, city, addr);
	}

	public String getHumanName() {
		//scan = new Scanner(System.in);
		System.out.print("Enter human name: ");
		String res = scan.nextLine();
		//scan.close();
		return res;
	}
	
	public int getHumanId() {
		System.out.print("Enter human id: ");
		return Integer.parseInt(scan.nextLine()) - 1;
	}
	
}
