package menu;

import java.util.Date;

import animal.AnimalBuilder;
import animal.Familias;
import animal.Generos;
import controlador.Controlador;
import controlador.ValidadorNome;
import controlador.ValidadorPositivo;

public class OpcaoCadastrarAnimal extends Opcao {
	private final AnimalBuilder animalBuilder;
	private final Controlador ctrl;
	
	protected OpcaoCadastrarAnimal(String descricao) {
		super(descricao);
		 this.ctrl = Controlador.obterControlador();
		 this.animalBuilder = new AnimalBuilder();
	}
	
	private void lerFamilia() {
		int familia = ctrl.lerOpcao("Familas: ", Familias.FAMILIAS);
		if (familia == 0) {
			animalBuilder.criarSuino();
		} else {
			animalBuilder.criarBovino();
		}
	}
	
	private void lerRaca() {
		String raca = ctrl.lerString("Raca: ", new ValidadorNome());
		animalBuilder.setRaca(raca);
	}
	
	private void lerPeso() {
		double peso = ctrl.lerDouble("Peso: ", new ValidadorPositivo());
		animalBuilder.setPeso(peso);
	}
	
	private void lerGenero() {
		int genero = ctrl.lerOpcao("Genero: ", Generos.GENEROS);
		animalBuilder.setGenero( Generos.getGenero(genero) );
	}
	
	private void lerDataNasc() {
		Date dataNasc = ctrl.lerData("Data de Nasc: ");
		animalBuilder.setdataNasc(dataNasc);
	}
	
	private void lerCartao() {
		Integer[] vacinas = ctrl.lerIntArr("Vacinas: ", animalBuilder.getVacinas());
		animalBuilder.setCartaoVacina(vacinas);
	}

	@Override
	public void run() {
		lerFamilia();
		lerRaca();
		lerPeso();
		lerGenero();
		lerDataNasc();
		lerCartao();
		animalBuilder.salvarAnimal();
	}

}
