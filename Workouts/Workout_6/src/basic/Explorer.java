package basic;

public class Explorer extends Persoana {

	@Override
	public String getResponsabilitati() {
		return "Parcurgerea materialelor, rezolvarea temelor, participarea la activitati";
	}

	public Explorer(String nume, String prenume, String oras, Integer varsta, boolean casatorita) {
		super(nume, prenume, oras, varsta, casatorita);
	}
	
	public String obtineIdentificator() {
		return "explorer_" + prenume.toLowerCase().replaceAll(" ", "").replaceAll("-", "") + "_" + nume.toUpperCase().replaceAll(" ", "").replaceAll("-", "") ;
	}
}
