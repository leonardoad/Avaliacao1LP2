package questao3;

public class Produto {

	protected String descricao;
	protected double valorBase;
	protected double valorFinal;
	protected double valorTaxas;

	public Produto(String descricao, double valorBase) {
		this.descricao = descricao;
		this.valorBase = valorBase;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorBase() {
		return valorBase;
	}
	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}
	public double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public double getValorTaxas() {
		return valorTaxas;
	}
	public void setValorTaxas(double valorTaxas) {
		this.valorTaxas = valorTaxas;
	}


}
