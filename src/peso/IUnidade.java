package peso;

public abstract class IUnidade {
	private static IUnidade unidade = null;
	
	public static IUnidade obterUnidadeSistema() {
		if(unidade == null) {
			unidade = new Arroba();
		}
		return unidade;
	}
	
	public static void setUnidadeSistema(IUnidade unidade) {
		IUnidade.unidade = unidade;
	}
	
	public static IUnidade[] getAllUnidades() {
		return new IUnidade[] {
				new Kilograma(),
				new Arroba(),
		};
	}
	
	public abstract double converterParaArroba(double quantidade);
	
	
	public abstract String getUnidade(double arrobas);

}
