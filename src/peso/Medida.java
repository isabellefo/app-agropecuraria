  
package peso;;

public class Medida {
	
	protected double quantidade;
	protected static IUnidade unidade;
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getQuantidade() {
		return this.quantidade;
	}
	
	public void setUnidade(IUnidade unidade) {
		Medida.unidade = unidade;
	}
	
	public String toString() {
		return unidade.getUnidade(quantidade);
	}

}