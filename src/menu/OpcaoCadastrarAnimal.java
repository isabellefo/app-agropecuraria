package menu;

import java.util.Date;
import java.util.stream.Stream;

import animal.AnimalBuilder;
import animal.Familias;
import animal.Generos;
import controlador.Controlador;
import controlador.ValidadorNome;
import controlador.ValidadorPositivo;
import peso.Medida;

public class OpcaoCadastrarAnimal extends Opcao {
	private final AnimalBuilder animalBuilder;
	private final Controlador ctrl;
	
	protected OpcaoCadastrarAnimal(String descricao) {
		super(descricao);
		 this.ctrl = Controlador.obterControlador();
		 this.animalBuilder = new AnimalBuilder();
	}
	
	private void lerFamilia() {
		Familias familia = ctrl.lerOpcao("Familas: ", Familias.getFamilias());
		if (familia == Familias.SUINO) {
			animalBuilder.criarSuino();
		} else if(familia == Familias.BOVINO) {
			animalBuilder.criarBovino();
		}
	}
	
	private void lerRaca() {
		String raca = ctrl.lerString("Raca: ", new ValidadorNome());
		animalBuilder.setRaca(raca);
	}
	
	private void lerPeso() {
		Medida peso = ctrl.lerMedida("Peso(kg ou @): ", new ValidadorPositivo());
		animalBuilder.setPeso(peso);
	}
	
	private void lerGenero() {
		Generos genero = ctrl.lerOpcao("Genero: ", Generos.getGeneros());
		animalBuilder.setGenero( genero );
	}
	
	private void lerDataNasc() {
		Date dataNasc = ctrl.lerData("Data de Nasc: ");
		animalBuilder.setdataNasc(dataNasc);
	}
	
	private void lerCartao() {
		String[] vacinas = animalBuilder.getVacinas();
		Integer[] vacinasIndexes = ctrl.lerIntArr("Vacinas: ", vacinas);
		String[] vacinasAplicadas = Stream.of(vacinasIndexes).map((vi) -> vacinas[vi]).toArray(String[]::new);
		animalBuilder.setCartaoVacina(vacinasAplicadas);
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
