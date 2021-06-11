package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import kscManagementSystem.WorkerManager;
import worker.WorkerInput;

public class WorkerViewer extends JPanel {//JPanel 상속받는다.

	WindowFrame frame;
	WorkerManager workerManager;

	public WorkerManager getWorkerManager() {
		return workerManager;
	}

	public void setWorkerManager(WorkerManager workerManager) {
		this.workerManager = workerManager;
		this.removeAll();

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Phone");
		model.addColumn("Age");

		for(int i=0;i<workerManager.size();i++) {//workerManager 크기만큼 반복한다.
			Vector row = new Vector();//Vector 로 넣어준다.
			WorkerInput wo = workerManager.get(i);
			row.add(wo.getId());//내용 포함시킨다.
			row.add(wo.getName());
			row.add(wo.getEmail());
			row.add(wo.getPhone());
			row.add(wo.getAge());
			model.addRow(row);

		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

	public WorkerViewer(WindowFrame frame,	WorkerManager workerManager) {//WorkerViewer 생성자 생성
		this.frame = frame;
		this.workerManager = workerManager;

		System.out.println("***"+workerManager.size()+"***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Phone");
		model.addColumn("Age");

		for(int i=0;i<workerManager.size();i++) {//workerManager 크기만큼 반복한다.
			Vector row = new Vector();//Vector 로 넣어준다.
			WorkerInput wo = workerManager.get(i);
			row.add(wo.getId());//내용 포함시킨다.
			row.add(wo.getName());
			row.add(wo.getEmail());
			row.add(wo.getPhone());
			row.add(wo.getAge());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
