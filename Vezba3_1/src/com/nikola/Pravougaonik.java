package com.nikola;

public class Pravougaonik {
	private double duzina, sirina = 0;

	public Pravougaonik() {
		super();
	}

	public Pravougaonik(double duzina, double sirina) {
		super();
		this.duzina = duzina;
		this.sirina = sirina;
	}

	public double getDuzina() {
		return duzina;
	}

	public void setDuzina(double duzina) {
		this.duzina = duzina;
	}

	public double getSirina() {
		return sirina;
	}

	public void setSirina(double sirina) {
		this.sirina = sirina;
	}
	
	public void prikazi(){
		System.out.println("sirina: " + sirina + ", duzina: " + duzina);
	}
	
	public double povrsina() {
		return sirina * duzina;
	}
	public double obim() {
		return 2 * (sirina + duzina);
	}
	public void povecaj(double x) {
		setSirina(sirina + Math.sqrt(x));
		setDuzina(duzina + Math.sqrt(x));
	}
	public void smanji(double x) {
		setSirina(sirina - Math.sqrt(x));
		setDuzina(duzina - Math.sqrt(x));
	}
}
