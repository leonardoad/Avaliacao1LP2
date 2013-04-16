package questao3;

public class ProdutoEspecial extends Produto {

	public ProdutoEspecial(String descricao, double valorBase) {
		super(descricao,valorBase);

		calcula();
	}

	public void calcula() {

		valorTaxas = valorBase  * 0.08;

		if(valorTaxas < 143.00){
			valorTaxas = 143.00;
		}

		valorFinal = valorBase + valorTaxas;
		System.out.println("valorTaxas:" +valorTaxas);
		System.out.println("valorFinal:" +valorFinal);
		if(valorFinal>4000){
			valorFinal= valorFinal  * 1.03;
			valorTaxas = valorFinal - valorBase;

		}
		System.out.println("valorTaxas:" +valorTaxas);
		System.out.println("valorFinal:" +valorFinal);
	}

}
