  
package peso;;

public class Medida {
	
	protected double quantidade;
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public String toString() {
		return IUnidade.obterUnidadeSistema().getUnidade(quantidade);
	}

}