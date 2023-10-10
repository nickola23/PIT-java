package osnovni;

public class Glavna {
	public static void main(String[] args) {
		Osoba o = new Osoba();
		o.ispis();
		Osoba o1 = new Osoba("Luka", 17);
		o1.ispis();
		Osoba k = new Osoba(o);
		k.ispis();
	}
}
