package pre�o;

import animal.Animal;

public class CalculaPre�o {
	
	private Animal animal;
	private Cota��o cotacao;
	
	public double getPreco() {
		return animal.getPeso() * cotacao.getCotacao();
	}
	

}