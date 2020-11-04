package preco;

import animal.Animal;

public class CalculaPreco {
	
	private Animal animal;
	private Cotacao cotacao;
	
	public double getPreco() {
		return animal.getPeso() * cotacao.getCotacao();
	}
	

}