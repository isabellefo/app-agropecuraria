package menu;

import animal.Animal;
import animal.ColecaoAnimal;
import controlador.Controlador;
import vacina.Vacina;

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
		Vacina[] vacinas = animal.getCartaoVacina().getVacinasNaoAplicadas().toArray(Vacina[]::new);
		Vacina vacinaAplicada = ctrl.lerOpcao("Vacinas nao aplicadas", vacinas);
		vacinaAplicada.setAplicada(true);
		
	}


	@Override
	public void run() {
		escolherAnimal();
		lerVacina();

	}

}
