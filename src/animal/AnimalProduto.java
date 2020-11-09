package animal;

import preco.CalculaPreco;

public interface AnimalProduto {
	public double getPeso();
	
	public double getProporcaoVacina();
	
	public double getValor();
	
	public double getPreco(CalculaPreco calculadora);
}
