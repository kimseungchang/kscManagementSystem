package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel {//JPanel ��ӹ޴´�.
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {//MenuSelection ������ ����
		this.frame = frame;
		
		this.setLayout(new BorderLayout());//�⺻ default�� BorderLayout���� ����
		
		JPanel panel1 = new JPanel();//�г� ����
		JPanel panel2 = new JPanel();//�г� ����
		JLabel label = new JLabel("MenuSelection");//�� ����
		
		JButton button1 = new JButton("Add Worker");//��ư ����
		JButton button2 = new JButton("View Worker");//��ư ����
		JButton button3 = new JButton("Edit Worker");//��ư ����
		JButton button4 = new JButton("Delet Worker");//��ư ����
		JButton button5 = new JButton("Exit Program");//��ư ����
		
		button1.addActionListener(new ButtonAddListener(frame));//Listener ����
		button2.addActionListener(new ButtonViewListener(frame));//Listener ����
		
		panel1.add(label);//label �гο� �߰�
		panel2.add(button1);//��ư �гο� �߰�
		panel2.add(button2);//��ư �гο� �߰�
		panel2.add(button3);//��ư �гο� �߰�
		panel2.add(button4);//��ư �гο� �߰�
		panel2.add(button5);//��ư �гο� �߰�
		
		this.add(panel1,BorderLayout.NORTH);//NORTH�� ��ġ ��Ų��.
		this.add(panel2,BorderLayout.CENTER);//CENTER�� ��ġ ��Ų��.
	}
}
