package com.nikola.Vezba1_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner ulaz;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ulaz = new Scanner(System.in);
		System.out.println("Unesi n elemenata jednodimenzionalnog niza: ");
		int n = ulaz.nextInt();
		int[] niz = new int[n];
		unos(niz);
		ispis(niz);
		max(niz);
		min(niz);
		srvr(niz);
		ulaz.close();
	}
	public static void unos(int[] niz) {
		ulaz = new Scanner(System.in);
		System.out.println("Unesi elemente niza: ");
		for(int i = 0; i < niz.length; i++) {
			System.out.print("a[" + i + "] = ");
			niz[i] = ulaz.nextInt();
		}
	}
	public static void ispis(int[] niz) {
		System.out.println("Sortirane vrednosti elemenata niza su: ");
		Arrays.sort(niz);
		for(int i = 0; i < niz.length; i++) {
			System.out.println("a[" + i + "] = " + niz[i]);
		}
	}
	public static void max(int[] niz) {
		int max = niz[0];
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] > max) max = niz[i];
		}
		System.out.println("Maksimalna vrednost unetih elemenata je " + max);
	}
	public static void min(int[] niz) {
		int min = niz[0];
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] < min) min = niz[i];
		}
		System.out.println("Minimalna vrednost unetih elemenata je " + min);
	}
	public static void srvr(int[] niz) {
		double sum = 0;
		for(int i = 0; i < niz.length; i++) {
			sum += niz[i];
		}
		System.out.println("Srednja vrednost unetih elemenata je " + sum / (double)niz.length);
	}
}
