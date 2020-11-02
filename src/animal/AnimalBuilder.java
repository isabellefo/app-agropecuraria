package animal;


import java.util.Date;

import vacina.CartaoVacina;
import vacina.CartaoVacinaBovino;
import vacina.CartaoVacinaFactory;
import vacina.CartaoVacinaSuino;

public class AnimalBuilder {
	private Animal animal;
	private final ColecaoAnimal<Animal> genesis;
	
	public AnimalBuilder() {
		this.genesis = ColecaoAnimal.obterGenesis();
	}
	
	public AnimalBuilder criarBovino() {
		this.animal = new Bovino();
		return this;
	}
	
	public AnimalBuilder criarSuino() {
		this.animal = new Suino();
		return this;
	}
	
	public AnimalBuilder setRaca(String raca) {
		this.animal.setRaca(raca);
		return this;
	}
	
	public AnimalBuilder setPeso(double peso) {
		this.animal.setPeso(peso);
		return this;
	}
	
	public AnimalBuilder setdataNasc(Date dataNasc) {
		this.animal.setDataNasc(dataNasc);
		return this;
	}
	
	public AnimalBuilder setGenero(Generos genero) {
		this.animal.setGenero(genero);
		return this;
	}
	
	private CartaoVacina criarCartao(Integer[] vacinas) {
		if(animal instanceof Bovino) {
			return CartaoVacinaFactory.newCartaoVacinaBovino(vacinas);
		} 
		return CartaoVacinaFactory.newCartaoVacinaSuino(vacinas);
	}
	
	public AnimalBuilder setCartaoVacina(Integer[] vacinas) {
		CartaoVacina cartao = criarCartao(vacinas);
		this.animal.setCartaoVacina(cartao);
		return this;
	}
	
	public String[] getVacinas() {
		if(animal instanceof Bovino) {
			return CartaoVacinaBovino.getVacinas();
		}
		return CartaoVacinaSuino.getVacinas();
	}
	
	public Animal salvarAnimal() {
		animal.setId();
		genesis.novoAnimal(animal);
		Animal animal = this.animal;
		this.animal = null;
		return animal;
	}

}
