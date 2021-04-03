package kscManagementSystem;

import java.util.Scanner;

public class WorkerManager {
	Worker worker;
	Scanner input;
	WorkerManager(Scanner input){
		this.input = input;
	}
	
	public void addWorker() {
		worker = new Worker();
		System.out.print("Worker ID:");
		worker.id = input.nextInt();
		System.out.print("Worker name:");
		worker.name = input.next();
		System.out.print("Email address:");
		worker.email = input.next();
		System.out.print("Phone number:");
		worker.phone = input.next();
		System.out.print("Worker age:");
		worker.age = input.nextInt();
	}

	public void deleteWorker() {
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
		if(worker==null) {
			System.out.println("the worker has not been registered");
			return;
		}
		if(worker.id==workerId) {
			worker=null;
			System.out.println("the worker is deleted");
		}
	}

	public void editWorker() {
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
		if(worker.id==workerId) {
			System.out.println("the worker to be edited is" + workerId);
		}
	}

	public void viewWorker() {
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
		if(worker.id==workerId) {
			worker.printInfo();
		}
	}

	

}
