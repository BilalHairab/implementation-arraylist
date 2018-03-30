package edu.sbme.oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListHomeWorkImplementation list = new ListHomeWorkImplementation();
		int choice;
		do {
			System.out.println("======================");
			System.out.println("1- add element to list");
			System.out.println("2- get element from list");
			System.out.println("3- get list size");
			System.out.println("4- show the whole list");
			System.out.println("0- exit");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element:");
				list.add(scanner.nextInt());
				break;
			case 2:
				System.out.println("Enter the element index:");
				int returnedInt = list.get(scanner.nextInt());
				System.out.println("element is: " + returnedInt);
				break;
			case 3:
				System.out.println("Size is:" + list.size());
				break;
			case 4:
				for (int i = 0; i < list.size(); i++)
					System.out.println("" + list.get(i));
				break;
			}
		} while (choice != 0);
	}

}
