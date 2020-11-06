package preco;

import animal.AnimalProduto;

public abstract class Cotacao {
	
	public static Cotacao[] getCotacoes() {
		return  new Cotacao[] {
				new CotacaoFamilia(),
				new CotacaoVacinas(),
		};
	}
	
	abstract public double getCotacao(AnimalProduto animal);

}