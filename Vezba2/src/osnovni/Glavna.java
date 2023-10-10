package osnovni;

import java.util.Scanner;

public class Glavna {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesi broj elemenata niza: ");
		int n = ulaz.nextInt();
		int [] niz = new int[n];
		int s = 0;
		double sr;
		System.out.println("Unesi elemente niza: ");
		for(int i = 0; i < n; i++) {
			System.out.printf("niz[%d] = ", i);
			niz[i] = ulaz.nextInt();
			s += niz[i];
		}
		sr = (double)s/n;
		System.out.printf("Zbir elemenata je %d, a srednja vrednost je %f ", s, sr);
		ulaz.close();
	}
}
