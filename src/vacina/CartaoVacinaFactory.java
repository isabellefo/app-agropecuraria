package vacina;

import java.util.Arrays;
import java.util.Iterator;

public class CartaoVacinaFactory {
	
	private static Boolean[] transformarVacinas(Integer[] aplicacoes, int numVacinas) {
		Boolean[] vacinas = new Boolean[numVacinas];
		Arrays.fill(vacinas, Boolean.FALSE);
		for(int i : aplicacoes) {
			vacinas[i] = true;
		}
		return vacinas;
	}
	
	public static CartaoVacinaBovino newCartaoVacinaBovino() {
		CartaoVacinaBovino cartaoVacina = new CartaoVacinaBovino();

		// preenche o cartão de vacinas com todas as vacinas para bovino
		for(var nomeVacina: CartaoVacinaBovino.getVacinas()) {
			Vacina vacina = new Vacina(nomeVacina, false, null, null);
			cartaoVacina.adicionarVacina(vacina);
		}
		
		return cartaoVacina;
	}
	
	public static CartaoVacinaBovino newCartaoVacinaBovino(Integer[] vacinas) {
		Boolean[] vacinasAplicadas = transformarVacinas(vacinas, CartaoVacinaBovino.getVacinas().length);
		CartaoVacinaBovino cartaoVacina = new CartaoVacinaBovino();
		Iterator<String> vacinasIter = Arrays.asList(CartaoVacinaBovino.getVacinas()).iterator();
		Iterator<Boolean> vacinasAplcIter = Arrays.asList(vacinasAplicadas).iterator();
		while( vacinasIter.hasNext() && vacinasAplcIter.hasNext() ) {
			String nomeVacina = vacinasIter.next();
			boolean vacinado =  vacinasAplcIter.next();
			Vacina vacina = new Vacina(nomeVacina, vacinado, null, null);
			cartaoVacina.adicionarVacina(vacina);
		}
		
		return cartaoVacina;
	}
	
	public static CartaoVacinaSuino newCartaoVacinaSuino() {
		CartaoVacinaSuino cartaoVacina = new CartaoVacinaSuino();
		
		// preenche o cartão de vacinas com todas as vacinas para suíno
		for(var nomeVacina: CartaoVacinaSuino.getVacinas()) {
			Vacina vacina = new Vacina(nomeVacina, false, null, null);
			cartaoVacina.adicionarVacina(vacina);
		}
		
		return cartaoVacina;
	}
	
	public static CartaoVacinaSuino newCartaoVacinaSuino(Integer[] vacinas) {
		Boolean[] vacinasAplicadas = transformarVacinas(vacinas, CartaoVacinaBovino.getVacinas().length);
		CartaoVacinaSuino cartaoVacina = new CartaoVacinaSuino();
		Iterator<String> vacinasIter = Arrays.asList(CartaoVacinaSuino.getVacinas()).iterator();
		Iterator<Boolean> vacinasAplcIter = Arrays.asList(vacinasAplicadas).iterator();
		while( vacinasIter.hasNext() && vacinasAplcIter.hasNext() ) {
			String nomeVacina = vacinasIter.next();
			boolean vacinado =  vacinasAplcIter.next();
			Vacina vacina = new Vacina(nomeVacina, vacinado, null, null);
			cartaoVacina.adicionarVacina(vacina);
		}
		
		return cartaoVacina;
	}
	
}
