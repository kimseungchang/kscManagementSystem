package worker;

import java.util.Scanner;

public class SeoulWorker extends Worker implements WorkerInput{//getUserInput 파트에 접근하려면 WorkerInput을 가지고 WorkerManagement에서 접근 가능
	
	public SeoulWorker(Workerlocation location) {// SeoulWorker 생성자 선언
		this.location=location;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Worker ID:");
		int id = input.nextInt();//객체 필드에 넣어준다.
		this.setId(id);//객체에 대한 값 설정

		System.out.print("Worker name:");
		String name = input.next();
		this.setName(name);

		System.out.print("Email address:");
		String email = input.next();
		this.setEmail(email);

		System.out.print("Phone number:");
		String phone = input.next();
		this.setPhone(phone);

		System.out.print("Worker age:");
		int age = input.nextInt();
		this.setAge(age);
	}
	public void printInfo() {//함수 생성
		String slocation ="none";//slocation 생성
		switch(this.location) {//switch문을 이용해 출력되는 내용 다르게 한다.
		case Seoul:
			slocation="본사";
			break;
		case Busan:
			slocation="2호점";
			break;
		case Jinju:
			slocation="3호점";
			break;
		case Gwangju:
			slocation="4호점";
			break;
		default:

		}
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" email:" + email +" phone:" + phone +" age:" + age);
		//location, id, name, email. phone, age 출력

	}

}
