package worker;

import java.util.Scanner;

public class BusanWorker extends TWorker {

	public BusanWorker(Workerlocation location) {
		super(location);
	}

	public void getUserInput(Scanner input) {
		setWorkerID(input);//Worker���� ��ӹ޾Ƽ� ���
		setWorkerName(input);//Worker���� ��ӹ޾Ƽ� ���
		setWorkerEmailwithYN(input);
		setWorkerPhone(input);
		setWorkerAge(input);
	}
}
