package kscManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WorkerManager workerManager=new WorkerManager(input);//객체 연결
		selectMenu(input, workerManager);
	}

	public static void selectMenu(Scanner input, WorkerManager workerManager) {//selectMenu 함수 생성
		int num=0;
		while(num != 5) {
			try {//예외 검사
				showMenu();//함수 호출
				num = input.nextInt();
				switch(num) {//if 문을 switch 문으로 바꿨다.
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
			catch(InputMismatchException e) {//예외 일 때 실행
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {//next를 가지고 있다면 다시 처리
					input.next();
				}
				num=-1;
			}
		}
	}

	public static void showMenu() {//showMenu 함수 생성
		System.out.println("1. Add Worker"); 
		System.out.println("2. Delete Worker"); 
		System.out.println("3. Edit Worker"); 
		System.out.println("4. View Workers"); 
		System.out.println("5. Exit"); 
		System.out.println("Select one number between 1-5:");
	}

}










