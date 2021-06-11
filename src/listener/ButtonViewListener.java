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

	public ButtonViewListener(WindowFrame frame) {//ButtonViewListener 생성자 생성
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//actionPerformed 함수 생성
		WorkerViewer workerViewer = frame.getWorkerviewer();
		WorkerManager workerManager=getObject("workermanager.ser");
		workerViewer.setWorkerManager(workerManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(workerViewer);
		frame.revalidate();
		frame.repaint();
		
//		JButton b = (JButton)e.getSource();//button 추가
//		WorkerViewer viewer = frame.getWorkerviewer();
//		frame.setupPanel(viewer);

	}
	
	public static WorkerManager getObject(String filename) {//getObject 생성
		WorkerManager workerManager=null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);//파일에 객체저장

			workerManager = (WorkerManager)in.readObject();//형변환 해서 가져온다.

			in.close();
			file.close();//파일 닫는다.

		} catch (FileNotFoundException e) {
			return workerManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return workerManager;//리턴한다.
	}

}
