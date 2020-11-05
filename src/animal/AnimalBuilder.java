package animal;


import java.util.Date;

import peso.Medida;
import vacina.CartaoVacina;
import vacina.CartaoVacinaBovino;
import vacina.CartaoVacinaFactory;
import vacina.CartaoVacinaSuino;

public class AnimalBuilder {
	private Animal animal;
	private final ColecaoAnimal genesis;
	private double valorBovino = 250;
	private double valorSuino = 150;
	
	public AnimalBuilder() {
		this.genesis = ColecaoAnimal.obterGenesis();
	}
	
	public AnimalBuilder criarBovino() {
		this.animal = new Bovino();
		this.animal.setValor(valorBovino);
		return this;
	}
	
	public AnimalBuilder criarSuino() {
		this.animal = new Suino();
		this.animal.setValor(valorSuino);
		return this;
	}
	
	public AnimalBuilder setRaca(String raca) {
		this.animal.setRaca(raca);
		return this;
	}
	
	public AnimalBuilder setPeso(Medida peso) {
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
	
	private CartaoVacina criarCartao(String[] vacinas) {
		if(animal instanceof Bovino) {
			return CartaoVacinaFactory.newCartaoVacinaBovino(vacinas);
		} 
		return CartaoVacinaFactory.newCartaoVacinaSuino(vacinas);
	}
	
	public AnimalBuilder setCartaoVacina(String[] vacinas) {
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
