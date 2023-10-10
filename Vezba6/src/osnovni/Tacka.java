package osnovni;

public class Tacka {
	private int x, y;

	public Tacka(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public String ispis() {
		return "("+x+","+y+")";
	}
	public double rastojanje(Tacka T) {
		return Math.sqrt(((double)this.x-(double)T.x) * ((double)this.x-(double)T.x) + ((double)this.x-(double)T.x) * ((double)this.x-(double)T.x));
	}
}
