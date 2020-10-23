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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAplicada() {
		return aplicada;
	}

	public void setAplicada(boolean aplicada) {
		this.aplicada = aplicada;
	}

	public Date getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
}