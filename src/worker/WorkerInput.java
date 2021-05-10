package worker;

import java.util.Scanner;

public interface WorkerInput {//인터페이스 생성
	
	public void getUserInput(Scanner input);
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setEmail(String email);
	
	public void setPhone(String phone);
	
	public void setAge(int age);
	
	public void printInfo();
}
