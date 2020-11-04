  
package peso;

import animal.Animal;

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
		this.unidade = unidade;
	}
	
	public String toString() {
		return quantidade +" "+ unidade.getUnidade();
	}

}