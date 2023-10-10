package com.nikola.Vezba3_3;

import java.util.Scanner;

public class Main {

	static Scanner ulaz;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Krug k = new Krug();
		ulaz = new Scanner(System.in);
		try {
			System.out.print("Unesi poluprecnik kruga: ");
			k.setR(ulaz.nextDouble());
			System.out.println("Obim je" + k.obim());
			System.out.println("Povrsina je" + k.povrsina());
			System.out.print("Izmenite r: ");
			k.izmeni(ulaz.nextDouble());
			System.out.println("Obim je" + k.obim());
			System.out.println("Povrsina je" + k.povrsina());
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
