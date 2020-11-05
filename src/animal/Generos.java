package animal;

public enum Generos {
	MASCULINO {
			public String toString() {
				return "Masculino";
			}
	},
	FEMININO{
		public String toString() {
			return "Feminino";
		}
	};
	
	public static Generos[] getGeneros() {
		return new Generos[] {
			Generos.MASCULINO,
			Generos.FEMININO
		};
	}
}
