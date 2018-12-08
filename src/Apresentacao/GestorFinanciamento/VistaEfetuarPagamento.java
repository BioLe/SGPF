package Apresentacao.GestorFinanciamento;

import Apresentacao.Vista;

public class VistaEfetuarPagamento extends Vista {
	
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
