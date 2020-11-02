package controlador;

public interface Validador {
	/**
	 * 
	 * @param target
	 * @return true se o valor for correto, false se o valor for incorreto
	 */
	public boolean validar(Object target);
}
