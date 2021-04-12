package worker;

import java.util.Scanner;

public class Worker {//Worker 클래스 생성
	protected Workerlocation location=Workerlocation.Seoul;
	protected int id;//변수 선언
	protected String name;
	protected String email;
	protected String phone;
	protected int age;

	public Worker() {// Worker 생성자 선언
		
	}
	
	public Worker(int id, String name, String email, String phone, int age) {
		//worker 생성자 선언, 객체 초기화
		this.id = id;//this 키워드를 사용해 위의 id와 이곳에서의 id를 구분한다.
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
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

	public void setEmail(String email) {
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
	
	public void printInfo() {//함수 생성
		System.out.println("id:" + id +" name:" + name +" email:" + email +" phone:" + phone +" age:" + age);
		//id, name, email. phone, age 출력
	
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

}
