package kscManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WorkerManager workerManager=new WorkerManager(input);
		int num=0;
		while(num != 5) {
			System.out.println("1. Add Worker"); 
			System.out.println("2. Delete Worker"); 
			System.out.println("3. Edit Worker"); 
			System.out.println("4. View Worker"); 
			System.out.println("5. Exit"); 
			System.out.println("Select one number between 1-5:");
			num = input.nextInt();
			if(num==1) {
				workerManager.addWorker();
			}
			else if(num==2) {
				workerManager.deleteWorker();
			}
			else if(num==3) {
				workerManager.editWorker();
			}
			else if(num==4) {
				workerManager.viewWorker();
			}
		}

	}
	
	
}










