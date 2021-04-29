package kscManagementSystem;

import java.util.ArrayList;//���̺귯�� ����
import java.util.Scanner;

import worker.BusanWorker;
import worker.GwangjuWorker;
import worker.JinjuWorker;
import worker.Worker;
import worker.Workerlocation;

public class WorkerManager {
	ArrayList<Worker> workers=new ArrayList<Worker>();//worker Ŭ������ ����Ʈ�� �����.
	Scanner input;
	WorkerManager(Scanner input){//WorkerManager ������ ����
		this.input = input;//��� �޼ҵ忡�� input ����� �� �ְ� �Ѵ�.
	}
	
	public void addWorker() {
		int location=0;
		Worker worker;
		while(location !=1 && location !=2 && location !=3 && location !=4) {//1,2,3,4�� �ƴϸ� �ݺ�
		System.out.println("1. Seoul");
		System.out.println("2. Busan");
		System.out.println("3. Jinju");
		System.out.println("4. Gwangju");
		System.out.println("Selet Worker location between 1~4:");
		location=input.nextInt();
		if(location==1) {//location�� ���� if��
			worker = new Worker(Workerlocation.Seoul);
			worker.getUserInput(input);//worker�� �ִ� getUserInput ����.
			workers.add(worker);//worker ���� �߰�
			return;
		}
		else if(location==2) {
			worker = new BusanWorker(Workerlocation.Busan);
			worker.getUserInput(input);
			workers.add(worker);//worker ���� �߰�
			return;
		}
		else if(location==3) {
			worker = new JinjuWorker(Workerlocation.Jinju);
			worker.getUserInput(input);
			workers.add(worker);//worker ���� �߰�
			return;
		}
		else if(location==4) {
			worker = new GwangjuWorker(Workerlocation.Gwangju);
			worker.getUserInput(input);
			workers.add(worker);//worker ���� �߰�
			return;
		}
		else {
			System.out.println("Selet Worker location between 1~4:");
		}
		}
		
		

	}

	public void deleteWorker() {
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
		int index=-1;
		for(int i=0;i<workers.size();i++) {//workers�� ũ�⸸ŭ �ݺ�
			if(workers.get(i).getId()==workerId) {//workerId ������ ����
				index=i;//�ε��� ����
				break;//for������ ������.
			}
		}
		
		if(index>=0) {//index�� ã�Ҵٸ�
			workers.remove(index);//����
			System.out.println("the worker " + workerId+" is deleted");
		}
		else {//index�� ��ã�Ҵٸ�
			System.out.println("the worker has not been registered");
			return;
		}
		
	}

	public void editWorker() {
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
		for(int i=0;i<workers.size();i++) {//workers�� ũ�⸸ŭ �ݺ�
			Worker worker=workers.get(i);//worker�� workers.get(i); ����
		if(worker.getId()==workerId) {//workerId �� ���ٸ� ����
			int num=0;
			while(num != 6) {
				System.out.println("1. Edit Id"); 
				System.out.println("2. Edit Name"); 
				System.out.println("3. Edit Email"); 
				System.out.println("4. Edit Phone");
				System.out.println("5. Edit age");
				System.out.println("6. Exit"); 
				System.out.println("Select one number between 1-6:");
				num = input.nextInt();
				if(num==1) {
					System.out.print("Worker ID:");
					int id=input.nextInt();//id�� int�� �޾Ƶ帰��.
					worker.setId(id);//id�� �ִ´�.
				}
				else if(num==2) {
					System.out.print("Worker name:");
					String name=input.next();
					worker.setName(name);
				}
				else if(num==3) {
					System.out.print("Email address:");
					String email=input.next();
					worker.setEmail(email);
				}
				else if(num==4) {
					System.out.print("Phone number:");
					String phone=input.next();
					worker.setPhone(phone);
				}
				else if(num==5) {
					System.out.print("Worker Age:");
					int age=input.nextInt();
					worker.setAge(age);
				}
				else {
					continue;
				}
			}
			break;//�� �̻� ������ �ʿ� ����.
		}
	}
}

	public void viewWorkers() {
//		System.out.print("Worker ID:");
//		int workerId = input.nextInt();
		System.out.println("# of registered workers:"+workers.size());
		for(int i=0;i<workers.size();i++) {//workers�� ũ�⸸ŭ �ݺ�
			workers.get(i).printInfo();//printInfo ���
		}
		
	}

	

}
