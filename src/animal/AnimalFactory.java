package animal;

import java.util.Date;

import vacina.CartaoVacinaFactory;

public class AnimalFactory {
	//TODO validators
	public static Bovino newBovino(double peso, String raca, Date dataNasc, Generos genero) {
		long id = Animal.getProximoId();
		var cartaoVacina = CartaoVacinaFactory.newCartaoVacinaBovino();
		return new Bovino(id, peso, raca, dataNasc, genero, cartaoVacina);
	}
	
	public static Suino newSuino(double peso, String raca, Date dataNasc, Generos genero) {
		long id = Animal.getProximoId();
		var cartaoVacina = CartaoVacinaFactory.newCartaoVacinaSuino();
		return new Suino(id, peso, raca, dataNasc, genero, cartaoVacina);
	}

}
