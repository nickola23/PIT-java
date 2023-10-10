package osnovni;

public class Trougao {
	private Tacka A, B, C;

	public Tacka getA() {
		return A;
	}

	public void setA(Tacka a) {
		A = a;
	}

	public Tacka getB() {
		return B;
	}

	public Trougao(Tacka a, Tacka b, Tacka c) {
		super();
		A = a;
		B = b;
		C = c;
	}

	public void setB(Tacka b) {
		B = b;
	}

	public Tacka getC() {
		return C;
	}

	public void setC(Tacka c) {
		C = c;
	}
	public double povrsina() {
		double x, y, z;
		x = A.rastojanje(B);
		y = A.rastojanje(C);
		z = B.rastojanje(C);
		double s = (x + y + z) / 2;
		return Math.sqrt(s * (s - x) * (s - y) * (s - z));
	}
	public double obim() {
		double x, y, z;
		x = A.rastojanje(B);
		y = A.rastojanje(C);
		z = B.rastojanje(C);
		return x + y + z;
	}
	public boolean provera() {
		double x, y, z;
		x = A.rastojanje(B);
		y = A.rastojanje(C);
		z = B.rastojanje(C);
		return ((x + y) > z && (x + z) > y && ( y + z) > x);
	}
}
