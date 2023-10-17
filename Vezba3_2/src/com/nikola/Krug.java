package com.nikola;

public class Krug extends Tacka {
	protected double poluprecnik;

	public Krug() {
		super();
	}
	
	public Krug(double poluprecnik) {
		super();
		this.poluprecnik = poluprecnik;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}
	
	public double povrsina() {
		return Math.PI * Math.pow(poluprecnik, 2);
	}
	@Override
	public  void prikazi() {
		System.out.println("Poluprecnik je " + poluprecnik);
	}

}
