package Apresentacao.GestorFinanciamento;

import Apresentacao.View;

public class ViewEfetuarPagamento extends View {
	
	private String numeroProjeto;
	private String montante;

	public String getNumeroProjeto() {
		return this.numeroProjeto;
	}
	
	private void setNumeroProjeto(String numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}

	public String efetuarPagamento() {
		escrever("Insira o número de projeto");
		setNumeroProjeto(ler());
		escrever("Insira o montante pretendido");
		setMontante(ler());
		return "TODO";
	}


	private void setMontante(String montante) {
		this.montante = montante;
	}
	
	private String getMontante() {
		return this.montante;
	}
}
