package todolist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	// TO DO LIST
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int flag = 0;
		
		while (flag == 0) {
		try {
		System.out.println("1.Adauga		2.Verifica		3.Sterge		4.Inchide");
		int n = in.nextInt();
		
		if (n == 1) {
			newTodo();
		}
		else if (n == 2){
			checkTodo();
		}
		else if (n == 3) {
			clearTodo();
		}
		else if (n == 4) {
			System.out.println("Aplicatia a fost inchisa.");
			flag++;
		}
		else {
			System.out.println("Alegeti un numar corect!");
		}
		
		
		} catch (Exception e) {
			System.out.println("Alegeti un numar corect!");
			in.nextLine();
		}
		}
	}
	
	public static void newTodo() {
		Scanner nt = new Scanner(System.in);
		
		try {
		FileWriter writer = new FileWriter("ToDoFile.txt", true);
		
		System.out.println("Adaugati data. (dd/mm/yyyy)");
		String date = nt.nextLine();
		writer.write(date + " ");
		
		System.out.println("Adaugati task-ul.");
		String todo = nt.nextLine();
		writer.write(todo + "\n");
		
		writer.close();
		} catch (Exception e) {
			System.out.println("A aparut o eroare! Verificati daca fisierul a fost creat.");
		} finally {
//			nt.close();
		}
	}
	
	public static void checkTodo() throws IOException {
		FileReader reader = new FileReader("ToDoFile.txt");
		BufferedReader bReader = new BufferedReader(reader);
		
		String line;
		
		ArrayList<String> list = new ArrayList<String>();
		
		while ((line = bReader.readLine()) != null) {
			System.out.println(line);
			list.add(line);
		}
		if (list.isEmpty()) {
			System.out.println("Lista este goala!");
		}
		
		bReader.close();
		reader.close();
	}
	
	public static void clearTodo() throws IOException {
		Scanner ct = new Scanner(System.in);
		
		FileReader reader = new FileReader("ToDoFile.txt");
		BufferedReader bReader = new BufferedReader(reader);
		
		String line;
		String task;
		ArrayList<String> list = new ArrayList<String>();
		
		while ((line = bReader.readLine()) != null) {
			list.add(line);
		}
		
		if (list.isEmpty()) {
			System.out.println("Lista este goala!");
		}
		else {
		System.out.println("Ce task doriti sa stergeti? Va rog scrieti numele task-ului complet.");
		task = ct.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(task)) {
				list.remove(i);
				System.out.println("Task-ul '" + task + "' a fost sters.");
				break;
			}
			if (i == list.size()-1) {
				System.out.println("Task-ul " + task + " nu exista in lista.");
			}
		}
		}
		
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("ToDoFile.txt"));
		
		for (String nLine: list) {
			bWriter.write(nLine + "\n");
		}
		
		bReader.close();
		reader.close();
		bWriter.close();
//		ct.close();
	}
	
}
