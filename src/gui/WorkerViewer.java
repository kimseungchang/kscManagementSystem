package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WorkerViewer extends JFrame {//JFrame ��ӹ޴´�.

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
		this.setSize(300,300);//ũ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â ������ ���α׷� ����
		this.setVisible(true);//������ â�� ����
	}
}
