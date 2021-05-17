package worker;

import java.util.Scanner;

public class GwangjuWorker extends Worker {//����� �ǹǷ� implements WorkerInput ����

	public GwangjuWorker(Workerlocation location) {
		super(location);
	}

	protected String companyPhone;

	public void getUserInput(Scanner input) {
		setWorkerID(input);//Worker���� ��ӹ޾Ƽ� ���
		setWorkerName(input);//Worker���� ��ӹ޾Ƽ� ���
		setWorkerEmail(input);

		char answer='x';
		//y,n�� ���� while�� if�� ����
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have a Phone number? (Y/N)");
			answer=input.next().charAt(0);//ó������ �����´�.
			if(answer=='y'||answer=='Y') {//y,Y �Է� ������ ����
				setWorkerPhone(input);//Worker���� ��ӹ޾Ƽ� ���		
				break;
			}
			else if(answer=='n'||answer=='N') {//n,N �Է� ������ ����
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
			if(answer=='y'||answer=='Y') {//y,Y �Է� ������ ����
				System.out.print("company Phone number:");
				String phone = input.next();//�ֿܼ��� ���� ���� �������� ���
				this.setPhone(phone);//phone ����
				break;
			}
			else if(answer=='n'||answer=='N') {//n,N �Է� ������ ����
				this.setPhone("");
				break;
			}
			else {

			}
		}
		setWorkerAge(input);
	}

	public void printInfo() {//�Լ� ����
		String slocation =getLocationString();//���ڿ��� �����´�.
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" email:" + email +" company phone:" + phone +" age:" + age);
		//id, name, email, company phone, age, location ���
	}
}
