package questao4;

public class Ponto {
	private double x, y;

	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getDistancia(Ponto p) {
		return Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
	}

	@Override
	public String toString() {
		return String.format("[%d, %d]",x,y);
	}

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


}
