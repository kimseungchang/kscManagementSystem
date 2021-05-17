package worker;

import java.util.Scanner;

import exception.EmailFormatException;

public class JinjuWorker extends TWorker {

	public JinjuWorker(Workerlocation location) {
		super(location);
	}

	protected String companyEmail;

	public void getUserInput(Scanner input) {//�������̵�
		setWorkerID(input);//Worker���� ��ӹ޾Ƽ� ���
		setWorkerName(input);//Worker���� ��ӹ޾Ƽ� ���	
		setWorkerEmailwithYN(input);
		setCompanyEmailwithYN(input);
		setWorkerPhone(input);
		setWorkerAge(input);
	}

	public void setCompanyEmailwithYN(Scanner input) {
		char answer='x';
		//y,n�� ���� while�� if�� ����
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have a company email address? (Y/N)");
			answer=input.next().charAt(0);//ó������ �����´�.
			try {//���� �˻�
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
			catch(EmailFormatException e) {//���� �� �� ����
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}	
	}

	public void printInfo() {//�Լ� ����, �������̵�
		String slocation =getLocationString();//���ڿ��� �����´�.
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" company email:" + email +" phone:" + phone +" age:" + age);
		//id, name, email. phone, age, location, company email ���
	}
}
