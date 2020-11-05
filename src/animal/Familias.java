package animal;

public enum Familias {
	SUINO {
		public String toString() {
			return "Suino";
		}
	},
	BOVINO {
		public String toString() {
			return "Bovino";
		}
	};
	
	public static final Familias[] getFamilias() {
			return new Familias[] {
				Familias.SUINO,
				Familias.BOVINO,
			};
	}
}
