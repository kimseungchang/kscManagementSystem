package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WorkerViewer extends JFrame {//JFrame 상속받는다.

	public WorkerViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Phone");
		model.addColumn("Age");
		model.addColumn("Contect Info.");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300,300);//크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫으면 프로그램 종료
		this.setVisible(true);//윈도우 창에 띄우기
	}
}
