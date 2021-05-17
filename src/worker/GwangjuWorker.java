package worker;

import java.util.Scanner;

public class GwangjuWorker extends Worker {//상속이 되므로 implements WorkerInput 제거

	public GwangjuWorker(Workerlocation location) {
		super(location);
	}

	protected String companyPhone;

	public void getUserInput(Scanner input) {
		setWorkerID(input);//Worker에서 상속받아서 사용
		setWorkerName(input);//Worker에서 상속받아서 사용
		setWorkerEmail(input);

		char answer='x';
		//y,n에 따라 while과 if문 실행
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have a Phone number? (Y/N)");
			answer=input.next().charAt(0);//처음값을 가져온다.
			if(answer=='y'||answer=='Y') {//y,Y 입력 받으면 실행
				setWorkerPhone(input);//Worker에서 상속받아서 사용		
				break;
			}
			else if(answer=='n'||answer=='N') {//n,N 입력 받으면 실행
				this.setPhone("");
				break;
			}
			else {

			}
		}

		answer='x';
		//y,n에 따라 while과 if문 실행
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.println("Do you have a company Phone number? (Y/N)");
			answer=input.next().charAt(0);//처음값을 가져온다.
			if(answer=='y'||answer=='Y') {//y,Y 입력 받으면 실행
				System.out.print("company Phone number:");
				String phone = input.next();//콘솔에서 받은 값을 문장으로 사용
				this.setPhone(phone);//phone 저장
				break;
			}
			else if(answer=='n'||answer=='N') {//n,N 입력 받으면 실행
				this.setPhone("");
				break;
			}
			else {

			}
		}
		setWorkerAge(input);
	}

	public void printInfo() {//함수 생성
		String slocation =getLocationString();//문자열을 가져온다.
		System.out.println("location:"+ slocation +" id:" + id +" name:" + name +" email:" + email +" company phone:" + phone +" age:" + age);
		//id, name, email, company phone, age, location 출력
	}
}
