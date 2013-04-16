package questao4;

public class Triangulo {

	private Ponto p1, p2, p3;

	public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;

	}

	public Ponto getP1() {
		return p1;
	}

	public Ponto getP2() {
		return p2;
	}

	public Ponto getP3() {
		return p3;
	}

	public String ehRetangulo() {

		// todo: descobrir forma de definir de é ou não retangulo

		double ladoA = p1.getDistancia(p2);
		double ladoB = p1.getDistancia(p3);
		double ladoC = p2.getDistancia(p3);

		double hipo = ladoA;
		double c1 = ladoB;
		double c2 = ladoC;

		if (ladoB > hipo) {
			hipo = ladoB;
			c1 = ladoA;
			c2 = ladoC;
		}
		if (ladoC > hipo) {
			hipo = ladoC;
			c1 = ladoA;
			c2 = ladoB;
		}

		if (Math.pow(hipo, 2) == (Math.pow(c1, 2) + Math.pow(c2, 2))) {
			return "Sim";
		}else
			return "Não";
	}

}
