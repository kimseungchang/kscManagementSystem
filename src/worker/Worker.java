package worker;

import java.util.Scanner;

public class Worker {//Worker Ŭ���� ����
	protected Workerlocation location=Workerlocation.Seoul;
	protected int id;//���� ����
	protected String name;
	protected String email;
	protected String phone;
	protected int age;

	public Worker() {// Worker ������ ����
		
	}
	
	public Worker(int id, String name, String email, String phone, int age) {
		//worker ������ ����, ��ü �ʱ�ȭ
		this.id = id;//this Ű���带 ����� ���� id�� �̰������� id�� �����Ѵ�.
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}
	//���� ������ ���� setters, getters �Լ��� ����
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
	
	public void printInfo() {//�Լ� ����
		System.out.println("id:" + id +" name:" + name +" email:" + email +" phone:" + phone +" age:" + age);
		//id, name, email. phone, age ���
	
	}
	public void getUserInput(Scanner input) {
		System.out.print("Worker ID:");
		int id = input.nextInt();//��ü �ʵ忡 �־��ش�.
		this.setId(id);//��ü�� ���� �� ����
		
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
