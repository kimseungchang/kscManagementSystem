package worker;

import java.util.Scanner;

public class SeoulWorker extends Worker implements WorkerInput{//getUserInput ��Ʈ�� �����Ϸ��� WorkerInput�� ������ WorkerManagement���� ���� ����
	
	public SeoulWorker(Workerlocation location) {// SeoulWorker ������ ����
		this.location=location;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Worker ID:");
		int id = input.nextInt();//��ü �ʵ忡 �־��ش�.
		this.setId(id);//��ü�� ���� �� ����

		System.out.print("Worker name:");
		String name = input.next();
		this.setName(name);

		System.out.print("Email address:");
		String email = input.next();
		this.setEmail(email);

		System.out.print("Phone number:");
		String phone = input.next();
		this.setPhone(phone);

		System.out.print("Worker age:");
		int age = input.nextInt();
		this.setAge(age);
	}
	public void printInfo() {//�Լ� ����
		String slocation ="none";//slocation ����
		switch(this.location) {//switch���� �̿��� ��µǴ� ���� �ٸ��� �Ѵ�.
		case Seoul:
			slocation="����";
			break;
		case Busan:
			slocation="2ȣ��";
			break;
		case Jinju:
			slocation="3ȣ��";
			break;
		case Gwangju:
			slocation="4ȣ��";
			break;
		default:

		}
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" email:" + email +" phone:" + phone +" age:" + age);
		//location, id, name, email. phone, age ���

	}

}
