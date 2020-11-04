package peso;

public class Arroba implements IUnidade{

	@Override
	public String getUnidade(double arrobas) {
		return String.valueOf(arrobas)+ " @";
	}

	@Override
	public double converterParaArroba(double arrobas) {
		return arrobas;
	}

	@Override
	public double converterDeArroba(double arrobas) {
		return arrobas;
	}
	

}
