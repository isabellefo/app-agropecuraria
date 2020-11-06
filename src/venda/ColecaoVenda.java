package venda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColecaoVenda {
	List<Venda> vendas;
	private static ColecaoVenda vendidos = null;
	
	private ColecaoVenda() {
		this.vendas = new ArrayList<Venda>();
	}
	
	public static ColecaoVenda obterVendidos() {
		if(vendidos == null) {
			vendidos = new ColecaoVenda();
		}
		return vendidos;
	}
	
	public static ColecaoVenda criarColecaoAnimal(Venda[] vendas) {
		ColecaoVenda colecao = new ColecaoVenda();
		for(Venda v : vendas) {
			colecao.novaVenda(v);
		}
		return colecao;
	}
	
	public void novaVenda(Venda venda) {
		vendas.add(venda);
	}
	
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for(Venda v : vendas) {
			buffer.append(v.toString());
		}
		
		return buffer.toString();
	}

}
