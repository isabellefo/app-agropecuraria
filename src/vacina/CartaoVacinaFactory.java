package vacina;

public class CartaoVacinaFactory {

	// retirado deste site ourofinosaudeanimal.com/perguntas-frequentes/bovinos/qual-e-o-calendario-vacinal-bovinos/
	private static final String[] vacinasBovino = {
		"Febre aftosa", "Brucelose", "Clostridioses",
		"Botulismo", "Leptospirose", "Raiva bovina"
	};
	
	// retirado deste site marangoni.com.br/conforto-animal/2019/11/08/vacinas-para-suinos-tudo-o-que-voce-precisa-saber/
	private static final String[] vacinasSuino = {
		"Colibacilose", "Doença de Aujeszky", "Erisipela",
		"Leptospirose", "Parvovirose", "Peste suína clássica",
		"Pneumonia enzoótica", "Rinite atrófica"
	};
	
	public static CartaoVacinaBovino newCartaoVacinaBovino() {
		CartaoVacinaBovino cartaoVacina = new CartaoVacinaBovino();

		// preenche o cartão de vacinas com todas as vacinas para bovino
		for(var nomeVacina: vacinasBovino) {
			Vacina vacina = new Vacina(nomeVacina, false, null, null);
			cartaoVacina.adicionarVacina(vacina);
		}
		
		return cartaoVacina;
	}
	
	public static CartaoVacinaSuino newCartaoVacinaSuino() {
		CartaoVacinaSuino cartaoVacina = new CartaoVacinaSuino();
		
		// preenche o cartão de vacinas com todas as vacinas para suíno
		for(var nomeVacina: vacinasSuino) {
			Vacina vacina = new Vacina(nomeVacina, false, null, null);
			cartaoVacina.adicionarVacina(vacina);
		}
		
		return cartaoVacina;
	}
	
}
