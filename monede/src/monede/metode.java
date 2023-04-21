package monede;

import java.util.Scanner;

public class metode {
	public static void altaMoneda () {
		Scanner in = new Scanner (System.in);
		Scanner tip = new Scanner(System.in);
		
		double EUR, USD, GBP, MDL, CAD;
		salutare, tre sa stergi asta!
		EUR = 4.93;
		USD = 5.08;
		GBP = 5.67;
		MDL = 0.26;
		CAD = 3.66;
		
		System.out.println("Ce tip de moneda doriti sa schimbati?\n1. EUR\n2. USD\n3. GBP\n4. MDL\n5. CAD");
		int moneda = in.nextInt();
		
		System.out.println("Ce suma doriti sa schimbati?");
		double suma = in.nextDouble();
		
		in.close();
		tip.close();
		
		switch (moneda) {
		case 1:
		double EURtoRON = suma * EUR;
		System.out.println(suma + " EUR = " + String.format("%.2f", EURtoRON) + " RON");
		break;
		
		case 2:
		double USDtoRON = suma * USD;
		System.out.println(suma + " USD = " + String.format("%.2f", USDtoRON) + " RON");
		break;
		
		case 3:
		double GBPtoRON = suma * GBP;
		System.out.println(suma + " GBP = " + String.format("%.2f", GBPtoRON) + " RON");
		break;
		
		case 4:
			double MDLtoRON = suma * MDL;
			System.out.println(suma + " MDL = " + String.format("%.2f", MDLtoRON) + " RON");
			break;
			
		case 5:
			double CADtoRON = suma * CAD;
			System.out.println(suma + " CAD = " + String.format("%.2f", CADtoRON) + " RON");
			break;
		}
	}
	
	public static void RON() {
		Scanner tip = new Scanner(System.in);
		Scanner tip2 = new Scanner(System.in);
		
		double EUR = 4.93;
		double USD = 5.08;
		double GBP = 5.67;
		double MDL = 0.26;
		double CAD = 3.66;
		
		System.out.println("In ce moneda doriti sa schimbati?\n1. EUR\n2. USD\n3. GBP\n4. MDL\n5. CAD ");
		int moneda = tip.nextInt();
		
		System.out.println("Ce suma doriti sa schimbati?");
		double suma = tip2.nextDouble();
		
		switch (moneda) {
		case 1:
			double RONtoEUR = suma / EUR;
			System.out.println(suma + " RON = " + String.format("%.2f", RONtoEUR) + " EUR");
			break;
		case 2:
			double RONtoUSD = suma / USD;
			System.out.println(suma + " RON = " + String.format("%.2f", RONtoUSD) + " USD");
			break;
		case 3:
			double RONtoGBP = suma / GBP;
			System.out.println(suma + " RON = " + String.format("%.2f", RONtoGBP) + " GBP");
			break;
		case 4:
			double RONtoMDL = suma / MDL;
			System.out.println(suma + " RON = " + String.format("%.2f", RONtoMDL) + " MDL");
			break;
		case 5:
			double RONtoCAD = suma / CAD;
			System.out.println(suma + " RON = " + String.format("%.2f", RONtoCAD) + " CAD");
			break;
		}
		
		
		tip.close();
		tip2.close();
	}
}
