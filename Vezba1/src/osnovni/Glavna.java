package osnovni;

import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello world");
		double r, P;
		
		Scanner ulaz = new Scanner(System.in);
		r = ulaz.nextDouble();
		try {
			if(r <=0) {
				Exception greska = new Exception("Poluprecnik mora biti veci od nule");
				throw greska;
			}
			else {
					P = Math.pow(r, 2) * Math.PI;
			System.out.printf("Povrsina kruga poluprecnika %.2f je %.2f3", r, P);
			}
		}
		catch(Exception greska)
		{
			System.out.print(greska.getMessage());
		}
		ulaz.close();
		}

}
