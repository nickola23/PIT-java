package osnovni;

import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesi poluprecnik kruga: ");
		double r = ulaz.nextDouble();
		System.out.printf("Povrsina kruga poluprecnika %f je %f\n", r, povrs(r));
		System.out.print("Unesi stranicu a: ");
		double a = ulaz.nextDouble();
		System.out.print("Unesi stranicu b: ");
		double b = ulaz.nextDouble();
		System.out.printf("Povrsina pravougaonika je %f\n", povrs(a, b));
		ulaz.close();
	}
	public static double povrs(double r) {
		return r * r * Math.PI;
	}
	public static double povrs(double a, double b) {
		return a * b;
	}
}
