package Apresentacao.Tecnico;

import Apresentacao.Vista;

public class VistaEmitirParecerTecnico extends Vista {
	
	private String decisao;
	private String descricao;

	public String getDecisao() {
		return this.decisao;
	}
	
	private void setDecisao(String decisao) {
		this.decisao = decisao;
	}

	public String obterParecerTecnico() {
		escrever("Insira a descricao do parecer");
		setDescricao(ler());
		escrever("1 - Favoravel\n2 - Desfavoravel\nInsira a decisao");
		setDecisao(ler());
		switch (getDecisao()) {
		case "1":
			setDecisao("Favoravel");
			break;
		case "2":
			setDecisao("Desfavoravel");
			break;
		}
		return "TODO";
	}


	private void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	private String getDescricao() {
		return this.descricao;
	}
}
