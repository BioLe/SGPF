package Apresentacao.ComissaoFinanciamento;

import Apresentacao.Vista;

public class VistaEmitirDespachoAbertura extends Vista {

	private String numeroProjeto;
	private String gestorFinanciamento;

	public String getNumeroProjeto() {
		return this.numeroProjeto;
	}
	
	private void setNumeroProjeto(String numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}

	public String obterDespachoAbertura() {
		escrever("Insira o número de projeto");
		setNumeroProjeto(ler());
		escrever("Insira o Gestor de Financiamento");
		setGestorFinanciamento(ler());
		return "TODO";
	}


	private void setGestorFinanciamento(String gestorFinanciamento) {
		this.gestorFinanciamento = gestorFinanciamento;
	}
	
	private String getGestorFinanciamento() {
		return this.gestorFinanciamento;
	}
}
