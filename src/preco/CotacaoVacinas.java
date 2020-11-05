package preco;

import animal.AnimalProduto;

public class CotacaoVacinas extends CotacaoFamilia {
	private static final double multiplicadorVacinas = 2;
	
	public double getCotacao(AnimalProduto produto) {
		if(produto.getProporcaoVacina() < 90) {
			return super.getCotacao(produto); 
		}
		return super.getCotacao(produto) * multiplicadorVacinas;
	}
	
	public String toString() {
		return "Cotacao por familia e vacina";
	}

}
