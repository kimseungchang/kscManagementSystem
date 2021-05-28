package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class WorkerAdder extends JFrame {//JFrame 상속받는다.

	public WorkerAdder() {
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
		panel.add(labelAge);//패널에 추가
		panel.add(fieldAge);//패널에 추가
		
		panel.add(new JButton("save"));//패널에 버튼추가
		panel.add(new JButton("cancel"));//패널에 버튼추가
		
		SpringUtilities.makeCompactGrid(panel,6,2,6,6,6,6);
		
		this.setSize(300,300);//크기 설정
		this.setContentPane(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫으면 프로그램 종료
		this.setVisible(true);//윈도우 창에 띄우기
	}
}
