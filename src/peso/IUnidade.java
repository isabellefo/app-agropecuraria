package peso;

public interface IUnidade {
	
	String unidadeMedida = "";
	
	public double converterParaArroba(double quantidade);
	
	public double converterDeArroba(double quantidade);
	
	public String getUnidade(double arrobas);

}
