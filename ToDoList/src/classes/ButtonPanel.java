package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel{
	private JButton addTask;
	private JButton clear;
	private JButton save;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	//Constructor
	ButtonPanel(){
		this.setPreferredSize(new Dimension(400, 60));
		
		addTask = new JButton("Add Task");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		
		this.add(addTask);
		this.add(Box.createHorizontalStrut(30));
		
		clear = new JButton("Clear Task");
		clear.setBorder(emptyBorder);
		clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		
		this.add(clear);
		this.add(Box.createHorizontalStrut(30));
		
		save = new JButton("Save Task");
		save.setBorder(emptyBorder);
		save.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		
		this.add(save);
	}
	
	public JButton getAddTask() {
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}
	
	public JButton getSave() {
		return save;
	}
	
}
