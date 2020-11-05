package vacina;

public class CartaoVacinaFactory {
	
	public static CartaoVacinaBovino newCartaoVacinaBovino() {
		CartaoVacinaBovino cartaoVacina = new CartaoVacinaBovino();

		// preenche o cartão de vacinas com todas as vacinas para bovino
		for(var nomeVacina: CartaoVacinaBovino.getVacinas()) {
			Vacina vacina = new Vacina(nomeVacina, false, null, null);
			cartaoVacina.adicionarVacina(vacina);
		}
		
		return cartaoVacina;
	}
	
	public static CartaoVacinaBovino newCartaoVacinaBovino(String[] vacinas) {
		CartaoVacinaBovino cartaoVacina = newCartaoVacinaBovino();
		for(var nomeVacina: vacinas) {
			cartaoVacina.getVacina(nomeVacina).setAplicada(true);
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
	
	public static CartaoVacinaSuino newCartaoVacinaSuino(String[] vacinas) {
		CartaoVacinaSuino cartaoVacina = newCartaoVacinaSuino();
		for(var nomeVacina: vacinas) {
			cartaoVacina.getVacina(nomeVacina).setAplicada(true);
		}
		return cartaoVacina;
	}
	
}
