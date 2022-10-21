package monede;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
Scanner alegere = new Scanner (System.in);

		
		System.out.println("Schimbati RON sau alta moneda?\n1. RON in alta moneda\n2. Alta moneda in RON");

			int schimb = alegere.nextInt();
			
			switch (schimb) {
			case 1:
				metode.RON();
				break;
			case 2:
				metode.altaMoneda();
				break;
			default:
				System.out.println("Introduceti o optiune valida.");
			}
		
		alegere.close();
	}
}
