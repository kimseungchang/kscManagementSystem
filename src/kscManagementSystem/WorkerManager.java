package kscManagementSystem;

import java.util.ArrayList;//���̺귯�� ����
import java.util.Scanner;

import worker.BusanWorker;
import worker.GwangjuWorker;
import worker.JinjuWorker;
import worker.SeoulWorker;
import worker.Worker;
import worker.WorkerInput;
import worker.Workerlocation;

public class WorkerManager {
	ArrayList<WorkerInput> workers=new ArrayList<WorkerInput>();//WorkerInput ���� �̸� �ٲ��.
	Scanner input;
	WorkerManager(Scanner input){//WorkerManager ������ ����
		this.input = input;//��� �޼ҵ忡�� input ����� �� �ְ� �Ѵ�.
	}
	
	public void addWorker() {//worker �߰�
		int location=0;
		WorkerInput workerInput;//WorkerInput���� rename �ߴ�.
		while(location !=1 && location !=2 && location !=3 && location !=4) {//1,2,3,4�� �ƴϸ� �ݺ�
		System.out.println("1. Seoul");
		System.out.println("2. Busan");
		System.out.println("3. Jinju");
		System.out.println("4. Gwangju");
		System.out.println("Selet Worker location between 1~4:");
		location=input.nextInt();//�ֿܼ��� ���� ���� ������ ���
		if(location==1) {//location�� ���� if��
			workerInput = new SeoulWorker(Workerlocation.Seoul);//SeoulWorker ���� �̸� �ٲ��.
			workerInput.getUserInput(input);//workerInput���� �̸� �ٲ��.
			workers.add(workerInput);//worker ���� �߰�
			return;
		}
		else if(location==2) {
			workerInput = new BusanWorker(Workerlocation.Busan);
			workerInput.getUserInput(input);//worker�� �ִ� getUserInput ����.
			workers.add(workerInput);//worker ���� �߰�
			return;
		}
		else if(location==3) {
			workerInput = new JinjuWorker(Workerlocation.Jinju);
			workerInput.getUserInput(input);//worker�� �ִ� getUserInput ����.
			workers.add(workerInput);//worker ���� �߰�
			return;
		}
		else if(location==4) {
			workerInput = new GwangjuWorker(Workerlocation.Gwangju);
			workerInput.getUserInput(input);//worker�� �ִ� getUserInput ����.
			workers.add(workerInput);//worker ���� �߰�
			return;
		}
		else {
			System.out.println("Selet Worker location between 1~4:");
		}
		}
		
		

	}

	public void deleteWorker() {//worker ���� ����
		System.out.print("Worker ID:");
		int workerId = input.nextInt();//�ֿܼ��� ���� ���� ������ ���
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

	public void editWorker() {//worker ����
		System.out.print("Worker ID:");
		int workerId = input.nextInt();//�ֿܼ��� ���� ���� ������ ���
		for(int i=0;i<workers.size();i++) {//workers�� ũ�⸸ŭ �ݺ�
			WorkerInput workerInput=workers.get(i);//workerInput���� �̸� �ٲ��.//worker�� workers.get(i); ����
		if(workerInput.getId()==workerId) {//workerInput���� �̸� �ٲ��.//workerId �� ���ٸ� ����
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
					workerInput.setId(id);//id�� �ִ´�.
				}
				else if(num==2) {
					System.out.print("Worker name:");
					String name=input.next();//�ֿܼ��� ���� ���� ���ڷ� ���
					workerInput.setName(name);//name ����
				}
				else if(num==3) {
					System.out.print("Email address:");
					String email=input.next();//�ֿܼ��� ���� ���� ���ڷ� ���
					workerInput.setEmail(email);//email ����
				}
				else if(num==4) {
					System.out.print("Phone number:");
					String phone=input.next();//�ֿܼ��� ���� ���� ���ڷ� ���
					workerInput.setPhone(phone);//phone ����
				}
				else if(num==5) {
					System.out.print("Worker Age:");
					int age=input.nextInt();//�ֿܼ��� ���� ���� ������ ���
					workerInput.setAge(age);//age ����
				}
				else {
					continue;
				}
			}
			break;//�� �̻� ������ �ʿ� ����.
		}
	}
}

	public void viewWorkers() {//worker ���� ���
		System.out.println("# of registered workers:"+workers.size());
		for(int i=0;i<workers.size();i++) {//workers�� ũ�⸸ŭ �ݺ�
			workers.get(i).printInfo();//printInfo ���
		}
		
	}

	

}
