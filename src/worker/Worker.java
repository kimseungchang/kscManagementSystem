package worker;

import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;

public abstract class Worker implements WorkerInput, Serializable {//Serializable 구현하겠다.
	/**
	 * 
	 */
	private static final long serialVersionUID = -1727709034413491035L;//serialVersionUID 추가
	
	protected Workerlocation location=Workerlocation.Seoul;
	protected int id;//변수 선언
	protected String name;
	protected String email;
	protected String phone;
	protected int age;

	public Worker() {// Worker 생성자 선언

	}
	public Worker(Workerlocation location) {// Worker 생성자 선언
		this.location=location;
	}

	public Worker(int id, String name, String email, String phone, int age) {
		//worker 생성자 선언, 객체 초기화
		this.id = id;//this 키워드를 사용해 위의 id와 이곳에서의 id를 구분한다.
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public Worker(Workerlocation location, int id, String name, String email, String phone, int age) {
		//worker 생성자 선언, 객체 초기화
		this.id = id;//this 키워드를 사용해 위의 id와 이곳에서의 id를 구분한다.
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.location=location;//생성자에 location 추가
	}

	//위에 각각에 대한 setters, getters 함수가 생성
	public Workerlocation getLocation() {
		return location;
	}

	public void setLocation(Workerlocation location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException{//email 관련 조건 추가
		if(!email.contains("@") && !email.equals("")) {//email에 @가 없거나 비어있다면
			throw new EmailFormatException();//객체 생성해 오류 던진다.
		}
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void printInfo();//추상 메소드 선언.

	public void setWorkerID(Scanner input) {//setWorkerID 함수 생성
		System.out.print("Worker ID:");
		int id=input.nextInt();//id를 int로 받아드린다.
		this.setId(id);//id를 넣는다.
	}

	public void setWorkerName(Scanner input) {//setWorkerName 함수 생성
		System.out.print("Worker name:");
		String name=input.next();//콘솔에서 받은 값을 문자로 사용
		this.setName(name);//name 저장
	}

	public void setWorkerEmail(Scanner input) {//setWorkerEmail 함수 생성
		String email="";
		while(!email.contains("@")) {//email에 @ 포함이 안됬다면
			System.out.print("Email address:");
			email=input.next();//콘솔에서 받은 값을 문자로 사용
			try {//예외 검사
				this.setEmail(email);
			} catch (EmailFormatException e) {//예외 일 때 실행
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}

	public void setWorkerPhone(Scanner input) {//setWorkerPhone 함수 생성
		System.out.print("Phone number:");
		String phone=input.next();//콘솔에서 받은 값을 문자로 사용
		this.setPhone(phone);//phone 저장
	}

	public void setWorkerAge(Scanner input) {//setWorkerAge 함수 생성
		System.out.print("Worker Age:");
		int age=input.nextInt();//콘솔에서 받은 값을 정수로 사용
		this.setAge(age);//age 저장
	}

	public String getLocationString() {
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
		return slocation;
	}

}
