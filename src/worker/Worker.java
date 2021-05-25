package worker;

import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;

public abstract class Worker implements WorkerInput, Serializable {//Serializable �����ϰڴ�.
	/**
	 * 
	 */
	private static final long serialVersionUID = -1727709034413491035L;//serialVersionUID �߰�
	
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

	public void setEmail(String email) throws EmailFormatException{//email ���� ���� �߰�
		if(!email.contains("@") && !email.equals("")) {//email�� @�� ���ų� ����ִٸ�
			throw new EmailFormatException();//��ü ������ ���� ������.
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

	public abstract void printInfo();//�߻� �޼ҵ� ����.

	public void setWorkerID(Scanner input) {//setWorkerID �Լ� ����
		System.out.print("Worker ID:");
		int id=input.nextInt();//id�� int�� �޾Ƶ帰��.
		this.setId(id);//id�� �ִ´�.
	}

	public void setWorkerName(Scanner input) {//setWorkerName �Լ� ����
		System.out.print("Worker name:");
		String name=input.next();//�ֿܼ��� ���� ���� ���ڷ� ���
		this.setName(name);//name ����
	}

	public void setWorkerEmail(Scanner input) {//setWorkerEmail �Լ� ����
		String email="";
		while(!email.contains("@")) {//email�� @ ������ �ȉ�ٸ�
			System.out.print("Email address:");
			email=input.next();//�ֿܼ��� ���� ���� ���ڷ� ���
			try {//���� �˻�
				this.setEmail(email);
			} catch (EmailFormatException e) {//���� �� �� ����
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}

	public void setWorkerPhone(Scanner input) {//setWorkerPhone �Լ� ����
		System.out.print("Phone number:");
		String phone=input.next();//�ֿܼ��� ���� ���� ���ڷ� ���
		this.setPhone(phone);//phone ����
	}

	public void setWorkerAge(Scanner input) {//setWorkerAge �Լ� ����
		System.out.print("Worker Age:");
		int age=input.nextInt();//�ֿܼ��� ���� ���� ������ ���
		this.setAge(age);//age ����
	}

	public String getLocationString() {
		String slocation ="none";
		switch(this.location) {//switch���� �̿��� ��µǴ� ���� �ٸ��� �Ѵ�.
		case Seoul:
			slocation="����";
			break;
		case Busan:
			slocation="2ȣ��";
			break;
		case Jinju:
			slocation="3ȣ��";
			break;
		case Gwangju:
			slocation="4ȣ��";
			break;
		default:	
		}
		return slocation;
	}

}
