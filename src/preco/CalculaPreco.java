package preco;

import animal.Animal;
import animal.AnimalProduto;
import animal.ColecaoAnimal;

public class CalculaPreco {
	
	private Cotacao cotacao;
	
	public double getPreco(AnimalProduto produto) {
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
				buffer.append(getPreco(a) + System.lineSeparator());
			}
			buffer.append("Valor total da venda: " + getPreco(produto) + System.lineSeparator());
			return buffer.toString();
		}
		buffer.append(produto + " ");
		buffer.append(getPreco(produto));
		return buffer.toString();
	}
}