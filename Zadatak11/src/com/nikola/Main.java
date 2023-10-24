package com.nikola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi naziv pravougaonika: ");
		String ime = ulaz.next();
		System.out.println("Unesi sirinu pravougaonika: ");
		double sirina = ulaz.nextDouble();
		System.out.println("Unesi duzinu pravougaonika: ");
		double duzina = ulaz.nextDouble();
		Pravougaonik p = new Pravougaonik(sirina, duzina);
	}

}
