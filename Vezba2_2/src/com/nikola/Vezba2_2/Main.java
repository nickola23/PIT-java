package com.nikola.Vezba2_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner ulaz;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ulaz = new Scanner(System.in);
		System.out.print("Uneti dimenziju niza: ");
		int n = ulaz.nextInt();
		int[][] niz = new int[n][n];
		unos(niz);
		ispis(niz);
		transponuj(niz);
		ispis(niz);
		ulaz.close();
	}
	public static void unos(int[][] niz) {
		ulaz = new Scanner(System.in);
		System.out.println("Unesi elemente niza: ");
		for(int i = 0; i < niz.length; i++) 
			for(int j = 0; j < niz[0].length; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				niz[i][j] = ulaz.nextInt();
			}
	}
	public static void ispis(int[][] niz) {
		System.out.println("Originalna matrica je: ");
		for(int i = 0; i < niz.length; i++) {
			for(int j = 0; j < niz[0].length; j++) {
				System.out.print("\t" + niz[i][j]);
			}
			System.out.println();
		}
	}
	public static void transponuj(int[][] niz) {
		for(int i = 0; i < niz.length - 1; i++)
			for(int j = i + 1; j < niz[0].length; j++) {
				int temp = niz[i][j];
				niz[i][j] = niz[j][i];
				niz[j][i] = temp;
				
			}
	}
}
