package kscManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WorkerManager workerManager=new WorkerManager(input);//객체 연결
		int num=0;
		while(num != 5) {
			System.out.println("1. Add Worker"); 
			System.out.println("2. Delete Worker"); 
			System.out.println("3. Edit Worker"); 
			System.out.println("4. View Workers"); 
			System.out.println("5. Exit"); 
			System.out.println("Select one number between 1-5:");
			num = input.nextInt();
			if(num==1) {
				workerManager.addWorker();//workerManager에 있는 addWorker 실행
			}
			else if(num==2) {
				workerManager.deleteWorker();//workerManager에 있는 deleteWorker 실행
			}
			else if(num==3) {
				workerManager.editWorker();//workerManager에 있는 editWorker 실행
			}
			else if(num==4) {
				workerManager.viewWorkers();//workerManager에 있는 viewWorker 실행
			}
		}

	}
	
	
}










