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
	static EventLogger logger = new EventLogger("log.txt");//eventlogger ����, ����ϰڴ�.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		WorkerManager workerManager=getObject("workermanager.ser");
		if(workerManager == null) {//��ü�� �������� ������ ó���Ѵ�.
			workerManager = new WorkerManager(input);
		}
		else {
			workerManager.input =input;//��ü����
		}
		
		WindowFrame frame = new WindowFrame(workerManager);//WindowFrame ����
		selectMenu(input, workerManager);
		System.out.println("test");
		putObject(workerManager, "workermanager.ser");//putObject �Լ� ����
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
					logger.log("add a worker");//�̺�Ʈ�� ����Ų��.
					break;
				case 2:
					workerManager.deleteWorker();
					logger.log("delete a worker");//�̺�Ʈ�� ����Ų��.
					break;
				case 3:
					workerManager.editWorker();
					logger.log("edit a worker");//�̺�Ʈ�� ����Ų��.
					break;
				case 4:
					workerManager.viewWorkers();
					logger.log("view a worker");//�̺�Ʈ�� ����Ų��.
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
	
	public static WorkerManager getObject(String filename) {//getObject ����
		WorkerManager workerManager=null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);//���Ͽ� ��ü����

			workerManager = (WorkerManager)in.readObject();//����ȯ �ؼ� �����´�.

			in.close();
			file.close();//���� �ݴ´�.

		} catch (FileNotFoundException e) {
			return workerManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return workerManager;//�����Ѵ�.
	}
	
	public static void putObject(WorkerManager workerManager,String filename) {//putObject ����
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(workerManager);//����.

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}










