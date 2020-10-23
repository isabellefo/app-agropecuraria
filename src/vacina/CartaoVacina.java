package vacina;

import java.util.ArrayList;
import java.util.List;

public abstract class CartaoVacina {
	public List<Vacina> vacinas;
	
	public CartaoVacina() {
		this.vacinas = new ArrayList<Vacina>();
	}
	
	// TODO
	public boolean estaVacinado() {
		return true;
	}

	public void adicionarVacina(Vacina vacina) {
		vacinas.add(vacina);
	}
}
