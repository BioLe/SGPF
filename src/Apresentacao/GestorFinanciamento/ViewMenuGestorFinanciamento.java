package Apresentacao.GestorFinanciamento;

import Apresentacao.View;

public class ViewMenuGestorFinanciamento extends View {
	
	private String opcao;

	public String mostrarMenu() {
		escrever("1 - Pedir Reforço");
		escrever("2 - Efetuar Pagamento");
		escrever("3 - Ver Relatório");
		escrever("4 - Suspender Projeto");
		escrever("5 - Reativar Projeto");
		escrever("6 - Mudar de Utilizador");
		escrever("7 - Forçar Fecho de Projeto");
		escrever("8 - Terminar");
		escrever("\nInsira a sua opção");
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
