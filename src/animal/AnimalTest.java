package animal;

import java.util.Date;

public class AnimalTest {
	public static void test() {
		var animalBuilder = new AnimalBuilder();
		
		Animal boi = animalBuilder
			.criarBovino()
			.setRaca("Otis")
			.setGenero(Generos.MASCULINO)
//			.setPeso(1000)
//			.setCartaoVacina()
			.setdataNasc(new Date())
			.salvarAnimal();
		System.out.println(boi);
		
		Animal porco = animalBuilder
				.criarSuino()
				.setRaca("Porco Aranha")
				.setGenero(Generos.FEMININO)
//				.setPeso(10)
//				.setCartaoVacina(new Integer[]{})
				.setdataNasc(new Date())
				.salvarAnimal();
		System.out.println(porco);
			
	}
}
