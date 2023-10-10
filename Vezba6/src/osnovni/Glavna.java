package osnovni;

import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);
		int x, y;
		System.out.print("Unesi x koordinatu tacke A: ");
		x = ulaz.nextInt();
		System.out.print("Unesi y koordinatu tacke A: ");
		y = ulaz.nextInt();
		Tacka A = new Tacka(x, y);
		System.out.print("Unesi x koordinatu tacke B: ");
		x = ulaz.nextInt();
		System.out.print("Unesi y koordinatu tacke B: ");
		y = ulaz.nextInt();
		Tacka B = new Tacka(x, y);
		System.out.print("Unesi x koordinatu tacke C: ");
		x = ulaz.nextInt();
		System.out.print("Unesi y koordinatu tacke C: ");
		y = ulaz.nextInt();
		Tacka C = new Tacka(x, y);
		//System.out.print("Rastojanje je" + A.rastojanje(B));
		Trougao T = new Trougao(A, B, C);
		if(T.provera()) {
			System.out.printf("Povrsina trougla je %.2f", T.povrsina());
			System.out.printf("Obim trougla je %.2f", T.obim());
		}
		else {
			System.out.print("Nemoguce je konstruisati trougao");
		}
	}

}
