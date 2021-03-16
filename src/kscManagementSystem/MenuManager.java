package kscManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
		System.out.println("1. workers Id"); 
		System.out.println("2. workers Name"); 
		System.out.println("3. workers Phone Number"); 
		System.out.println("4. workers Age"); 
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit"); 
		System.out.println("Select one number between 1-6:");
		num = input.nextInt();
		if(num==1) {
			System.out.print("workers Id:");
			int workersId = input.nextInt();
		}
		else if(num==2) {
			System.out.println("workers Name:");
			String workersName = input.next();
		}
		else if(num==3) {
			System.out.println("workers Phone Number:");
			int workersPhoneNumber = input.nextInt();
		}
		else if(num==4) {
			System.out.println("workers Age:");
			int workersAge = input.nextInt();
		}
		}

	}

}
