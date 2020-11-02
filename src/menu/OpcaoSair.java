package menu;

public class OpcaoSair extends Opcao {
	
	public OpcaoSair(String descricao) {
		super(descricao);
	}

	public void run() {
		System.exit(0);
	}
}
