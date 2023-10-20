package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import basic.Persoana;

public class Main {

	public static void main(String[] args) {
		//Vom construi array-uri separate pentru proprietatile necesare realizarii a 5 Persoane
		//TODO 1: Definiti un array de Stringuri numit "prenume"
		String[] prenume;
		//TODO 2: Alocati memorie pentru 5 stringuri
		prenume = new String[5];
		//TODO 3: Initializati valorile cu 5 prenume la alegere
		prenume[0] = "Laura";
		prenume[1] = "Ion";
		prenume[2] = "Marius";
		prenume[3] = "Ioana";
		prenume[4] = "Andrei";
		//TODO 4: Definiti un array de Stringuri numit "nume" si alocati memorie pentru 5 stringuri
		String[] nume = new String[5];
		//TODO 5: Initializati valorile cu 5 nume de familie la alegere
		nume[0] = "Ionescu";
		nume[1] = "Popescu";
		nume[2] = "Marin";
		nume[3] = "Savu";
		nume[4] = "Lazar";
		
		//TODO 6: Definiti un array de valori intregi numit "varste" si initializati valorile cu 5 varste corespondente numelor
		Integer[] varste = new Integer[] {40, 30, 25, 31, 19};

		//TODO 6: Definiti un array de Stringuri numit "orase" si initializati valorile cu 5 nume de orase (nu neaparat unice)
		String[] orase = new String[] {"Bucuresti", "Brasov", "Bucuresti", "Cluj", "Oradea"};
		
		//TODO 6: Definiti un array de valori boolean numit "stareCivila" si initializati valorile cu valoarea de adevar corespunzatoare numelor
		boolean[] stareCivila = new boolean[] {false, true, true, false, false};
		
		//TODO 7: Atribuiti proprietatii statice "curs" a clasei "Persoana" valoare "JAVA"
		Persoana.curs = "JAVA";
		
		//TODO 8: Definiti un ArrayList cu tipul "Persoana" numit "persoane"
		ArrayList<Persoana> persoane;
		
		//TODO 9: Instantiati variabila persoane si alocati dimensiunea 5
		persoane = new ArrayList<Persoana>(5);
		
		//TODO 10: Folositi un for pentru a parcurge array-urile
		//si a crea folosind valorile de pe fiecare pozitie o noua instanta de tip persoana
		//care sa fie apoi adaugata in ArrayList-ul "persoane"
		//Rezultatul final ar trebui sa fie un ArrayList cu 5 instante de tip Persoana
		//prima avand nume, prenume, oras, varsta, stareCivila ce corespunde cu pozitia 0, al doilea cu pozitia 1 samd
		
		for (int i = 0; i < 5; i++) {
			Persoana p = new Persoana(nume[i], prenume[i], orase[i], varste[i], stareCivila[i]);
			persoane.add(p);
		}
		//TODO 11: Folositi un simplu System.out.println pentru a vedea cum arata afisarea ArrayListului persoane
		System.out.println(persoane);
		
		//TODO 12: Folositi un for-each pentru a parcurge si a afisa persoanele din lista persoane pe cate un rand
		for (Persoana p: persoane) {
			System.out.println(p);
		}
		
		//Vom realiza o structura de date ce contine notele elevilor bazata pe o cheie reprezentata de identificatorul persoanei 
		//TODO 13: Definiti si initializati un HashMap numit "catalog" cu tipurile <String, Integer>
		Map<String, Integer> catalog = new HashMap<String, Integer>();
		
		//TODO 14: Pentru fiecare persoana din lista introduceti in HashMap valoarea returnata de
		//metoda obtineIdentificator() drept cheie si o nota intre 1 si 10 drept valoare (minim o nota sub 5)
		//Hint: obtineti persoana din lista folosind pozitia acesteia, nu parcurgeti lista intr-o bucla
		catalog.put(persoane.get(0).obtineIdentificator(), 2);
		catalog.put(persoane.get(1).obtineIdentificator(), 7);
		catalog.put(persoane.get(2).obtineIdentificator(), 9);
		catalog.put(persoane.get(3).obtineIdentificator(), 4);
		catalog.put(persoane.get(4).obtineIdentificator(), 3);
		
		//TODO 15: Folositi un simplu System.out.println pentru a afisa HashMapul catalog
		System.out.println(catalog);
		
		//TODO 16: Iterati peste HashMapul catalog si afisati pe cate un rand fiecare key-value
		//cu formatarea "Studentul ID are nota NOTA" - ex: "Studentul ion_POPESCU are nota 7"
		for(String id : catalog.keySet()) {
			System.out.println("Studentul " + id + " are nota " + catalog.get(id));
		}
		
		//TODO 17: Afisati dimensiunea listei de persoane si a catalogului
		System.out.println(persoane.size());
		System.out.println(catalog.size());
		//TODO 18: Iterati peste lista de persoane si eliminati studentii cu nota mai mica decat 5
		//Pentru aceasta se va verifica valoarea notei pentru fiecare persoana din "catalog"
		//Daca se elimina o persoana din lista se va elimina si intrarea legata de aceasta din catalog
		//HINT: ordinea stergerilor conteaza
		for (int i = 0; i < persoane.size(); i++) {
			if (catalog.get(persoane.get(i).obtineIdentificator()) < 5) {
				catalog.remove(persoane.get(i).obtineIdentificator());
				persoane.remove(i);
				i--;
			}
		}
		
		//TODO 19: Afisati iar dimensiunea listei de persoane si a catalogului pentru a vedea rezultatele
		System.out.println(persoane.size());
		System.out.println(catalog.size());
		
		//TODO 20: Afisati lista de persoane si catalogul pentru a vedea ca au fost sterse valorile corecte
		System.out.println(persoane);
		System.out.println(catalog);
		
	}
}
