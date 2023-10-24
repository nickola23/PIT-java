package osnovni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pravougaonik> pravougaonici = new ArrayList<Pravougaonik>();
		try {
			FileInputStream fis = new FileInputStream("podaci.txt");
			Scanner s = new Scanner(fis);
			while(s.hasNext()) {
				double a = s.nextDouble();
				double b = s.nextDouble();
				Pravougaonik p = new Pravougaonik(a, b);
				pravougaonici.add(p);			}
			s.close();
			fis.close();
		} 	catch(FileNotFoundException e) {
			System.out.println("Datoteka nije pronadjena!");
		}	catch(IOException e) {
			System.out.println("Datoteka nije pronadjena!");
		}
		for (Pravougaonik k: pravougaonici) {
			System.out.println(k.ispis());
			System.out.println("Povrsina je " + k.povrsina() + ", a obim je " + k.obim());
		}
		try {
			PrintWriter pw = new PrintWriter("resenja.txt");
			for (Pravougaonik k: pravougaonici) {
				pw.println(k.ispis());
				pw.println("Povrsina je " + k.povrsina() + ", a obim je " + k.obim());
			}
			pw.flush();
			pw.close();
		} catch(FileNotFoundException e) {
			System.out.println("Datoteka nije pronadjena!");
		}
	}

}
