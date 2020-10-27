package preço;

import animal.Animal;

public class CalculaPreço {
	
	private Animal animal;
	private Cotação cotacao;
	
	public double getPreco() {
		return animal.getPeso() * cotacao.getCotacao();
	}
	

}