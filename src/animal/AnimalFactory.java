package animal;

import java.util.Date;

public class AnimalFactory {
	//TODO validators
	public static Bovino newBovino(double peso, String raca, Date dataNasc, Generos genero) {
		long id = Animal.getProximoId();
		return new Bovino(id, peso, raca, dataNasc, genero, null);
	}
	
	public static Suino newSuino(double peso, String raca, Date dataNasc, Generos genero) {
		long id = Animal.getProximoId();
		return new Suino(id, peso, raca, dataNasc, genero, null);
	}

}
