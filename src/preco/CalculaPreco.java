package preco;

import animal.Animal;
import animal.AnimalProduto;
import animal.ColecaoAnimal;

public class CalculaPreco {
	
	private Cotacao cotacao;
	
	public double getPreco(Animal produto) {
		return produto.getPeso() * cotacao.getCotacao(produto);
	}
	
	public void  setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}
	
	public String toString(AnimalProduto produto) {
		StringBuffer buffer = new StringBuffer();
		if(produto instanceof ColecaoAnimal) {
			for(Animal a : ((ColecaoAnimal) produto).getAnimalCollection() ) {
				buffer.append(a + " ");
				buffer.append(a.getPreco(this) + "R$" + System.lineSeparator());
			}
		}
		buffer.append("TOTAL: ");
		buffer.append(produto.getPreco(this));
		return buffer.toString();
	}
}