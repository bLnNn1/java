package basic;

public class Trainer extends Persoana {

	@Override
	public String getResponsabilitati() {
		return "Pregatirea materialelor, evaluarea temelor, crearea contextului de lucru, raspunderea la intrebari";
	}
	
	public Trainer(String nume, String prenume, String oras, Integer varsta, boolean casatorita) {
		super(nume, prenume, oras, varsta, casatorita);
	}

	public String obtineIdentificator() {
		return "trainer_" + prenume.toLowerCase().replaceAll(" ", "").replaceAll("-", "") + "_" + nume.toUpperCase().replaceAll(" ", "").replaceAll("-", "") ;
	}
}
