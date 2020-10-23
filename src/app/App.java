package app;

import vacina.*;

public class App {

	public static void main(String[] args) {

		System.out.println("Cartão de vacina de bovinos:");
		CartaoVacina cartao = CartaoVacinaFactory.newCartaoVacinaBovino();
		cartao.vacinas.forEach(vacina -> {
			System.out.println("  - " + vacina.getNome());
		});
		
		System.out.println("\nCartão de vacina de suinos:");
		cartao = CartaoVacinaFactory.newCartaoVacinaSuino();
		cartao.vacinas.forEach((vacina) -> {
			System.out.println("  - " + vacina.getNome());
		});
		
	}

}
