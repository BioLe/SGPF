package Apresentacao.GestorFinanciamento;

import Apresentacao.Vista;

public class VistaPedirReforco extends Vista {
	
	private String numeroProjeto;
	private String reforco;

	public String getNumeroProjeto() {
		return this.numeroProjeto;
	}
	
	private void setNumeroProjeto(String numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}

	public String pedirReforco() {
		escrever("Insira o número de projeto");
		setNumeroProjeto(ler());
		escrever("Insira o reforco pretendido");
		setReforco(ler());
		return "TODO";
	}


	private void setReforco(String reforco) {
		this.reforco = reforco;
	}
	
	private String getReforco() {
		return this.reforco;
	}
}
