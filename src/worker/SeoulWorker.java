package worker;

import java.util.Scanner;

public class SeoulWorker extends Worker {

	public SeoulWorker(Workerlocation location) {
		super(location);
	}

	public void getUserInput(Scanner input) {
		setWorkerID(input);//Worker���� ��ӹ޾Ƽ� ���
		setWorkerName(input);//Worker���� ��ӹ޾Ƽ� ���
		setWorkerEmail(input);
		setWorkerPhone(input);
		setWorkerAge(input);
	}
	public void printInfo() {//�Լ� ����
		String slocation =getLocationString();//���ڿ��� �����´�.
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" email:" + email +" phone:" + phone +" age:" + age);
		//location, id, name, email. phone, age ���

	}
}
