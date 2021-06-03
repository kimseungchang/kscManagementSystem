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
		this.setSize(500,300);//크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫으면 프로그램 종료
		
		this.workerManager = workerManager;
		menuselection = new MenuSelection(this);//MenuSelection 객체 생성
		workeradder = new WorkerAdder(this);//WorkerAdder 객체 생성
		workerviewer = new WorkerViewer(this, this.workerManager);//WorkerViewer 객체 생성
		
		this.add(menuselection);//menuselection으로 채우기

		this.setVisible(true);//윈도우 창에 띄우기
	}
	
	public void setupPanel(JPanel panel) {//setupPanel 함수 생성
		this.getContentPane().removeAll();//우리가 생각 안한 Gui 삭제
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
