package menu;

import animal.ColecaoAnimal;

public class OpcaoListarAnimais extends Opcao {
	private final ColecaoAnimal genesis;
	protected OpcaoListarAnimais(String descricao) {
		super(descricao);
		this.genesis = ColecaoAnimal.obterGenesis();
	}

	@Override
	public void run() {
		System.out.println(genesis);

	}

}
