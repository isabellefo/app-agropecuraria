package peso;

public interface IUnidade {
	
	String unidadeMedida = "";

	public double converter(double quantidade);
	
	public String getUnidade();

}
