package ro.digitalnation.workout3;

public class Persoana {
	private String nume, prenume, city;
	private int age;
	private boolean casatorit;
	
	public static String curs;
	
	public Persoana() {
		
	}
	
	public Persoana(String nume, String prenume, String city, int age, boolean casatorit) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.city = city;
		this.age = age;
		this.casatorit = casatorit;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isCasatorit() {
		return casatorit;
	}
	public void setCasatorit(boolean casatorit) {
		this.casatorit = casatorit;
	}
	@Override
	public String toString() {
		return "Persoana nume=" + nume + ", prenume=" + prenume + ", city=" + city + ", age=" + age + ", casatorit="
				+ casatorit + ", curs=" + curs;
	}
	
	public void schimbaVarsta() {
		this.age = this.age + 1;
		System.out.println("Noua varsta a lui " + this.prenume + " este " + this.age);
	}
	
	public String obtineIdentificator() {
		String prenumeNew = " ";
//		for (int i = 0; i < prenume.length(); i++) {
//			String test = " ";
//			String test2 = "-";
//			if (this.prenume.charAt(i) == test.charAt(0)) {
//				 prenumeNew = this.prenume.replace(" ", "");
//			}
//			if (this.prenume.charAt(i) == test2.charAt(0)) {
//				prenumeNew = this.prenume.replace("-", "");
//			}
//			else {
//				prenumeNew = this.prenume;
//			}
//		}
		
		
		if (this.prenume.contains(" ")) {
			prenumeNew = this.prenume.replace(" ", "");
			return prenumeNew.toLowerCase() + "_" + this.nume.toUpperCase();
		}
		if (this.prenume.contains("-")) {
			prenumeNew = this.prenume.replace("-", "");
			return prenumeNew.toLowerCase() + "_" + this.nume.toUpperCase();
		}
		else {
			prenumeNew = this.prenume;
		}
		
		
		return prenumeNew.toLowerCase() + "_" + this.nume.toUpperCase();
	}
	
}
