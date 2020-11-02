package animal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import vacina.CartaoVacina;

public class Animal {
	//TODO fazer serializacao
	private static long idCont;
	private static DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
	
	private long id;
	private double peso;
	private String raca;
	private Date dataNasc;
	private Generos genero;
	private CartaoVacina cartaoVacina;
	
	protected void setId(long id) {
		this.id = id;
	}
	
	protected void setId() {
		this.id = Animal.getProximoId();
	}
	
	protected void setPeso(double peso) {
		this.peso = peso;
	}

	protected void setRaca(String raca) {
		this.raca = raca;
	}

	protected void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	protected void setGenero(Generos genero) {
		this.genero = genero;
	}

	protected void setCartaoVacina(CartaoVacina cartaoVacina) {
		this.cartaoVacina = cartaoVacina;
	}
	
	protected Animal(long id, double peso, String raca, Date dataNasc, Generos genero, CartaoVacina cartaoVacina) {
		this.id = id;
		this.peso = peso;
		this.raca = raca;
		this.dataNasc = dataNasc;
		this.genero = genero;
		this.cartaoVacina = cartaoVacina;
	}
	
	protected Animal() {
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
		return cartaoVacina.possuiTodasVacinas();
	}

	public CartaoVacina getCartaoVacina() {
		return cartaoVacina;
	}
	
	protected static long getProximoId() {
		return ++idCont;
	}
	
	public String toString() {
		return raca  + " " + dt.format(dataNasc);
	}
}
