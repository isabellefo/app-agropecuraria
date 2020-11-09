package menu;

import venda.ColecaoVenda;

public class OpcaoListarVendas extends Opcao{
	private final ColecaoVenda vendidos;
	protected OpcaoListarVendas(String descricao) {
		super(descricao);
		this.vendidos = ColecaoVenda.obterVendidos();
	}
	@Override
	public void run() {
		System.out.println(vendidos);
		
	}

}
