package venda;

import java.util.Date;

import animal.Animal;
import animal.ColecaoAnimal;
import preco.CalculaPreco;
import preco.Cotacao;

public class VendaBuilder {
	private Venda venda;
	private final ColecaoVenda vendidos;
	
	public VendaBuilder() {
		this.vendidos = ColecaoVenda.obterVendidos();
	}
	
	public VendaBuilder criarVenda() {
		reset();
		return this;
	}
	
	public VendaBuilder setData(Date data) {
		this.venda.setData(data);
		return this;
	}
	
	public VendaBuilder setProduto(Animal[] produto) {
		ColecaoAnimal colecao = ColecaoAnimal.criarColecaoAnimal(produto);
		this.venda.setProduto(colecao);
		return this;
	}
	
	public VendaBuilder setCalculadora(Cotacao cotacao) {
		CalculaPreco calculadora = new CalculaPreco();
		calculadora.setCotacao(cotacao);
		this.venda.setCalculadora(calculadora);
		return this;
	}
	
	public Venda salvar() {
		vendidos.novaVenda(venda);
		return this.venda;
	}
	
	private Venda reset() {
		Venda venda  = this.venda;
		this.venda = new Venda();
		return venda;
	}
}
