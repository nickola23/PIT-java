package osnovni;

public class Krug extends Tacka {
	double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Krug(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	double obim() {
		return Math.PI * r * 2;
	}
	double povrsina() {
		return Math.PI * r * r;
	}
	
}
