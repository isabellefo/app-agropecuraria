package animal;

public enum Generos {
	MASCULINO,
	FEMININO;
	
	public static final String[] GENEROS = {
			"MASCULINO", 
			"FEMININO"
	};
	
	public static Generos getGenero(int genero) {
		return genero == 0 ? Generos.MASCULINO : Generos.FEMININO;
	}
}
