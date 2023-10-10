package osnovni;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);
		double x, y, r;
		System.out.print("Unesi x koordinate centra: ");
		x = ulaz.nextDouble();
		System.out.print("Unesi y koordinate centra: ");
		y = ulaz.nextDouble();
		System.out.print("Unesi poluprecnik: ");
		r = ulaz.nextDouble();
		Krug k = new Krug(x, y, r);
		System.out.print("Povrsina je %.2f a obim je %.2f ", k.povrsina(), k.obim());
		
	}

}
