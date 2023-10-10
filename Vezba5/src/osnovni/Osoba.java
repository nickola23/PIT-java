package osnovni;

public class Osoba {
	private String ime = "Pocetno";
	private int godine;
	private static int br= 0;
	public Osoba() {
		godine = 20;
		br++;
	}
	public Osoba (String ime, int godine) {
		this.ime = ime;
		this.godine = godine;
		br++;
	}
	public Osoba(final Osoba o) {
		this(o.ime, o.godine);
	}
	public void ispis() {
		System.out.println(ime);
		System.out.println(godine);
		System.out.println(br);
	}
}
