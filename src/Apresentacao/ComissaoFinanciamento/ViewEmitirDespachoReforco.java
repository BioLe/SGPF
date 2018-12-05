package Apresentacao.ComissaoFinanciamento;

import Apresentacao.View;

public class ViewEmitirDespachoReforco extends View {
	
	private String numeroProjeto;
	private String decisao;
	
	public String obterDespachoReforco() {
		escrever("Insira o número de projeto");
		setNumeroProjeto(ler());
		escrever("\n1 - Aprovar\n2 - Rejeitar\nIndique a decisão");
		setDecisao(ler());
		switch (this.decisao) {
		case "1":
			setDecisao("Aprovado");
			break;
		case "2":
			setDecisao("Reprovado");
			break;
		}
		return "TODO";
	}

	public String getNumeroProjeto() { return this.numeroProjeto; }
	public void setNumeroProjeto(String numeroProjeto) { this.numeroProjeto = numeroProjeto; }

	public String getDecisao() { return this.decisao; }
	public void setDecisao(String decisao) { this.decisao = decisao; }
}
