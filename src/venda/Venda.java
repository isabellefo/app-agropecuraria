package venda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import animal.ColecaoAnimal;
import preco.CalculaPreco;

public class Venda {
	private static DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
	private CalculaPreco calculadora;
	private Date data;
	private ColecaoAnimal produto;
	
	protected void setCalculadora(CalculaPreco calculadora) {
		this.calculadora = calculadora;
	}

	protected void setData(Date data) {
		this.data = data;
	}

	protected void setProduto(ColecaoAnimal produto) {
		this.produto = produto;
	}

	public double cacularValorTotal() {
		return calculadora.getPreco(produto);
	}
	
	public String toString() {
		return calculadora.toString(produto) + dt.format(data);
	}
}
