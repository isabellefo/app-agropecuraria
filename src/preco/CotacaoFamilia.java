package preco;

import animal.AnimalProduto;

public class CotacaoFamilia extends Cotacao{
	
	public CotacaoFamilia() {
		super();
	}

	public double getCotacao(AnimalProduto animal) {
		return animal.getValor();
	}
	
	public String toString() {
		return "Cotacao por familia";
	}

}