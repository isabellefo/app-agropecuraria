package controlador;

public class ValidadorPositivo implements Validador {

	@Override
	public boolean validar(Object target) {
		if(target instanceof Double) {
			double x = (double) target;
			return x > 0;
		} else if (target instanceof Integer) {
			int x = (int) target;
			return x > 0;
		} else if (target instanceof Long) {
			long x = (long) target;
			return x > 0;
		}
		return false;
	}

}
