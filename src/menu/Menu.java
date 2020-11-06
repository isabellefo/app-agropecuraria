package menu;

import controlador.Controlador;

public class Menu {
	private static Menu menu = null;
	
	private Opcao[] opcoes;
	private Controlador ctrl;
	
	private Menu() {
		ctrl = Controlador.obterControlador();
		opcoes = new Opcao[]{
				new OpcaoCadastrarAnimal("Cadastrar novo animal"),
				new OpcaoListarAnimais("Listar todos animais"),
				new OpcaoEscolherUnidade("Escolher unidade do sistema"),
				new OpcaoCadastrarVenda("Cadastrar nova venda"),
				new OpcaoRelatorio("Mostar relatorio dos animais"),
				new OpcaoAdicionaVacina("Adiconar Vacina para um novo animal"),
				new OpcaoSair("Sair"),
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
		Opcao op = ctrl.lerOpcao("~Menu~", opcoes);
		op.run();
	}
	
}
