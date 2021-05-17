package worker;

import java.util.Scanner;

import exception.EmailFormatException;

public class JinjuWorker extends TWorker {

	public JinjuWorker(Workerlocation location) {
		super(location);
	}

	protected String companyEmail;

	public void getUserInput(Scanner input) {//오버라이드
		setWorkerID(input);//Worker에서 상속받아서 사용
		setWorkerName(input);//Worker에서 상속받아서 사용	
		setWorkerEmailwithYN(input);
		setCompanyEmailwithYN(input);
		setWorkerPhone(input);
		setWorkerAge(input);
	}

	public void setCompanyEmailwithYN(Scanner input) {
		char answer='x';
		//y,n에 따라 while과 if문 실행
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have a company email address? (Y/N)");
			answer=input.next().charAt(0);//처음값을 가져온다.
			try {//예외 검사
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
			catch(EmailFormatException e) {//예외 일 때 실행
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}	
	}

	public void printInfo() {//함수 생성, 오버라이드
		String slocation =getLocationString();//문자열을 가져온다.
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" company email:" + email +" phone:" + phone +" age:" + age);
		//id, name, email. phone, age, location, company email 출력
	}
}
