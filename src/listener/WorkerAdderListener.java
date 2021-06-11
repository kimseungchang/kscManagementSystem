package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JTextField;

import exception.EmailFormatException;
import gui.WindowFrame;
import gui.WorkerAdder;
import gui.WorkerViewer;
import kscManagementSystem.WorkerManager;
import worker.SeoulWorker;
import worker.WorkerInput;
import worker.Workerlocation;

public class WorkerAdderListener implements ActionListener {

	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldPhone;
	JTextField fieldAge;
	
	WorkerManager workerManager;
	
	public WorkerAdderListener(JTextField fieldID, JTextField fieldName, JTextField fieldEmail, JTextField fieldPhone,
			JTextField fieldAge, WorkerManager workerManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldPhone = fieldPhone;
		this.fieldAge = fieldAge;
		this.workerManager = workerManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//actionPerformed 함수 생성
		WorkerInput worker = new SeoulWorker(Workerlocation.Seoul);
		try {
			worker.setId(Integer.parseInt(fieldID.getText()));
			worker.setName(fieldName.getText());
			worker.setEmail(fieldEmail.getText());
			worker.setPhone(fieldPhone.getText());
			worker.setAge(Integer.parseInt(fieldAge.getText()));
			workerManager.addWorker(worker);
			worker.printInfo();
			putObject(workerManager, "workermanager.ser");//putObject 함수 실행
		} catch (EmailFormatException e1) {
			e1.printStackTrace();
		}
	}
	public static void putObject(WorkerManager workerManager,String filename) {//putObject 생성
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(workerManager);//쓴다.

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
