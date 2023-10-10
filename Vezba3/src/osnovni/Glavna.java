package osnovni;

import java.util.Random;

public class Glavna {
	public static void main(String[] args) {
		int [] kocka = new int[6];
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			kocka[i] = r.nextInt(6) + 1;
		}
		System.out.println("Bacili ste ");
		for(int i = 0; i < 6; i++) {
			System.out.println(kocka[i]);
		}
	}
	}
