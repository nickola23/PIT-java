package osnovni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesi tekst: ");
		//Upis
		try {
			String text = ulaz.nextLine();
			PrintWriter pw = new PrintWriter("proba.txt");
			pw.println("Uneli ste text: ");
			pw.println(text);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.print("Dadoteka nije pronadjena: ");
		}
		//Citanje
		System.out.println("U datoteku je upisano: ");
		try {
			FileInputStream fis = new FileInputStream("proba.txt");
			Scanner s = new Scanner(fis);
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.print("Dadoteka nije pronadjena: ");
		}

	}

}
