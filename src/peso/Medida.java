  
package peso;;

public class Medida {
	
	protected double quantidade;
	protected static IUnidade unidade = new Arroba();
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public static void setUnidade(IUnidade unidade) {
		Medida.unidade = unidade;
	}
	
	public static IUnidade getUnidade() {
		return Medida.unidade;
	}
	
	public String toString() {
		return unidade.getUnidade(quantidade);
	}

}