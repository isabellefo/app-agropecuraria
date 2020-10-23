package animal;

import java.util.Date;

import vacina.CartaoVacinaSuino;

public class Suino extends Animal {
	protected Suino(long id, double peso, String raca, Date dataNasc, Generos genero, CartaoVacinaSuino cartaoVacinaSuino) {
		super(id, peso, raca, dataNasc, genero, cartaoVacinaSuino);
	}
	
}
