package animal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ColecaoAnimal<T extends Animal> {
	Map<Long, T> animais;
	private static ColecaoAnimal<Animal> genesis = null;
	
	public ColecaoAnimal() {
		this.animais = new HashMap<>();
	}
	
	public static ColecaoAnimal<Animal> obterGenesis() {
		if(genesis == null)  {
			genesis = new ColecaoAnimal<Animal>();
		}
		return genesis;
	}
	
	public void novoAnimal(T animal) {
		animais.put(animal.getId(), animal);
	}
	
	public T getAnimal(long id) {
		return animais.get(id);
	}
	
	public T popAnimal(long id) {
		T animal = animais.get(id);
		animais.remove(id);
		return animal;
	}
	
	public boolean estaNaColecao(long id) {
		return animais.containsKey(id);
	}
	
	public Collection<T> getAnimalCollection() {
		return animais.values();
	}
	
	private String toString(long id) {
		return animais.get(id).toString() + System.lineSeparator();
	}
	
	public String toString() {
		String s = "";
		for(long animal: animais.keySet()) {
			s += toString(animal);
		}
		return s;
	}
}
