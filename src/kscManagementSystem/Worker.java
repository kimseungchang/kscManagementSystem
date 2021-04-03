package kscManagementSystem;

public class Worker {
	int id;
	String name;
	String email;
	String phone;
	int age;
	
	public Worker(int id, String name, String email, String phone, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("id:" + id +" name:" + name +" email:" + email +" phone:" + phone +" age:" + age);
	}

}
