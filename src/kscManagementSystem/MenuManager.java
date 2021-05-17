package kscManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WorkerManager workerManager=new WorkerManager(input);//��ü ����
		selectMenu(input, workerManager);
	}

	public static void selectMenu(Scanner input, WorkerManager workerManager) {//selectMenu �Լ� ����
		int num=0;
		while(num != 5) {
			try {//���� �˻�
				showMenu();//�Լ� ȣ��
				num = input.nextInt();
				switch(num) {//if ���� switch ������ �ٲ��.
				case 1: 
					workerManager.addWorker();
					break;
				case 2:
					workerManager.deleteWorker();
					break;
				case 3:
					workerManager.editWorker();
					break;
				case 4:
					workerManager.viewWorkers();
					break;
				default: 
					continue;
				}
			}
			catch(InputMismatchException e) {//���� �� �� ����
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {//next�� ������ �ִٸ� �ٽ� ó��
					input.next();
				}
				num=-1;
			}
		}
	}

	public static void showMenu() {//showMenu �Լ� ����
		System.out.println("1. Add Worker"); 
		System.out.println("2. Delete Worker"); 
		System.out.println("3. Edit Worker"); 
		System.out.println("4. View Workers"); 
		System.out.println("5. Exit"); 
		System.out.println("Select one number between 1-5:");
	}

}










