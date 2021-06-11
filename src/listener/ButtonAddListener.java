package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WorkerAdder;
import gui.WorkerViewer;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {//ButtonAddListener ������ ����
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//actionPerformed �Լ� ����
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getWorkeradder());
		frame.revalidate();
		frame.repaint();
	//	JButton b = (JButton)e.getSource();//button �߰�
	//	WorkerAdder adder = frame.getWorkeradder();
	//	frame.setupPanel(adder);
	}
}
