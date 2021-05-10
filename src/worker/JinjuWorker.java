package worker;

import java.util.Scanner;

public class JinjuWorker extends Worker implements WorkerInput{//getUserInput 파트에 접근하려면 WorkerInput을 가지고 WorkerManagement에서 접근 가능
	
	public JinjuWorker(Workerlocation location) {// Worker 생성자 선언
		this.location=location;
	}
	
	protected String companyEmail;
	
	public void getUserInput(Scanner input) {//오버라이드
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
			if(answer=='y'||answer=='Y') {//y,Y 입력 받으면 실행
				System.out.print("email address:");
				String email = input.next();//콘솔에서 받은 값을 문장으로 사용
				this.setEmail(email);//email 저장
				break;
			}
			else if(answer=='n'||answer=='N') {//n,N 입력 받으면 실행
				this.setEmail("");
				break;
			}
			else {

			}
		}

		answer='x';
		//y,n에 따라 while과 if문 실행
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have a company email address? (Y/N)");
			answer=input.next().charAt(0);//처음값을 가져온다.
			if(answer=='y'||answer=='Y') {//y,Y 입력 받으면 실행
				System.out.print("company email address:");
				String email = input.next();//콘솔에서 받은 값을 문장으로 사용
				this.setEmail(email);//email 저장
				break;
			}
			else if(answer=='n'||answer=='N') {//n,N 입력 받으면 실행
				this.setEmail("");
				break;
			}
			else {

			}
		}
		System.out.print("Phone number:");
		String phone = input.next();//콘솔에서 받은 값을 문장으로 사용
		this.setPhone(phone);//phone 저장

		System.out.print("Worker age:");
		int age = input.nextInt();//콘솔에서 받은 값을 정수로 사용
		this.setAge(age);//age 저장
	}
	
	public void printInfo() {//함수 생성, 오버라이드
		String slocation ="none";
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
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" company email:" + email +" phone:" + phone +" age:" + age);
		//id, name, email. phone, age, location, company email 출력
	
	}

}
