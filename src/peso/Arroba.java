package peso;

public class Arroba implements IUnidade{

	@Override
	public double converter(double arrobas) {
		return arrobas;
	}

	@Override
	public String getUnidade(double arrobas) {
		return String.valueOf(arrobas)+ " @";
	}
	

}
