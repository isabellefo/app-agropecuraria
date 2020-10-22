package animal;

import java.util.Date;

public class Animal {
	//TODO fazer serializacao
	private static long idCont;
	private long id;
	private double peso;
	private String raca;
	private Date dataNasc;
	private Generos genero;
	private CartaoVacina cartaoVacina;
	
	protected Animal(long id, double peso, String raca, Date dataNasc, Generos genero, CartaoVacina cartaoVacina) {
		this.id = id;
		this.peso = peso;
		this.raca = raca;
		this.dataNasc = dataNasc;
		this.genero = genero;
		this.cartaoVacina = cartaoVacina;
	}
	
	public long getId() {
		return id;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public Date getDataNasc() {
		return dataNasc;
	}
	
	public Generos getGenero() {
		return genero;
	}
	
	public boolean estaVacinado() {
		return cartaoVacina.estaVacinado();
	}
	
	protected static long getProximoId() {
		return ++idCont;
	}
}
