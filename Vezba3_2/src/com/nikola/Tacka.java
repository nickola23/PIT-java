package com.nikola;

public class Tacka {
	private double x, y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Tacka() {
		super();
	}

	public Tacka(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void prikazi() {
		System.out.println("Tacka ima koordinate: " + x + ", " + y);
	}
}
