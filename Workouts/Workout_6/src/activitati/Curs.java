package activitati;

import java.util.ArrayList;

import basic.Persoana;

public class Curs implements Activitate {
	private String nume;
	private String dificultate = "medie";
	private Persoana trainer;
	private ArrayList<Persoana> exploreri;
	private int cost;
	private String numeCurs = "Curs java";
	private String durata = "";
	
	public Curs(String nume, String dificultate, Persoana trainer, ArrayList<Persoana> exploreri, int cost) {
		this.nume = nume;
		this.dificultate = dificultate;
		this.trainer = trainer;
		this.exploreri = exploreri;
		this.cost = cost;
	}
	
	public void setNume (String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public void setDificultate (String dificultate) {
		this.dificultate = dificultate;
	}
	
	public String getDificultate() {
		return this.dificultate;
	}
	
	public void setTrainer(Persoana trainer) {
		this.trainer = trainer;
	}
	
	public Persoana getTrainer() {
		return this.trainer;
	}
	
	public void setExploreri(ArrayList<Persoana> exploreri) {
		this.exploreri = exploreri;
	}
	
	public ArrayList<Persoana> getExploreri() {
		return this.exploreri;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public String getDurata() {
		if (dificultate.equals("usor")) {
			this.durata.equals("1 luna");
		}
		else if (dificultate.equals("mediu")) {
			this.durata.equals("3 luni");
		}
		else if (dificultate.equals("dificil")) {
			this.durata.equals("5 luni");
		}
		else {
			this.durata.equals("necunoscut");
		}
		return this.durata;
	}
	
	public String getDescriere() {
		return "Nume curs: " + numeCurs + ". Dificultate: " + dificultate;
	}

}
