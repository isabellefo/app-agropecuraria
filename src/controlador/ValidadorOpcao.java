package controlador;

public class ValidadorOpcao implements Validador {
	protected int max;
	
	public ValidadorOpcao(int max) {
		this.max = max;
	}
	
	@Override
	public boolean validar(Object target) {
		if(!(target instanceof Integer)) {
			return false;
		}
		int x = (int) target;
		return (x > 0) && (x <= max);
	}

}
