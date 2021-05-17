package worker;

import java.util.Scanner;

import exception.EmailFormatException;

public interface WorkerInput {//인터페이스 생성
	
	public void getUserInput(Scanner input);
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setEmail(String email) throws EmailFormatException;
	
	public void setPhone(String phone);
	
	public void setAge(int age);
	
	public void printInfo();
	
	public void setWorkerID(Scanner input);
	
	public void setWorkerName(Scanner input);
	
	public void setWorkerEmail(Scanner input);
	
	public void setWorkerPhone(Scanner input);
	
	public void setWorkerAge(Scanner input);
	
	
}
