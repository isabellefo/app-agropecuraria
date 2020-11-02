package vacina;

import java.util.Date;

public class Vacina {
	private String nome;
	private boolean aplicada;
	private Date dataAplicacao;
	private Date dataAgendamento;	
	
	public Vacina(String nome, boolean aplicada, Date dataAplicacao, Date dataAgendamento) {
		this.nome = nome;
		this.aplicada = aplicada;
		this.dataAplicacao = dataAplicacao;
		this.dataAgendamento = dataAgendamento;
	}

	public Vacina() {	}

	public String getNome() {
		return nome;
	}

	public Vacina setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public boolean isAplicada() {
		return aplicada;
	}

	public Vacina setAplicada(boolean aplicada) {
		this.aplicada = aplicada;
		return this;
	}

	public Date getDataAplicacao() {
		return dataAplicacao;
	}

	public Vacina setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
		return this;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public Vacina setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
		return this;
	}
	
}