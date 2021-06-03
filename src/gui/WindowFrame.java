package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import kscManagementSystem.WorkerManager;

public class WindowFrame extends JFrame {
	WorkerManager workerManager;
	MenuSelection menuselection;
	WorkerAdder workeradder;
	WorkerViewer workerviewer;

	public WindowFrame(WorkerManager workerManager) {
		this.setSize(500,300);//ũ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â ������ ���α׷� ����
		
		this.workerManager = workerManager;
		menuselection = new MenuSelection(this);//MenuSelection ��ü ����
		workeradder = new WorkerAdder(this);//WorkerAdder ��ü ����
		workerviewer = new WorkerViewer(this, this.workerManager);//WorkerViewer ��ü ����
		
		this.add(menuselection);//menuselection���� ä���

		this.setVisible(true);//������ â�� ����
	}
	
	public void setupPanel(JPanel panel) {//setupPanel �Լ� ����
		this.getContentPane().removeAll();//�츮�� ���� ���� Gui ����
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public WorkerAdder getWorkeradder() {
		return workeradder;
	}

	public void setWorkeradder(WorkerAdder workeradder) {
		this.workeradder = workeradder;
	}

	public WorkerViewer getWorkerviewer() {
		return workerviewer;
	}

	public void setWorkerviewer(WorkerViewer workerviewer) {
		this.workerviewer = workerviewer;
	}

}
