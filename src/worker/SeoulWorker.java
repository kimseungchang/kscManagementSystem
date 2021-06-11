package worker;

import java.util.Scanner;

public class SeoulWorker extends Worker {

	public SeoulWorker(Workerlocation location) {
		super(location);
	}

	public void getUserInput(Scanner input) {
		setWorkerID(input);//Worker에서 상속받아서 사용
		setWorkerName(input);//Worker에서 상속받아서 사용
		setWorkerEmail(input);
		setWorkerPhone(input);
		setWorkerAge(input);
	}
	public void printInfo() {//함수 생성
		String slocation =getLocationString();//문자열을 가져온다.
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" email:" + email +" phone:" + phone +" age:" + age);
		//location, id, name, email. phone, age 출력

	}
}
