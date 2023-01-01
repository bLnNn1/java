import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduceti CNP-ul.");
		
		String cnp = in.nextLine();
		in.close();
		
		String gender = "";
		String born = "";
		String year = "";
		
		System.out.println("CNP-ul introdus de dvs. este: " + cnp);
		
		if (Character.toString(cnp.charAt(0)).equals("1") || Character.toString(cnp.charAt(0)).equals("3") || Character.toString(cnp.charAt(0)).equals("5") || Character.toString(cnp.charAt(0)).equals("7") ) {
			gender = "masculin";
		}
		else if (Character.toString(cnp.charAt(0)).equals("2") || Character.toString(cnp.charAt(0)).equals("4") || Character.toString(cnp.charAt(0)).equals("6") || Character.toString(cnp.charAt(0)).equals("8")) {
			gender = "feminin";
		}
		
		
		if (Character.toString(cnp.charAt(0)).equals("5") || Character.toString(cnp.charAt(0)).equals("6")) {
			year = 20 + Character.toString(cnp.charAt(1)) + Character.toString(cnp.charAt(2));
		}
		else if (Character.toString(cnp.charAt(0)).equals("1") || Character.toString(cnp.charAt(0)).equals("2") || Character.toString(cnp.charAt(0)).equals("7") || Character.toString(cnp.charAt(0)).equals("8")) {
			year = 19 + Character.toString(cnp.charAt(1)) + Character.toString(cnp.charAt(2)); 
		}
		else if (Character.toString(cnp.charAt(0)).equals("3") || Character.toString(cnp.charAt(0)).equals("4")) {
			year = 18 + Character.toString(cnp.charAt(1)) + Character.toString(cnp.charAt(2));
		}
		
		born = Character.toString(cnp.charAt(5)) + Character.toString(cnp.charAt(6)) + "." + Character.toString(cnp.charAt(3)) + Character.toString(cnp.charAt(4)) + "." + year;
 
		int finalYear = Integer.parseInt(year);
		
		int age = 2022 - finalYear;
		
		HashMap<String, String> city = new HashMap<>();
		city.put("01", "Alba");	city.put("02", "Arad");city.put("03", "Arges");city.put("04", "Bacau");city.put("05", "Bihor");city.put("06", "Bistrita-Nasaud");city.put("07", "Botosani");
		city.put("08", "Brasov");city.put("09", "Braila");city.put("10", "Buzau");city.put("11", "Caras-Severin");city.put("12", "Cluj");city.put("13", "Constanta");
		city.put("14", "Covasna");city.put("15", "Dambovita");city.put("16", "Dolj");city.put("17", "Galati");city.put("18", "Gorj");city.put("19", "Harghita");
		city.put("20", "Hunedoara");city.put("21", "Ialomita");city.put("22", "Iasi");city.put("23", "Ilfov");city.put("24", "Maramues");city.put("25", "Mehedinti");city.put("26", "Mures");
		city.put("27", "Neamt");city.put("28", "Olt");city.put("29", "Prahova");city.put("30", "Satu Mare");city.put("31", "Salaj");city.put("32", "Sibiu");
		city.put("33", "Suceava");city.put("34", "Teleorman");city.put("35", "Timis");city.put("36", "Tulcea");city.put("37", "Vaslui");city.put("38", "Valcea");
		city.put("39", "Vrancea");city.put("40", "Bucuresti");city.put("41", "Bucuresti - Sector 1");city.put("42", "Bucuresti - Sector 2");city.put("43", "Bucuresti - Sector 3");
		city.put("44", "Bucuresti - Sector 4");city.put("45", "Bucuresti - Sector 5");city.put("46", "Bucuresti - Sector 6");city.put("51", "Calarasi");city.put("52", "Giurgiu");
		city.put("47", "Bucuresti - Sector 7");city.put("48", "Bucuresti - Sector 8");
		
		String bornCity = Character.toString(cnp.charAt(7)) + Character.toString(cnp.charAt(8));
		
		if (finalYear > 2022) {
			System.out.println("Introduceti un CNP corect.");
		}
		else {
		System.out.println("Gen: " + gender + "\nData nasterii: " + born + "\nVarsta: " + age + "\nLocul nasterii: " + city.get(bornCity));
		}
		
	}
}
