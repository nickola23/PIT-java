package osnovni;

public class Ucenik {
	private Osoba lik;
	private String razred;
	public Ucenik() {
		super();
	}
	public Ucenik(Osoba lik, String razred) {
		super();
		this.lik = lik;
		this.razred = razred;
	}
	public Osoba getLik() {
		return lik;
	}
	public void setLik(Osoba lik) {
		this.lik = lik;
	}
	public String getRazred() {
		return razred;
	}
	public void setRazred(String razred) {
		this.razred = razred;
	}
	public void ispis() {
		lik.ispis();
		System.out.print(" " + razred);
	}
}
