package questao4;

public class PontoTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Ponto p1 = new Ponto(0,0);
		Ponto p2 = new Ponto(3,0);
		Ponto p3 = new Ponto(0,3);
		Triangulo t = new Triangulo(p1,p2,p3);

		System.out.println("Distancia p1->p2: "+t.getP1().getDistancia(p2));
		System.out.println("Distancia p1->p3: "+t.getP1().getDistancia(p3));
		System.out.println("Distancia p2->p3: "+t.getP2().getDistancia(p3));
		System.out.println("É Triangulo Retangulo? "+t.ehRetangulo());

	}

}
