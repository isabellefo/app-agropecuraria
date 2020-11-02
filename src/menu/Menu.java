package menu;

import controlador.Controlador;

public class Menu {
	private static Menu menu = null;
	
	private Opcao[] opcoes;
	private Controlador ctrl;
	
	private Menu() {
		ctrl = Controlador.obterControlador();
		opcoes = new Opcao[]{
				new OpcaoCadastrarAnimal(),
				new OpcaoSair(),
				};
	}
	
	public static Menu criarMenu() {
		if(menu == null) {
			menu = new Menu();
		}
		return menu;
	}
	
	public void run(int id) {
		opcoes[id].run();
	}
	
	public void escolherOpcao() {
		int op = ctrl.lerOpcao("~Menu~", opcoes);
		run(op);
	}
	
}
