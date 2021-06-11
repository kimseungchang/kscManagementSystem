package kscManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");//eventlogger 생성, 기록하겠다.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		WorkerManager workerManager=getObject("workermanager.ser");
		if(workerManager == null) {//객체가 없는일이 없도록 처리한다.
			workerManager = new WorkerManager(input);
		}
		else {
			workerManager.input =input;//객체연결
		}
		
		WindowFrame frame = new WindowFrame(workerManager);//WindowFrame 연결
		selectMenu(input, workerManager);
		System.out.println("test");
		putObject(workerManager, "workermanager.ser");//putObject 함수 실행
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
					logger.log("add a worker");//이벤트를 일으킨다.
					break;
				case 2:
					workerManager.deleteWorker();
					logger.log("delete a worker");//이벤트를 일으킨다.
					break;
				case 3:
					workerManager.editWorker();
					logger.log("edit a worker");//이벤트를 일으킨다.
					break;
				case 4:
					workerManager.viewWorkers();
					logger.log("view a worker");//이벤트를 일으킨다.
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
	
	public static WorkerManager getObject(String filename) {//getObject 생성
		WorkerManager workerManager=null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);//파일에 객체저장

			workerManager = (WorkerManager)in.readObject();//형변환 해서 가져온다.

			in.close();
			file.close();//파일 닫는다.

		} catch (FileNotFoundException e) {
			return workerManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return workerManager;//리턴한다.
	}
	
	public static void putObject(WorkerManager workerManager,String filename) {//putObject 생성
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(workerManager);//쓴다.

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}










