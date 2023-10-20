package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{
	
	private JLabel index;
	private JTextField taskName;
	private JButton done;
	
	private boolean checked;
	
	//Constructor
	Task(){
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.red);
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index, BorderLayout.WEST);
		
		taskName = new JTextField(20);
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.red);
		
		this.add(taskName, BorderLayout.CENTER);
		
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done, BorderLayout.EAST);
	}
	
	public void saveTask() throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\Andrei\\eclipse-workspace\\ToDoList\\src\\classes\\database.txt", true);
		//BufferedReader bReader = new BufferedReader(reader);
		// cu bReader citesti fisierul sa verifici deja task urile existente, pentru a nu fi repetate in fisier.
		
		taskName.write(writer);
		writer.write("\n");
		writer.close();
		
	}
	
//	public void checkTask() throws IOException {
//		FileReader reader = new FileReader("C:\\Users\\Andrei\\eclipse-workspace\\ToDoList\\src\\classes\\database.txt");
//		BufferedReader bReader = new BufferedReader(reader);
//		String line;
//		
//		LinkedList<String> list = new LinkedList<String>();
//		
//		while ((line = bReader.readLine()) != null) {
//			list.add(line);
//			
//		}
		// ESTI PE APROAPE
	// cu saveTask() se salveaza ok in fisier, probabil metoda checkTask() trebuie rescrisa
	// mai ai de rezolvat: stergere date si salvare JTextField cand deschizi aplicatia
	
//		for (int i = 0; i < list.size(); i++) {
//			if (this.getBackground().equals(Color.red)) {
//				list.remove(i);
//				break;
//			}
//		}
		
	//	BufferedWriter bWriter = new BufferedWriter(new FileWriter("C:\\Users\\Andrei\\eclipse-workspace\\ToDoList\\src\\classes\\database.txt"));
		
//		for (String nLine: list) {
//			bWriter.write(nLine+ "\n");
//		}
//		bReader.close();
//		reader.close();
		//bWriter.close();
//	}
	
	public JButton getDone() {
		return done;
	}
	
	public void changeIndex(int num) {
		this.index.setText(num+"");
		this.revalidate();
	}
	
	public void changeState() {
		if (this.getBackground().equals(Color.red)) {
		this.setBackground(Color.green);
		taskName.setBackground(Color.green);
		checked = true;
		revalidate();
		}
		else if (this.getBackground().equals(Color.green)) {
			this.setBackground(Color.red);
			taskName.setBackground(Color.red);
			checked = false;
			revalidate();
		}
		revalidate();
	}
	
	public boolean getState() {
		return checked;
	}
}
