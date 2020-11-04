package peso;

public interface IUnidade {
	
	String unidadeMedida = "";
	/**
	 * 
	 * @param quantidade a ser convertida
	 * @return quantidade em arrobas
	 */
	public double converter(double quantidade);
	
	public String getUnidade(double arrobas);

}
