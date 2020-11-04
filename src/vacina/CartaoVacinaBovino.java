package vacina;

public class CartaoVacinaBovino extends CartaoVacina {
	
	// retirado deste site ourofinosaudeanimal.com/perguntas-frequentes/bovinos/qual-e-o-calendario-vacinal-bovinos/
	private static final String[] VACINAS = {
		"Febre aftosa", "Brucelose", "Clostridioses",
		"Botulismo", "Leptospirose", "Raiva bovina"
	};

	
	public static String[] getVacinas() {
		return VACINAS;
	}
	
	public CartaoVacinaBovino() {
		super();
	}

	@Override
	public int getTotalVacinas() {
		// TODO Auto-generated method stub
		return VACINAS.length;
	}
	

}
