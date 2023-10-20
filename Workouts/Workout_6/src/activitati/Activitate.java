package activitati;

public interface Activitate {
	public String descriere = "";
	public String durata = "";
	
	public default String getDescriere() {
		return descriere;
	}
	
	public default String getDurata() {
		return durata;
	}
}
