package worker;

import java.util.Scanner;

public class GwangjuWorker extends Worker {
	
	public GwangjuWorker(Workerlocation location) {// Worker ������ ����
		this.location=location;
	}
	
	protected String companyPhone;//����
	
	public void getUserInput(Scanner input) {
		System.out.print("Worker ID:");
		int id = input.nextInt();//�ֿܼ��� ���� ���� ������ ���
		this.setId(id);//id ����

		System.out.print("Worker name:");
		String name = input.next();//�ֿܼ��� ���� ���� �������� ���
		this.setName(name);//name ����
		
		System.out.print("Email address:");
		String email = input.next();
		this.setEmail(email);
		
		char answer='x';
		//y,n�� ���� while�� if�� ����
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have a Phone number? (Y/N)");
			answer=input.next().charAt(0);//ó������ �����´�.
			if(answer=='y'||answer=='Y') {
				System.out.print("Phone number:");
				String phone = input.next();//�ֿܼ��� ���� ���� �������� ���
				this.setPhone(phone);//phone ����
				break;
			}
			else if(answer=='n'||answer=='N') {
				this.setPhone("");
				break;
			}
			else {

			}
		}

		answer='x';
		//y,n�� ���� while�� if�� ����
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have a company Phone number? (Y/N)");
			answer=input.next().charAt(0);//ó������ �����´�.
			if(answer=='y'||answer=='Y') {
				System.out.print("company Phone number:");
				String phone = input.next();//�ֿܼ��� ���� ���� �������� ���
				this.setPhone(phone);//phone ����
				break;
			}
			else if(answer=='n'||answer=='N') {
				this.setPhone("");
				break;
			}
			else {

			}
		}

		System.out.print("Worker age:");
		int age = input.nextInt();
		this.setAge(age);
	}
	
	public void printInfo() {//�Լ� ����
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
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" email:" + email +" company phone:" + phone +" age:" + age);
		//id, name, email. phone, age ���
	
	}

}
