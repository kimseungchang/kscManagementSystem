package worker;

import java.util.Scanner;

public class JinjuWorker extends Worker implements WorkerInput{//getUserInput ��Ʈ�� �����Ϸ��� WorkerInput�� ������ WorkerManagement���� ���� ����
	
	public JinjuWorker(Workerlocation location) {// Worker ������ ����
		this.location=location;
	}
	
	protected String companyEmail;
	
	public void getUserInput(Scanner input) {//�������̵�
		System.out.print("Worker ID:");
		int id = input.nextInt();//�ֿܼ��� ���� ���� ������ ���
		this.setId(id);//id ����

		System.out.print("Worker name:");
		String name = input.next();//�ֿܼ��� ���� ���� �������� ���
		this.setName(name);//name ����
		
		char answer='x';
		//y,n�� ���� while�� if�� ����
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have an email address? (Y/N)");
			answer=input.next().charAt(0);//ó������ �����´�.
			if(answer=='y'||answer=='Y') {//y,Y �Է� ������ ����
				System.out.print("email address:");
				String email = input.next();//�ֿܼ��� ���� ���� �������� ���
				this.setEmail(email);//email ����
				break;
			}
			else if(answer=='n'||answer=='N') {//n,N �Է� ������ ����
				this.setEmail("");
				break;
			}
			else {

			}
		}

		answer='x';
		//y,n�� ���� while�� if�� ����
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have a company email address? (Y/N)");
			answer=input.next().charAt(0);//ó������ �����´�.
			if(answer=='y'||answer=='Y') {//y,Y �Է� ������ ����
				System.out.print("company email address:");
				String email = input.next();//�ֿܼ��� ���� ���� �������� ���
				this.setEmail(email);//email ����
				break;
			}
			else if(answer=='n'||answer=='N') {//n,N �Է� ������ ����
				this.setEmail("");
				break;
			}
			else {

			}
		}
		System.out.print("Phone number:");
		String phone = input.next();//�ֿܼ��� ���� ���� �������� ���
		this.setPhone(phone);//phone ����

		System.out.print("Worker age:");
		int age = input.nextInt();//�ֿܼ��� ���� ���� ������ ���
		this.setAge(age);//age ����
	}
	
	public void printInfo() {//�Լ� ����, �������̵�
		String slocation ="none";
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
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" company email:" + email +" phone:" + phone +" age:" + age);
		//id, name, email. phone, age, location, company email ���
	
	}

}
