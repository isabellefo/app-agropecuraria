package menu;

import animal.Animal;
import animal.ColecaoAnimal;

public class OpcaoListarAnimais extends Opcao {
	private final ColecaoAnimal<Animal> genesis;
	protected OpcaoListarAnimais(String descricao) {
		super(descricao);
		this.genesis = ColecaoAnimal.obterGenesis();
	}

	@Override
	public void run() {
		System.out.println(genesis);

	}

}
