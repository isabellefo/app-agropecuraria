package animal;

import java.util.Date;

import vacina.CartaoVacinaBovino;

public class Bovino extends Animal {

	protected Bovino(long id, double peso, String raca, Date dataNasc, Generos genero, CartaoVacinaBovino cartaoVacina) {
		super(id, peso, raca, dataNasc, genero, cartaoVacina);
	}
	

	
}
