package osnovni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite dva broja: ");
		try {
			int a, b;
			a = Integer.parseInt(ulaz.readLine());
			b = Integer.parseInt(ulaz.readLine());
			if( b < 0) {
				Exception greska = new Exception("Imenilac mora biti veci od 0");
				throw greska;
			}
			else {
			int x = a - b;
			System.out.println("Rezultat celobrojnog deljenja je " + x);
			int y = a + b;
			System.out.println("Zbir je " + y);
			}
		}
		catch(ArithmeticException e){
			System.out.println("Deljenje nulom");
		}
		catch(NumberFormatException e){
			System.out.println("Niste uneli brojcane vrednosti");
		}
		catch(IOException e){
			System.out.println("Nema pojma sta se desilo");
		}
		catch(Exception greska) {
			System.out.println(greska.getMessage());
		}
		finally {
			System.out.println("Bilo li je greske?");
		}

	}

}
