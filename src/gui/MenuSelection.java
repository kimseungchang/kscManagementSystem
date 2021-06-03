package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel {//JPanel 상속받는다.
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {//MenuSelection 생성자 생성
		this.frame = frame;
		
		this.setLayout(new BorderLayout());//기본 default를 BorderLayout으로 변경
		
		JPanel panel1 = new JPanel();//패널 선언
		JPanel panel2 = new JPanel();//패널 선언
		JLabel label = new JLabel("MenuSelection");//라벨 선언
		
		JButton button1 = new JButton("Add Worker");//버튼 생성
		JButton button2 = new JButton("View Worker");//버튼 생성
		JButton button3 = new JButton("Edit Worker");//버튼 생성
		JButton button4 = new JButton("Delet Worker");//버튼 생성
		JButton button5 = new JButton("Exit Program");//버튼 생성
		
		button1.addActionListener(new ButtonAddListener(frame));//Listener 연결
		button2.addActionListener(new ButtonViewListener(frame));//Listener 연결
		
		panel1.add(label);//label 패널에 추가
		panel2.add(button1);//버튼 패널에 추가
		panel2.add(button2);//버튼 패널에 추가
		panel2.add(button3);//버튼 패널에 추가
		panel2.add(button4);//버튼 패널에 추가
		panel2.add(button5);//버튼 패널에 추가
		
		this.add(panel1,BorderLayout.NORTH);//NORTH에 위치 시킨다.
		this.add(panel2,BorderLayout.CENTER);//CENTER에 위치 시킨다.
	}
}
