package osnovni;

public class Pravougaonik {
	private double a, b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Pravougaonik() {
		super();
	}

	public Pravougaonik(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public String ispis() {
		return "Pravougaonik [a = " + a + ", b = " + b + "]";
	}
	
	public double povrsina() {
		return a * b;
	}
	
	public double obim() {
		return 2 * (a + b);
	}

}
