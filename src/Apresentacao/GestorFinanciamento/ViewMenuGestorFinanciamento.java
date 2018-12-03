package Apresentacao.GestorFinanciamento;

import Apresentacao.View;

public class ViewMenuGestorFinanciamento extends View {
	
	private String opcao;

	public String mostrarMenu() {
		escrever("1 - Pedir Refor�o");
		escrever("2 - Efetuar Pagamento");
		escrever("3 - Ver Relat�rio");
		escrever("4 - Suspender Projeto");
		escrever("5 - Reativar Projeto");
		escrever("6 - Mudar de Utilizador");
		escrever("7 - For�ar Fecho de Projeto");
		escrever("8 - Terminar");
		escrever("\nInsira a sua op��o");
		setOpcao(ler());
		return getOpcao();
	}
	
	public String getOpcao() {
		return this.opcao;
	}
	
	private void setOpcao(String opcao) {
		this.opcao = opcao;
	}
}
