package com;

import java.util.*;

public class AddressBook {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String city;
		String state;
		int zip;
		long phoneNo;
		Scanner sc = new Scanner(System.in);
		Details deetail[] = new Details[100];
		int i, count = 0, choice = 0, Dbook;
		while (true) {
				
				System.out.println("****Welcome To Address Book***");
				System.out.println("1. Add  Details");
				System.out.println("2. Update  Details");
				System.out.println("3. Delete  Details");
				System.out.println("4. Display all  Details");
				System.out.println("5. Search  Details By Phone Number");
				System.out.println("6. Exit");

				System.out.println("Please Enter your choice  : ");
				choice = sc.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Add Record");
					System.out.println(" ");
					System.out.println("Enter number of Details to be entered");
					Dbook = sc.nextInt();
					for (i = 0; i < Dbook; i++) {
						System.out.println("Enter First Name :");
						firstName = sc.next();
						System.out.println("Enter Last Name :");
						lastName = sc.next();
						System.out.println("Enter State :");
						state = sc.next();
						System.out.println("Enter City :");
						city = sc.next();
						System.out.println("Enter Zip Code :");
						zip = sc.nextInt();
						System.out.println("Enter Phone Number:");
						phoneNo = sc.nextLong();
						deetail[count++] = new Details(firstName, lastName, city, state, zip, phoneNo);
						System.out.println("Added the Record sucessfully.");
						System.out.println(" ");

					}
					break;
				case 2:
					System.out.println("******Updated Record******");
					System.out.println("Enter Phone Number for updation : ");
					phoneNo = sc.nextLong();
					for (i = 0; i <= count; i++) {

						if (deetail[i] != null && deetail[i].getPhoneNo() == phoneNo) {
							System.out.println("Enter First Name :");
							firstName = sc.next();
							deetail[i].setFirstName(firstName);
							System.out.println("Enter Last Name :");
							lastName = sc.next();
							deetail[i].setLastName(lastName);
							System.out.println("Enter State :");
							state = sc.next();
							deetail[i].setState(state);
							System.out.println("Enter City :");
							city = sc.next();
							deetail[i].setCity(city);
							System.out.println("Enter Zip Code :");
							zip = sc.nextInt();
							deetail[i].setZip(zip);
							System.out.println("AddressBook Updated by PhoneNumber" + phoneNo);
						}
					}
					break;

				case 3:
					System.out.println("Delete the record details");
					System.out.println(" ");
					System.out.println("Enter phone number for deletion : ");
					phoneNo = sc.nextLong();
					for (i = 0; i <= count; i++) {

						if (deetail[i] != null && deetail[i].getPhoneNo() == phoneNo) {
							deetail[i] = null;
							System.out.println("Record deleted successfully");
						}
					}

					break;

				case 4:

					System.out.println("Display all Addressbook record");
					System.out.println(" ");

					for (i = 0; i < count; i++) {
						System.out.println((i++) + " record number details ");
						System.out.println("First_Name :" + deetail[i].getFirstName());
						System.out.println("Last_Name  :" + deetail[i].getLastName());
						System.out.println("City :" + deetail[i].getCity());
						System.out.println("State :" + deetail[i].getState());
						System.out.println("Zip_code :" + deetail[i].getZip());
						System.out.println("Phone_number :" + deetail[i].getPhoneNo());

					}

					break;

				case 5:
					System.out.println("Search Addressbook details by Phone Number: ");
					System.out.println(" ");
					System.out.println("Enter Phone Number for search : ");
					phoneNo = sc.nextLong();
					for (i = 0; i < count; i++) {

						if (deetail[i] != null && deetail[i].getPhoneNo() == phoneNo) {
							System.out.println(deetail[i]);
						}
					}
					break;

				case 6:

					System.exit(0);

				default:
					System.out.println("Please enter correct choice");

				}

				}
	}
}
