package osnovni;

public class Bicikla extends Vozilo{
	int brzina;
	public Bicikla(int brzina) {
		//super();
		this.brzina = brzina;
		System.out.println("Formiran je objekat klase Bicikla");
	}
	@Override
	public void ispis() {
		super.ispis();
		System.out.println("Formiran je objekat klase Bicikla");
	}
}
