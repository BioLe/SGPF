package Apresentacao.ComissaoFinanciamento;

import Apresentacao.View;

public class ViewMenuComissaoFinanciamento extends View {

	private String opcao;

	public String mostrarMenu() {
		escrever("1 - Emitir Despacho Abertura");
		escrever("2 - Emitir Despacho Financiamento");
		escrever("3 - Emitir Despacho Refor�o");
		escrever("4 - Ver Relat�rio de Projeto");
		escrever("5 - Ver Relat�rio de Pagamentos");
		escrever("6 - Suspender Projeto");
		escrever("7 - Reativar Projeto");
		escrever("8 - Mudar de Utilizador");
		escrever("9 - For�ar Fecho de Projeto");
		escrever("10 - Terminar");
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
