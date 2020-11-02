package menu;

public abstract class Opcao {
	String descricao;
	
	protected Opcao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDecricao() {
		return descricao;
	}
	
	public abstract void run();
	
	public String toString() {
		return descricao;
	}
}
