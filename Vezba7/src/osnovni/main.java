package osnovni;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Osoba lik = new Osoba();
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesi ime: ");
		lik.setIme(ulaz.next());
		System.out.print("Unesi prezime: ");
		lik.setPrezime(ulaz.next());
		lik.ispis();
		System.out.print("Unesi razred: ");
		Ucenik djak = new Ucenik();
		djak.setRazred(ulaz.next());
		djak.setLik(lik);
		djak.ispis();
		ulaz.close();
	}

}
