package assignment;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		AddPerson  p = new AddPerson();
		System.out.println("enter the no. of person you want to add");
		Scanner sc = new Scanner(System.in);
		int person  = sc.nextInt();
		
		for(int i =1; i<=person; i++) {
			System.out.println("enter the first name :");
			String first_name = sc.nextLine();
			sc.nextLine();
			System.out.println("enter the last name :");
			String last_name = sc.nextLine();
			//sc.nextLine();
			System.out.println("enter the phone no. name :");
			String phone = sc.nextLine();
			System.out.println("enter the Address :");
			String address = sc.nextLine();
			//sc.nextLine();
			System.out.println("enter the zip code :");
			String zip = sc.nextLine();
			//sc.nextLine();
			System.out.println("enter state :");
			String state = sc.nextLine();
			//sc.nextLine();
			System.out.println("enter city :");
			String city = sc.nextLine();
			//sc.nextLine();
			System.out.println("enter email id  :");
			String email = sc.nextLine();
			
			p.show(first_name, last_name,phone,address ,zip, state, city, email);
			sc.nextLine();
			System.out.println(" ");
			
			
		}
		
		sc.close();
	}

}
