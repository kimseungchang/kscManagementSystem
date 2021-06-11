package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WorkerViewer;
import kscManagementSystem.WorkerManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {//ButtonViewListener ������ ����
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//actionPerformed �Լ� ����
		WorkerViewer workerViewer = frame.getWorkerviewer();
		WorkerManager workerManager=getObject("workermanager.ser");
		workerViewer.setWorkerManager(workerManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(workerViewer);
		frame.revalidate();
		frame.repaint();
		
//		JButton b = (JButton)e.getSource();//button �߰�
//		WorkerViewer viewer = frame.getWorkerviewer();
//		frame.setupPanel(viewer);

	}
	
	public static WorkerManager getObject(String filename) {//getObject ����
		WorkerManager workerManager=null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);//���Ͽ� ��ü����

			workerManager = (WorkerManager)in.readObject();//����ȯ �ؼ� �����´�.

			in.close();
			file.close();//���� �ݴ´�.

		} catch (FileNotFoundException e) {
			return workerManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return workerManager;//�����Ѵ�.
	}

}
