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

public class WorkerAdder extends JPanel {//JPanel ��ӹ޴´�.
	
	WindowFrame frame;
	WorkerManager workerManager;

	public WorkerAdder(WindowFrame frame, WorkerManager workerManager) {//WorkerAdder ������ ����
		this.frame = frame;
		this.workerManager = workerManager;
		
		JPanel panel = new JPanel();//�г� ����
		panel.setLayout(new SpringLayout());

		JLabel labelID = new JLabel("ID: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldID = new JTextField(10);//JTextField ����
		labelID.setLabelFor(fieldID);
		panel.add(labelID);//�гο� �߰�
		panel.add(fieldID);//�гο� �߰�
		
		JLabel labelName = new JLabel("Name: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldName = new JTextField(10);//JTextField ����
		labelID.setLabelFor(fieldName);
		panel.add(labelName);//�гο� �߰�
		panel.add(fieldName);//�гο� �߰�
		
		JLabel labelEmail = new JLabel("Email: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldEmail = new JTextField(10);//JTextField ����
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);//�гο� �߰�
		panel.add(fieldEmail);//�гο� �߰�
		
		JLabel labelPhone = new JLabel("Phone: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldPhone = new JTextField(10);//JTextField ����
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);//�гο� �߰�
		panel.add(fieldPhone);//�гο� �߰�
		
		JLabel labelAge = new JLabel("Age: ",JLabel.TRAILING);//Identifies the trailing edge of text for use with left-to-rightand right-to-left languages. Used by buttons and labels.
		JTextField fieldAge = new JTextField(10);//JTextField ����
		labelID.setLabelFor(fieldAge);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new WorkerAdderListener(fieldID,fieldName,fieldEmail,fieldPhone,fieldAge,workerManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new WorkerAdderCancelListener(frame));
		
		panel.add(labelAge);//�гο� �߰�
		panel.add(fieldAge);//�гο� �߰�
		
		panel.add(saveButton);//�гο� ��ư�߰�
		panel.add(cancelButton);//�гο� ��ư�߰�
		
		SpringUtilities.makeCompactGrid(panel,6,2,6,6,6,6);
		
		this.add(panel);
		this.setVisible(true);//������ â�� ����
	}
}
