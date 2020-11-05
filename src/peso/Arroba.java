package peso;

public class Arroba extends IUnidade {

	@Override
	public String getUnidade(double arrobas) {
		return String.valueOf(arrobas)+ "@";
	}

	@Override
	public double converterParaArroba(double arrobas) {
		return arrobas;
	}
	
	public String toString() {
		return "Arroba";
	}
}
