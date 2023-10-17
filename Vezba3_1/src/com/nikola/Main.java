package com.nikola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		try {
		System.out.print("Unesi duzinu pravougaonika: ");
		double x = ulaz.nextDouble();
		System.out.print("Unesi sirinu pravougaonika: ");
		double y = ulaz.nextDouble();
		Pravougaonik p = new Pravougaonik(x, y);
		System.out.println("Uneti pravougaonik: ");
		p.prikazi();
		System.out.println("Povrsina je " + p.povrsina() + ", a obim je " + p.obim());
		
		System.out.print("Unesi duzinu pravougaonika: ");
		double a = ulaz.nextDouble();
		System.out.print("Unesi sirinu pravougaonika: ");
		double b = ulaz.nextDouble();
		Pravougaonik p1 = new Pravougaonik(a, b);
		System.out.println("Uneti pravougaonik: ");
		p1.prikazi();
		System.out.println("Povrsina je " + p1.povrsina() + ", a obim je " + p1.obim());
		
		System.out.print("Unesi indikator promene( '+' = povecanje, '-' = smanjenje): ");
		String znak = ulaz.next();
		System.out.print("Unesi koliko puta treba promeniti povrsinu pravougaonika: ");
		double n = ulaz.nextDouble();
		if(znak.equals("+"))
			p1.povecaj(n);
		else if(znak.equals("-"))
			p1.smanji(n);
		else throw new Exception("Znak je neispravno unet");
		System.out.println("Uneti pravougaonik: ");
		p1.prikazi();
		System.out.println("Povrsina je " + p1.povrsina() + ", a obim je " + p1.obim());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
