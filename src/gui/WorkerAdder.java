package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import kscManagementSystem.WorkerManager;
import listener.WorkerAdderCancelListener;
import listener.WorkerAdderListener;

public class WorkerAdder extends JPanel {//JPanel 상속받는다.
	
	WindowFrame frame;
	WorkerManager workerManager;

	public WorkerAdder(WindowFrame frame, WorkerManager workerManager) {//WorkerAdder 생성자 생성
		this.frame = frame;
		this.workerManager = workerManager;
		
		JPanel panel = new JPanel();//패널 생성
		panel.setLayout(new SpringLayout());

		JLabel labelID = new JLabel("ID: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldID = new JTextField(10);//JTextField 생성
		labelID.setLabelFor(fieldID);
		panel.add(labelID);//패널에 추가
		panel.add(fieldID);//패널에 추가
		
		JLabel labelName = new JLabel("Name: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldName = new JTextField(10);//JTextField 생성
		labelID.setLabelFor(fieldName);
		panel.add(labelName);//패널에 추가
		panel.add(fieldName);//패널에 추가
		
		JLabel labelEmail = new JLabel("Email: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldEmail = new JTextField(10);//JTextField 생성
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);//패널에 추가
		panel.add(fieldEmail);//패널에 추가
		
		JLabel labelPhone = new JLabel("Phone: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldPhone = new JTextField(10);//JTextField 생성
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);//패널에 추가
		panel.add(fieldPhone);//패널에 추가
		
		JLabel labelAge = new JLabel("Age: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldAge = new JTextField(10);//JTextField 생성
		labelID.setLabelFor(fieldAge);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new WorkerAdderListener(fieldID,fieldName,fieldEmail,fieldPhone,fieldAge,workerManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new WorkerAdderCancelListener(frame));
		
		panel.add(labelAge);//패널에 추가
		panel.add(fieldAge);//패널에 추가
		
		panel.add(saveButton);//패널에 버튼추가
		panel.add(cancelButton);//패널에 버튼추가
		
		SpringUtilities.makeCompactGrid(panel,6,2,6,6,6,6);
		
		this.add(panel);
		this.setVisible(true);//윈도우 창에 띄우기
	}
}
