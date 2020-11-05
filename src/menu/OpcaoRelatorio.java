package menu;

import relatorio.Relatorio;

public class OpcaoRelatorio extends Opcao {
	private Relatorio relatorio;
	protected OpcaoRelatorio(String descricao) {
		super(descricao);
		this.relatorio = new Relatorio();
	}

	@Override
	public void run() {
		relatorio.print();

	}

}
