package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {//JFrame 상속받는다.
	
	public MenuSelection() {//MenuSelection 생성자 생성
		this.setSize(300,300);//크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫으면 프로그램 종료
		
		JPanel panel1 = new JPanel();//패널 선언
		JPanel panel2 = new JPanel();//패널 선언
		JLabel label = new JLabel("MenuSelection");//라벨 선언
		
		JButton button1 = new JButton("Add Worker");//버튼 생성
		JButton button2 = new JButton("View Worker");//버튼 생성
		JButton button3 = new JButton("Edit Worker");//버튼 생성
		JButton button4 = new JButton("Delet Worker");//버튼 생성
		JButton button5 = new JButton("Exit Program");//버튼 생성
		
		panel1.add(label);//label 패널에 추가
		panel2.add(button1);//버튼 패널에 추가
		panel2.add(button2);//버튼 패널에 추가
		panel2.add(button3);//버튼 패널에 추가
		panel2.add(button4);//버튼 패널에 추가
		panel2.add(button5);//버튼 패널에 추가
		
		this.add(panel1,BorderLayout.NORTH);//NORTH에 위치 시킨다.
		this.add(panel2,BorderLayout.CENTER);//CENTER에 위치 시킨다.
		this.setVisible(true);//윈도우 창에 띄우기
	}
}
