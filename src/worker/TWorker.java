package worker;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class TWorker extends Worker {

	public TWorker(Workerlocation location) {
		super(location);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {//�Լ� ����
		String slocation =getLocationString();//���ڿ��� �����´�.
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" email:" + email +" phone:" + phone +" age:" + age);
		//location, id, name, email. phone, age ���
	}

	public void setWorkerEmailwithYN(Scanner input) {//setWorkerEmailwithYN �Լ� ����
		char answer='x';
		//y,n�� ���� while�� if�� ����
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have an email address? (Y/N)");
			answer=input.next().charAt(0);//ó������ �����´�.
			try {//���� �˻�
				if(answer=='y'||answer=='Y') {//y,Y �Է� ������ ����
					setWorkerEmail(input);
					break;
				}
				else if(answer=='n'||answer=='N') {//n,N �Է� ������ ����
					this.setEmail("");
					break;
				}
				else {

				}
			}
			catch(EmailFormatException e) {//���� �� �� ����
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}

		}
	}
}
