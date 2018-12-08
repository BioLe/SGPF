package Apresentacao.GestaoEstadoProjeto;

import Apresentacao.Vista;

public class VistaSelecionarProjeto extends Vista {
	
	private String numeroProjeto;

	public String getNumeroProjeto() {
		return this.numeroProjeto;
	}
	
	private void setNumeroProjeto(String numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}

	public String selecionarProjeto() {
		escrever("Insira o número de projeto");
		setNumeroProjeto(ler());
		return "TODO";
	}


}
