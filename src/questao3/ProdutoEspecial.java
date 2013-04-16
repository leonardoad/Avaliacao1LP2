package questao3;

public class ProdutoEspecial extends Produto {

	public ProdutoEspecial(String descricao, double valorBase) {
		super(descricao,valorBase);

		calcula();
	}

	public void calcula() {

		valorTaxas = valorBase  * 0.8;

		valorFinal = valorBase + valorTaxas;

		if(valorFinal>4000){
			valorFinal= valorFinal  * 1.03;
			valorTaxas = valorFinal - valorBase;

		}
	}

}
