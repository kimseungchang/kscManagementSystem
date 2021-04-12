package worker;

import java.util.Scanner;

public class BusanWorker extends Worker {//worker를 상속받는다.
	public void getUserInput(Scanner input) {
		System.out.print("Worker ID:");
		int id = input.nextInt();//콘솔에서 받은 값을 정수로 사용
		this.setId(id);//id 저장

		System.out.print("Worker name:");
		String name = input.next();//콘솔에서 받은 값을 문장으로 사용
		this.setName(name);//name 저장

		char answer='x';
		//y,n에 따라 while과 if문 실행
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have an email address? (Y/N)");
			answer=input.next().charAt(0);//처음값을 가져온다.
			if(answer=='y'||answer=='Y') {
				System.out.print("Email address:");
				String email = input.next();//콘솔에서 받은 값을 문장으로 사용
				this.setEmail(email);//email 저장
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
