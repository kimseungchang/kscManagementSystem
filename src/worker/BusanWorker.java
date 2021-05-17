package worker;

import java.util.Scanner;

public class BusanWorker extends TWorker {

	public BusanWorker(Workerlocation location) {
		super(location);
	}

	public void getUserInput(Scanner input) {
		setWorkerID(input);//Worker에서 상속받아서 사용
		setWorkerName(input);//Worker에서 상속받아서 사용
		setWorkerEmailwithYN(input);
		setWorkerPhone(input);
		setWorkerAge(input);
	}
}
