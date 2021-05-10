package worker;

import java.util.Scanner;

public abstract class Worker {//Worker 클래스 생성, Worker라는 객체를 생성하지 않는다.
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

	public abstract void printInfo();//추상 메소드 선언.

}
