package peso;

public class Arroba implements IUnidade{

	@Override
	public double converter(double quantidade) {
		return quantidade;
	}

	@Override
	public String getUnidade() {
		return "@";
	}
	

}
