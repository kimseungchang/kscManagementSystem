package kscManagementSystem;

import java.util.ArrayList;//라이브러리 선언
import java.util.Scanner;

import worker.BusanWorker;
import worker.GwangjuWorker;
import worker.JinjuWorker;
import worker.Worker;
import worker.Workerlocation;

public class WorkerManager {
	ArrayList<Worker> workers=new ArrayList<Worker>();//worker 클래스의 리스트를 만든다.
	Scanner input;
	WorkerManager(Scanner input){//WorkerManager 생성자 선언
		this.input = input;//모든 메소드에서 input 사용할 수 있게 한다.
	}
	
	public void addWorker() {
		int location=0;
		Worker worker;
		while(location !=1 && location !=2 && location !=3 && location !=4) {//1,2,3,4가 아니면 반복
		System.out.println("1. Seoul");
		System.out.println("2. Busan");
		System.out.println("3. Jinju");
		System.out.println("4. Gwangju");
		System.out.println("Selet Worker location between 1~4:");
		location=input.nextInt();
		if(location==1) {//location에 따른 if문
			worker = new Worker(Workerlocation.Seoul);
			worker.getUserInput(input);//worker에 있는 getUserInput 실행.
			workers.add(worker);//worker 정보 추가
			return;
		}
		else if(location==2) {
			worker = new BusanWorker(Workerlocation.Busan);
			worker.getUserInput(input);
			workers.add(worker);//worker 정보 추가
			return;
		}
		else if(location==3) {
			worker = new JinjuWorker(Workerlocation.Jinju);
			worker.getUserInput(input);
			workers.add(worker);//worker 정보 추가
			return;
		}
		else if(location==4) {
			worker = new GwangjuWorker(Workerlocation.Gwangju);
			worker.getUserInput(input);
			workers.add(worker);//worker 정보 추가
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
		for(int i=0;i<workers.size();i++) {//workers의 크기만큼 반복
			if(workers.get(i).getId()==workerId) {//workerId 같으면 실행
				index=i;//인덱스 삽입
				break;//for문에서 나간다.
			}
		}
		
		if(index>=0) {//index를 찾았다면
			workers.remove(index);//삭제
			System.out.println("the worker " + workerId+" is deleted");
		}
		else {//index를 못찾았다면
			System.out.println("the worker has not been registered");
			return;
		}
		
	}

	public void editWorker() {
		System.out.print("Worker ID:");
		int workerId = input.nextInt();
		for(int i=0;i<workers.size();i++) {//workers의 크기만큼 반복
			Worker worker=workers.get(i);//worker에 workers.get(i); 저장
		if(worker.getId()==workerId) {//workerId 가 같다면 실행
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
					int id=input.nextInt();//id를 int로 받아드린다.
					worker.setId(id);//id를 넣는다.
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
			break;//더 이상 진행할 필요 없다.
		}
	}
}

	public void viewWorkers() {
//		System.out.print("Worker ID:");
//		int workerId = input.nextInt();
		System.out.println("# of registered workers:"+workers.size());
		for(int i=0;i<workers.size();i++) {//workers의 크기만큼 반복
			workers.get(i).printInfo();//printInfo 출력
		}
		
	}

	

}
