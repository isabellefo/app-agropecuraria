package menu;

public class OpcaoSair extends Opcao {
	
	public OpcaoSair() {
		super("Sair");
	}

	public void run() {
		System.exit(0);
	}
}
