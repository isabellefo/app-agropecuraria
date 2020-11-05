package menu;

import controlador.Controlador;
import peso.IUnidade;

public class OpcaoEscolherUnidade extends Opcao {
	
	Controlador ctrl;
	
	protected OpcaoEscolherUnidade(String descricao) {
		super(descricao);
		this.ctrl = Controlador.obterControlador();
	}
	
	@Override
	public void run() {
		IUnidade unidade = ctrl.lerOpcao("Escolher unidade de display: ", IUnidade.getAllUnidades());
		IUnidade.setUnidadeSistema(unidade);
	}

}
