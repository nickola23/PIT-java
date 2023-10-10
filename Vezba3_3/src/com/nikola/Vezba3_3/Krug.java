package com.nikola.Vezba3_3;

public class Krug {
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) throws Exception {
		if(this.r > 0) this.r = r;
		else throw new Exception("Poluprecnik mora biti veci od 0");
	}

	public Krug(double r) throws Exception {
		super();
		setR(r);
	}

	public Krug() {
		super();
	}
	
	public double obim() {
		return 2 * r * Math.PI;
	}
	
	public double povrsina() {
		return r * r * Math.PI;
	}
	public void izmeni(double x) throws Exception {
		setR(x);
	}
}
