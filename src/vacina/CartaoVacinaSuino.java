package vacina;

public class CartaoVacinaSuino extends CartaoVacina{
	
	// retirado deste site marangoni.com.br/conforto-animal/2019/11/08/vacinas-para-suinos-tudo-o-que-voce-precisa-saber/
	private static final String[] VACINAS = {
		"Colibacilose", "Doença de Aujeszky", "Erisipela",
		"Leptospirose", "Parvovirose", "Peste suína clássica",
		"Pneumonia enzoótica", "Rinite atrófica"
	};
	
	public static String[] getVacinas() {
		return VACINAS;
	}

	public CartaoVacinaSuino() {
		super();
	}
	
}
