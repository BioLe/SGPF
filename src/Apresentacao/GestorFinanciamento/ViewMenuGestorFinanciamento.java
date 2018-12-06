package Apresentacao.GestorFinanciamento;

import Apresentacao.View;

public class ViewMenuGestorFinanciamento extends View {
	
	private String opcao;

	public String mostrarMenu() {
		escrever("1 - Pedir Refor�o");
		escrever("2 - Efetuar Pagamento");
		escrever("3 - Ver Relat�rio de Projeto");
		escrever("4 - Ver Relatorio de Pagamentos");
		escrever("5 - Suspender Projeto");
		escrever("6 - Reativar Projeto");
		escrever("7 - Mudar de Utilizador");
		escrever("8 - For�ar Fecho de Projeto");
		escrever("9 - Terminar");
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