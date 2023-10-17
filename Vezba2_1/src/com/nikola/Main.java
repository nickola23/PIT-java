package com.nikola;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		Autobus a = new Autobus();
		Osoba o = new Osoba();
		System.out.print("Unesi relaciju: ");
		String relacija = ulaz.next();
		a.setRelacija(relacija);
		System.out.print("Unesi broj slobodnih sedista: ");
		int n = ulaz.nextInt();
		a.setBrojSedista(n);
		System.out.println("1. KUPI KARTU");
		System.out.println("2. KRAJ KUPOVINE");
		System.out.print("Unesi broj:");
		String izbor = ulaz.next();
		if(izbor.contentEquals("1")) {
			if(a.getBrojProdatihKarata() < a.getBrojSedista()) {
				System.out.print("Unesi ime novog putnika: ");
				String ime = ulaz.next();
				o.setIme(ime);
				System.out.println("Unesi prezime novog putnika: ");
				String prezime = ulaz.next();
				o.setPrezime(prezime);
				a.prodajKartu(o);
			}
			else {
				System.out.println("Nema vise mesta");
				a.putnaLista();
			}
		}
		else {
			System.out.println("Kraj kupovine.");
			a.putnaLista();
		}
		
	}

}
