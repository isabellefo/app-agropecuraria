package vacina;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public abstract class CartaoVacina {
	public Map<String, Vacina> vacinas;

	protected CartaoVacina() {
		this.vacinas = new HashMap<String, Vacina>();
	}

	protected List<Vacina> filtrarVacinas(Predicate<Vacina> filter) {
		List<Vacina> list_vacinas = vacinas.entrySet()
				.stream()
				.map(map -> map.getValue())
				.filter(filter)
				.collect(Collectors.toList());

		return list_vacinas;
	}
	
	public List<Vacina> getVacinasNaoAplicadas() {
		return filtrarVacinas(v -> !v.isAplicada());
	}

	public List<Vacina> getVacinasAplicadas() {
		return filtrarVacinas(v -> v.isAplicada());
	}

	public boolean possuiTodasVacinas() {
		return getVacinasNaoAplicadas().isEmpty();
	}

	public boolean vacinaEstaAplicada(String nomeVacina) {
		if(!vacinas.containsKey(nomeVacina))
			return false;

		return vacinas.get(nomeVacina).isAplicada();
	}

	public void adicionarVacina(Vacina vacina) {
		vacinas.put(vacina.getNome(), vacina);
	}

}
