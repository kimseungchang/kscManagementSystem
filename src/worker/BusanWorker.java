package worker;

import java.util.Scanner;

public class BusanWorker extends Worker {//worker�� ��ӹ޴´�.
	public void getUserInput(Scanner input) {
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
			if(answer=='y'||answer=='Y') {
				System.out.print("Email address:");
				String email = input.next();//�ֿܼ��� ���� ���� �������� ���
				this.setEmail(email);//email ����
				break;
			}
			else if(answer=='n'||answer=='N') {
				this.setEmail("");
				break;
			}
			else {

			}
		}
		System.out.print("Phone number:");
		String phone = input.next();
		this.setPhone(phone);

		System.out.print("Worker age:");
		int age = input.nextInt();
		this.setAge(age);
	}


}
