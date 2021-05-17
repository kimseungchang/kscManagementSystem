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
	public void printInfo() {//함수 생성
		String slocation =getLocationString();//문자열을 가져온다.
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" email:" + email +" phone:" + phone +" age:" + age);
		//location, id, name, email. phone, age 출력
	}

	public void setWorkerEmailwithYN(Scanner input) {//setWorkerEmailwithYN 함수 생성
		char answer='x';
		//y,n에 따라 while과 if문 실행
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have an email address? (Y/N)");
			answer=input.next().charAt(0);//처음값을 가져온다.
			try {//예외 검사
				if(answer=='y'||answer=='Y') {//y,Y 입력 받으면 실행
					setWorkerEmail(input);
					break;
				}
				else if(answer=='n'||answer=='N') {//n,N 입력 받으면 실행
					this.setEmail("");
					break;
				}
				else {

				}
			}
			catch(EmailFormatException e) {//예외 일 때 실행
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}

		}
	}
}
