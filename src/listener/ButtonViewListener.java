package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WorkerViewer;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {//ButtonViewListener ������ ����
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//actionPerformed �Լ� ����
		JButton b = (JButton)e.getSource();//button �߰�
		WorkerViewer viewer = frame.getWorkerviewer();
		frame.setupPanel(viewer);

	}

}
