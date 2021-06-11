package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WorkerAdder;
import gui.WorkerViewer;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {//ButtonAddListener 积己磊 积己
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//actionPerformed 窃荐 积己
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getWorkeradder());
		frame.revalidate();
		frame.repaint();
	//	JButton b = (JButton)e.getSource();//button 眠啊
	//	WorkerAdder adder = frame.getWorkeradder();
	//	frame.setupPanel(adder);
	}
}
