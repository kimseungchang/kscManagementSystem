package worker;

import java.util.Scanner;

public abstract class Worker {//Worker Ŭ���� ����, Worker��� ��ü�� �������� �ʴ´�.
	protected Workerlocation location=Workerlocation.Seoul;
	protected int id;//���� ����
	protected String name;
	protected String email;
	protected String phone;
	protected int age;

	public Worker() {// Worker ������ ����

	}
	public Worker(Workerlocation location) {// Worker ������ ����
		this.location=location;
	}

	public Worker(int id, String name, String email, String phone, int age) {
		//worker ������ ����, ��ü �ʱ�ȭ
		this.id = id;//this Ű���带 ����� ���� id�� �̰������� id�� �����Ѵ�.
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public Worker(Workerlocation location, int id, String name, String email, String phone, int age) {
		//worker ������ ����, ��ü �ʱ�ȭ
		this.id = id;//this Ű���带 ����� ���� id�� �̰������� id�� �����Ѵ�.
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.location=location;//�����ڿ� location �߰�
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

	public abstract void printInfo();//�߻� �޼ҵ� ����.

}