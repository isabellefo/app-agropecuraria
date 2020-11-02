package controlador;

public class ValidadorNome implements Validador {

	@Override
	public boolean validar(Object target) {
		if(!(target instanceof String)) {
			return false;
		}
		String s = (String) target;
		return !s.isEmpty();
	}

}
