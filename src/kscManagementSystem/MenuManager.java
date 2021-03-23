package kscManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);

		while(num != 6) {
			System.out.println("1. Add Worker"); 
			System.out.println("2. Delete Worker"); 
			System.out.println("3. Edit Worker"); 
			System.out.println("4. View Worker"); 
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit"); 
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			if(num==1) {
				addWorker();
			}
			else if(num==2) {
				deleteWorker();
			}
			else if(num==3) {
				editWorker();
			}
			else if(num==4) {
				viewWorker();
			}
		}

	}
	
	public static void addWorker() {
		Scanner input = new Scanner(System.in);
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
		System.out.print("Worker name:");
		String workerName = input.next();
		System.out.print("Email address:");
		String workerEmail = input.next();
		System.out.print("Phone number:");
		String workerPhone = input.next();
		System.out.print("Worker age:");
		int workerAge = input.nextInt();
	}
	
	public static void deleteWorker() {
		Scanner input = new Scanner(System.in);
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
	}
	
	public static void editWorker() {
		Scanner input = new Scanner(System.in);
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
	}
	
	public static void viewWorker() {
		Scanner input = new Scanner(System.in);
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
	}
}










