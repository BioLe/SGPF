package Apresentacao.ComissaoFinanciamento;

import Apresentacao.Vista;

public class VistaEmitirDespachoFinanciamento extends Vista {

	private String numeroProjeto;
	private String tipoProjeto;
	
	//Incentivo
	private String custoElegivel;
	private String montanteFinanciamento;
	private String prazo; //yyyy.mm.dd
	
	//Bonificação
	private String taxaBonificacao;
	private String montanteMaximo;
	private String periodoMaximo;
	
	private String decisao;

	public String getNumeroProjeto() {
		return this.numeroProjeto;
	}
	
	private void setNumeroProjeto(String numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}

	public String obterDespachoFinanciamento() {
		escrever("Insira o número de projeto");
		setNumeroProjeto(ler());
		escrever("1 - Incentivo\n2 - Bonificação\n\nInsira o tipo de projeto");
		setTipoProjeto(ler());
		switch(tipoProjeto) {
			case "Incentivo":
				escrever("Indique o custo elegivel");
				setCustoElegivel(ler());
				escrever("Indique o montante de Financiamento");
				setMontanteFinanciamento(ler());
				escrever("Indique o prazo (yyyy.mm.dd)");
				setPrazo(ler());
				break;
			case "Bonificação":
				escrever("Indique a taxa de bonificação");
				setTaxaBonificacao(ler());
				escrever("Indique o montante maximo");
				setMontanteMaximo(ler());
				escrever("Indique o periodo máximo");
				setPeriodoMaximo(ler());
				break;
		}
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

	private void setDecisao(String decisao) { this.decisao = decisao; }
	private String getDecisao() { return this.periodoMaximo; }
	
	private void setPeriodoMaximo(String periodoMaximo) { this.periodoMaximo = periodoMaximo; }
	private String getPeriodoMaximo() { return this.periodoMaximo; }
	
	private void setMontanteMaximo(String montanteMaximo) { this.montanteMaximo = montanteMaximo; }
	private String getMontanteMaximo() { return this.montanteMaximo; }
	
	private void setTaxaBonificacao(String taxaBonificacao) { this.taxaBonificacao = taxaBonificacao; }
	private String getTaxaBonificacao() { return this.taxaBonificacao; }

	private void setPrazo(String prazo) { this.prazo = prazo; }
	private String getPrazo() { return this.prazo; }

	private void setMontanteFinanciamento(String montanteFinanciamento) { this.montanteFinanciamento = montanteFinanciamento;	}
	private String getMontanteFinanciamento() { return this.montanteFinanciamento; }
	
	private void setCustoElegivel(String custoElegivel) { this.custoElegivel = custoElegivel; }
	private String getCustoElegivel() { return this.custoElegivel; }

	private void setTipoProjeto(String tipoProjeto) {
		switch(tipoProjeto) {
		case "1":
			this.tipoProjeto = "Incentivo";
			break;
		case "2":
			this.tipoProjeto = "Bonificação";
			break;
		}	
	}
}
