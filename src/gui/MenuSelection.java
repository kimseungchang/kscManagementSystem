package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {//JFrame ��ӹ޴´�.
	
	public MenuSelection() {//MenuSelection ������ ����
		this.setSize(300,300);//ũ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â ������ ���α׷� ����
		
		JPanel panel1 = new JPanel();//�г� ����
		JPanel panel2 = new JPanel();//�г� ����
		JLabel label = new JLabel("MenuSelection");//�� ����
		
		JButton button1 = new JButton("Add Worker");//��ư ����
		JButton button2 = new JButton("View Worker");//��ư ����
		JButton button3 = new JButton("Edit Worker");//��ư ����
		JButton button4 = new JButton("Delet Worker");//��ư ����
		JButton button5 = new JButton("Exit Program");//��ư ����
		
		panel1.add(label);//label �гο� �߰�
		panel2.add(button1);//��ư �гο� �߰�
		panel2.add(button2);//��ư �гο� �߰�
		panel2.add(button3);//��ư �гο� �߰�
		panel2.add(button4);//��ư �гο� �߰�
		panel2.add(button5);//��ư �гο� �߰�
		
		this.add(panel1,BorderLayout.NORTH);//NORTH�� ��ġ ��Ų��.
		this.add(panel2,BorderLayout.CENTER);//CENTER�� ��ġ ��Ų��.
		this.setVisible(true);//������ â�� ����
	}
}
