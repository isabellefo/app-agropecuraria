package menu;

import java.util.stream.Stream;

import animal.Animal;
import animal.ColecaoAnimal;
import controlador.Controlador;

public class OpcaoAdicionaVacina extends Opcao {
	
	private final Controlador ctrl;
	private final ColecaoAnimal genesis;
	private Animal animal;

	public OpcaoAdicionaVacina(String descricao) {
		super(descricao);
		this.ctrl = Controlador.obterControlador();
		genesis = ColecaoAnimal.obterGenesis();
	}
	
	private void escolherAnimal() {
		Animal[] animais = genesis.getAnimalCollection().toArray(new Animal[genesis.size()]);
		this.animal = ctrl.lerOpcao("Animais: ", animais);
	}
	
	private void lerVacina() {
		//TODO listar as vacinas corretas e aplicar
	}


	@Override
	public void run() {
		escolherAnimal();
		lerVacina();

	}

}
