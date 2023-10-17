package com.nikola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesi broj osoba:");
		int n = ulaz.nextInt();
		Osoba o[] = new Osoba[n];
		for(int i = 0; i < n; i++) {
			
			o[i] = new Osoba();
			System.out.print("Unesi ime:");
			String ime = ulaz.next();
			System.out.print("Unesi prezime:");
			String prezime = ulaz.next();
			System.out.print("Unesi jmbg:");
			String jmbg = ulaz.next();
			o[i].unosPodataka(ime, prezime, jmbg);
		}
		for(int i = 0; i < n; i++) {
			o[i].ispis();
		}
	}

}
