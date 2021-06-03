package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WorkerViewer;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {//ButtonViewListener 积己磊 积己
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//actionPerformed 窃荐 积己
		JButton b = (JButton)e.getSource();//button 眠啊
		WorkerViewer viewer = frame.getWorkerviewer();
		frame.setupPanel(viewer);

	}

}
