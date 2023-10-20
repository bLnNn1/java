import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//ex1(in.nextInt(), in.nextInt(), in.nextInt());
		//System.out.println("Cel mai mare numar este: " + ex2(in.nextInt(), in.nextInt(), in.nextInt()));
		//ex3(in.nextInt(), in.nextInt());
		//ex4(in.nextInt());
		//ex5(in.next());
		//ex6(in.nextInt());
		//ex7(in.nextInt());
		//ex8(in.nextInt());
		//ex9(in.next(),in.nextInt());
		ex10(in.next());
	}

	

	private static boolean ex1(int a, int b,int c) {
		//Exeritiul 1: Scrieti un program Java care citeste de la tastatura 3 numere si verifica daca minim doua dintre ele sunt pozitive (Ex: 2, -4, -7 -> false; 2, 5, 8 -> true)
		/*
		int isPositiveA = a > 0 ? 1:0;
		int isPositiveB = b > 0 ? 1:0;
		int isPositiveC = c > 0 ? 1:0;
		
		if (isPositiveA + isPositiveB + isPositiveC >= 2) {
			System.out.println("Dintre " + a + ", " + b + " si " + c + " minim doua dintre ele sunt pozitive");
			return true;
		} else {
			System.out.println("Dintre " + a + ", " + b + " si " + c + " NU sunt minim doua sunt pozitive");
			return false;
		}
		*/
		//alternativa:
		if ( (a > 0 && b > 0) || (a > 0 && c > 0) || (b > 0 && c > 0) ) {
			System.out.println("Dintre " + a + ", " + b + " si " + c + " minim doua dintre ele sunt pozitive");
			return true;
		} else {
			System.out.println("Dintre " + a + ", " + b + " si " + c + " NU sunt minim doua sunt pozitive");
			return false;
		}		
	}
	
	private static int ex2(int a, int b, int c) {
		//Exeritiul 2: Scrieti un program Java ce determina numarul cel mai mare din trei numere citite de la tastatura fara a folosi if case (se vor folosi operatori ternari).
		return a > b ? (a > c ? a : c) : (b > c ? b : c);
		//Explicatia din spate:
		//Daca a este mai mare ca b atunci se verifica daca a este si mai mare ca c -> a este cel mai mare numar dintre cele trei
		//												daca in a doua verificare c este mai mare decat a -> c este cel mai mare numar pt ca c>a>b
		//Daca a nu este mai mare decat b in verificarea initiala trebuie vazut care dintre b si ce sunt mai mari
		//Daca doua valori sunt egale una dintre ele va fi returnata
	}
	
	private static void ex3(int a, int b) {
		//Exercitiul 3: Scrieti un program Java ce afiseaza valorile impare dintr-un interval citit de la tastatura (Ex: citit 2, 9 -> afiseaza: 3, 5, 7, 9)
		for(int i = a; i <= b; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean ex4(int nr) {
		//Exercitiul 4: Scrieti un program Java ce verifica daca un numar este prim sau nu. (Numar Prim = se imparte doar la 1 si la el insusi - ex: 2, 3, 5, 7, 11, 13, 17...)
		int d = 2;
		int count = 0;
		while(d <= nr/2) {
			if (nr%d == 0) {
				count++;
			}
			d++;
		}
		if (count > 0) {
			System.out.println(nr + " nu este prim");
			return false;
		} else {
			System.out.println(nr + " este prim");
			return true;
		}
		
	}
	
	private static boolean ex5(String s) {
		//Exercitiul 5: Scrieti un program Java ce verifica daca un String este palindrom sau nu. (Palindrom = string ce arata la fel citit de la dreapta la stranga, ca si de la stanga la dreapta - ex: ana, cojoc, reper, 123321...)
		for (int i = 0; i < s.length(); i ++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				System.out.println(s + " nu este palindrom");
				return false;
			}
		}
		System.out.println(s + " este palindrom");
		return true;
	}
	
	private static int ex6(int n) {
		//Exercitiul 6: Afisati primele N numere din sirul lui Fibonacci (Sirul lui Fibonacci - fiecare numar este egal cu suma numerelor de dinainte - incepand cu 0, 1 -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...)
		int n1 = 0;
		int n2 = 1;
		int poz = 2;
		int fib = 1;
		while (poz < n) {
			fib = n1 + n2;
			n1 = n2;
			n2 = fib;
			poz ++;
		}
		
		System.out.println(fib);
		return fib;	
	}
	
	private static boolean ex7(int n) {
		//Exercitiul 7: Scrieti un program ce verifica dacă un număr natural, introdus de la tastatură, este pefect (egal cu suma divizorilor mai mici ca el; ex: 6=1+2+3)
		int sum = 0;
		for(int d=1; d<n; d++) {
			if (n%d == 0) {
				sum += d;
			}
		}
		if (sum == n) {
			System.out.println(n + " este numar perfect");
			return true;
		} else {
			System.out.println(n + " NU este numar perfect");
			return false;
		}
	}
	
	private static int ex8(int x) {
		//Exercitiul 8: Sa se determine valoarea functiei de mai jos pentru x (intreg) citit de la tastatura:
		//f(x) = x+10, pentru x <= -5;
				//x * 2, pentru -5 < x <= 10;
				//x^2 + 50, pentru x >10
		if (x <= -5) {
			System.out.println(x+10);
			return x+10;
		} else if (x <= 10) {
			System.out.println(x*2);
			return x*2;
		} else {
			System.out.println(x*x + 50);
			return x*x + 50;
		}
		
	}
	
	private static double ex9(String valuta, int valoare) {
		//Exercitiul 9: Realizati un program ce simuleaza un calculator de schimb valutar. Alegeti 5 valute (EUR, USD, GBP, MDL, CAD), setati valoarea de schimb Valuta-RON pentru fiecare (hardcoded in variabile). De la tastatura se va introduce moneda dorita si suma in RON ce se doreste a fi schimbata si se afiseaza valoarea returnata in moneda respectiva (Ex: EUR-1000 -> afiseaza 204). Constrangere: Se va folosi switch case.
		double value = 0;
		switch(valuta) {
		case "EUR":
			value = valoare / 4.9;
			break;
		case "USD":
			value = valoare / 4.2;
			break;
		case "GDP":
			value = valoare / 5.3 ;
			break;
		case "MDL":
			value = valoare / 0.25;
			break;
		case "CAD":
			value = valoare / 3.1;
		}
		System.out.println(valoare + " lei in " + valuta + " inseamna: " + value);
		return value;
	}
	
	private static boolean ex10(String pass) {
		//Exercitiul 10: Se citeste de la tastatura un String. Sa se verifice daca acesta indeplineste constrangerile pentru a fi o parola sigura - lungimea de minim 8, litere lowercase si uppercase, minim o cifra, minim un caracter special (ex: pass - false, XKs4yGC[Sm - true)
		if (pass.length() < 8) {
			System.out.println("Parola nesigura");
			return false;
		}

		String specialChars = ",./!@#$%^&*()_+-=;'[]<>?:{}|\"\\ ";
		int nrUpperChar = 0;
		int nrLowerChar = 0;
		int nrDigitChar = 0;
		int nrSpecialChar = 0;
		for (char c:pass.toCharArray()) {
			if (Character.isLowerCase(c)) {
				nrLowerChar++;
			} else if (Character.isUpperCase(c)) {
				nrUpperChar++;
			} else if (Character.isDigit(c)) {
				nrDigitChar++;
			} else if (specialChars.contains(String.valueOf(c))) {
				nrSpecialChar++;
			}
		}
		
		if (nrUpperChar == 0 || nrLowerChar == 0 || nrDigitChar == 0 || nrSpecialChar == 0) {
			System.out.println("Parola nesigura");
			return false;
		}
		
		System.out.println("Parola sigura");
		return true;
		
		//Alternativa - regex
	}
}
