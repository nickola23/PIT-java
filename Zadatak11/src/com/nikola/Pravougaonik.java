package com.nikola;

public class Pravougaonik extends DvaDFigura {

	private double sirina, duzina;
	public Pravougaonik(double sirina, double duzina) {
		super();
		this.sirina = sirina;
		this.duzina = duzina;
	}
	@Override
	public String getIme() {
		return ime;
	};
	
	@Override
	public void setIme(String ime) {
		this.ime = ime;
	};
	
	@Override
	public double povrsina() {
		return sirina * duzina;
	}

}
