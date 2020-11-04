package peso;

public class Kilograma implements IUnidade{
	
	@Override
	public double converter(double kilogramas) {
		double arrobas = kilogramas/15.0;
		return arrobas;
	}

	@Override
	public String getUnidade(double arrobas) {
		double kilogramas = arrobas*15;
		return String.valueOf(kilogramas) +" Kg";
	}

}