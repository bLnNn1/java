package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame{
	private TitleBar title;
	private List list;
	private ButtonPanel btnPanel;
	
	private JButton addTask;
	private JButton clear;
	private JButton save;
	
	//Constructor
	AppFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		title = new TitleBar();
		list = new List();
		btnPanel = new ButtonPanel();
		
		this.add(title,BorderLayout.NORTH);
		this.add(btnPanel, BorderLayout.SOUTH);
		this.add(list, BorderLayout.CENTER);
		
		addTask = btnPanel.getAddTask();
		clear = btnPanel.getClear();
		save = btnPanel.getSave();
		
		addListeners();
		
		
		this.pack();
		this.setSize(400,700);
	}
	
	public void addListeners() {
		addTask.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Task task = new Task();
				list.add(task);
				list.updateNumbers();
				
				task.getDone().addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						task.changeState();
						list.updateNumbers();
						revalidate();
					}
				});
				
				clear.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						list.removeCompletedTasks();
						repaint();
					}
				});
				
				save.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						try {
							task.saveTask();
							revalidate();
	//						task.checkTask();
							revalidate();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
			}
		});
	}
}