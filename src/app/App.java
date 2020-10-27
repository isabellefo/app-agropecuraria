package app;

import vacina.*;

public class App {

	public static void main(String[] args) {

		/* Testes */

		System.out.println("Cartão de vacina de bovinos:");
		CartaoVacina cartao = CartaoVacinaFactory.newCartaoVacinaBovino();
		cartao.vacinas.forEach((__, vacina) -> {
			System.out.println("  - " + vacina.getNome());
		});

		System.out.println("\nCartão de vacina de suinos:");
		cartao = CartaoVacinaFactory.newCartaoVacinaSuino();
		cartao.vacinas.forEach((__, vacina) -> {
			System.out.println("  - " + vacina.getNome());
		});

		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

		var vacina = new Vacina("Pneumonia enzoótica", true, null, null);
		cartao.adicionarVacina(vacina);

		vacina = new Vacina("Rinite atrófica", true, null, null);
		cartao.adicionarVacina(vacina);

		System.out.println("Vacinas não aplicadas:");
		var vacinasNaoAplicadas = cartao.getVacinasNaoAplicadas();
		vacinasNaoAplicadas.forEach(
				v -> System.out.println("  - " + v.getNome())
		);

		System.out.println("\nVacinas aplicadas:");
		var vacinasAplicadas = cartao.getVacinasAplicadas();
		vacinasAplicadas.forEach(
				v -> System.out.println("  - " + v.getNome())
		);

		System.out.println("\nErisipela: " + cartao.vacinaEstaAplicada("Erisipela"));
		System.out.println("Pneumonia enzoótica: " + cartao.vacinaEstaAplicada("Pneumonia enzoótica"));
		System.out.println("Teste: " + cartao.vacinaEstaAplicada("Teste"));

		// aplica todas as vacinas não aplicadas
		vacinasNaoAplicadas.forEach( v -> v.setAplicada(true) );

		System.out.println("\nVacinas não aplicadas:");
		vacinasNaoAplicadas = cartao.getVacinasNaoAplicadas();
		vacinasNaoAplicadas.forEach(
				v -> System.out.println("  - " + v.getNome())
		);

		System.out.println("\nVacinas aplicadas:");
		vacinasAplicadas = cartao.getVacinasAplicadas();
		vacinasAplicadas.forEach(
				v -> System.out.println("  - " + v.getNome())
		);
	}

}
