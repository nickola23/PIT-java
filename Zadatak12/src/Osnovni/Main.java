package Osnovni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Koliko elemenata unosis: ");
		int n = ulaz.nextInt();
		ArrayList<String> lista = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			System.out.print("Unesi element br." +(i + 1) + ": ");
			String a = ulaz.next();
			lista.add(a);
		}
		System.out.println("elementi liste: " + lista);
		System.out.print("Unesi element br." +(lista.size() + 1) + ": ");
		lista.add(ulaz.next());
		System.out.println("nova lista: " + lista);
		Collections.sort(lista);
		System.out.println("sortirana lista: " + lista);
		lista.add(2, "Dodato");
		System.out.println("nova lista: " + lista);
		lista.remove(1);
		System.out.println("nova lista: " + lista);
		lista.subList(1, 3).clear();
		System.out.println("nova lista: " + lista);
	}

}
