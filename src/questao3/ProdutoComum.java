package questao3;

public class ProdutoComum extends Produto {

	public ProdutoComum(String descricao, double valorBase) {
		super(descricao,valorBase);
		calcula();
	}

	public void calcula() {

		valorTaxas = valorBase  * 0.11;

		valorFinal = valorBase + valorTaxas;

		if(valorFinal>4000){
			valorFinal= valorFinal  * 1.03;
			valorTaxas = valorFinal - valorBase;

		}
	}

}
