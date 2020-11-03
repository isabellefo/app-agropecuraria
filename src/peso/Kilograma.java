package peso;

public class Kilograma extends Medida{
	
	@Override
	public void normalizarPeso() {
		animal.setPeso(medida/15.0);
	}

}