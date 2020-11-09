package animal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import preco.CalculaPreco;

public class ColecaoAnimal implements AnimalProduto {
	Map<Long, Animal> animais;
	private static ColecaoAnimal genesis = null;
	
	private ColecaoAnimal() {
		this.animais = new HashMap<>();
	}
	
	public static ColecaoAnimal obterGenesis() {
		if(genesis == null)  {
			genesis = new ColecaoAnimal();
		}
		return genesis;
	}
	
	public static ColecaoAnimal criarColecaoAnimal(Animal[] animais) {
		ColecaoAnimal colecao = new ColecaoAnimal();
		for(Animal a : animais) {
			colecao.novoAnimal(a);
		}
		return colecao;
	}
	
	public void novoAnimal(Animal animal) {
		animais.put(animal.getId(), animal);
	}
	
	public Animal getAnimal(long id) {
		return animais.get(id);
	}
	
	public Animal popAnimal(long id) {
		Animal animal = animais.get(id);
		animais.remove(id);
		return animal;
	}
	
	public boolean estaNaColecao(long id) {
		return animais.containsKey(id);
	}
	
	public Collection<Animal> getAnimalCollection() {
		return animais.values();
	}
	
	public double getPeso() {
		double pesoTotal = 0;
		for(Animal a : getAnimalCollection()) {
			pesoTotal += a.getPeso();
		}
		return pesoTotal;
	}
	
	@Override
	public double getValor() {
		double valorTotal = 0;
		for(Animal a : getAnimalCollection()) {
			valorTotal += a.getValor();
		}
		return valorTotal;
	}
	
	public int size() {
		return this.animais.size();
	}
	
	private String toString(long id) {
		return animais.get(id).toString() + System.lineSeparator();
	}
	
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for(long animal: animais.keySet()) {
			buffer.append(toString(animal));
		}
		return buffer.toString();
	}

	@Override
	public double getProporcaoVacina() {
		double totalVacinas = 0;
		for (Animal a : getAnimalCollection()) {
			totalVacinas += a.getCartaoVacina().possuiTodasVacinas() ? 1 : 0;
		}
		return  totalVacinas / size() * 100;
	}
	
	public double getProporcaoMachos() {
		double totalMachos = 0;
		for (Animal a : getAnimalCollection()) {
			if(a.getGenero() == Generos.MASCULINO) {
				totalMachos++;
			}
		}
		return totalMachos / size() * 100;
		
	}
	public double getPreco(CalculaPreco calculadora) {
		double total = 0;
		for(Animal a : getAnimalCollection()) {
			total += a.getPreco(calculadora);
		}
		return total;
		
	}


}
