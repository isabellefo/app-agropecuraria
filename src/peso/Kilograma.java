package peso;

public class Kilograma implements IUnidade{

	@Override
	public String getUnidade(double arrobas) {
		double kilogramas = converterDeArroba(arrobas);
		return String.valueOf(kilogramas) +" Kg";
	}

	@Override
	public double converterParaArroba(double kilogramas) {
		double arrobas = kilogramas / 15.0;
		return arrobas;
	}

	@Override
	public double converterDeArroba(double arrobas) {
		double kilogramas = arrobas * 15.0;
		return kilogramas;
	}

}