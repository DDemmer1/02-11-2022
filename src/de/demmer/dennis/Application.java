package de.demmer.dennis;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		int i = isPositive(0);
		System.out.println("Ergebnis ist: " + i);
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			userInput(sc.nextLine());
		}
		
		
		
	}
	
	
	static int isPositive(int zahl) {
		if(zahl > 0) {
			return 1;
		} else if (zahl < 0) {
			return -1;
		} else {
			return 0;
		}
	}
	

	static void userInput(String input) {
		
		// "switch" + STRG + LEER -> "switch-case statement" wählen
		
		switch(input) {
		
		case "exit":
			System.out.println("Das Programm wird beendet");
			System.exit(0);
			break;
		case "pause":
			System.out.println("Das Programm wird pausiert");
			break;
		case "start":
			System.out.println("Das Programm wird gestartet");
			break;
		case "hilfe":
			System.out.println("exit - beendet das Programm");
			System.out.println("start - startet das Programm");
			System.out.println("pause - pausiert das Programm");
			break;
		default:
			System.out.println("Eingabe ungültig. Tippe 'hilfe' ein um alle Befehle aufgelistet zu bekommen");
			break;
		}
		
	}
	
	
	
	
	
	

}
