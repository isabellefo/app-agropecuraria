package peso;

public class Kilograma implements IUnidade{
	
	@Override
	public double converter(double quantidade) {
		return quantidade/15.0;
	}

	@Override
	public String getUnidade() {
		return "Kg";
	}

}