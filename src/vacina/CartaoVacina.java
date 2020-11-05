package vacina;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public abstract class CartaoVacina {
	
	public abstract int getTotalVacinas();
	
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
	
	public Vacina getVacina(String vacina) {
		return vacinas.get(vacina);
	}

	public void agendarVacina(String nomeVacina, Date dataAgendamento) {
		Vacina vacina = null;

		if(!vacinas.containsKey(nomeVacina)) {
			vacina = new Vacina(nomeVacina, false, null, dataAgendamento);
			adicionarVacina(vacina);
		}
		else {
			vacina = vacinas.get(nomeVacina);
			vacina.setDataAgendamento(dataAgendamento);
		}

	}
	
	public int contarVacinas() {
		return getVacinasAplicadas().size();
	}
	
	public int contarTotalVacinas() {
		return vacinas.size();
	}
}
