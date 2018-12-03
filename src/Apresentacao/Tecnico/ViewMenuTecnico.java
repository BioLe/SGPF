package Apresentacao.Tecnico;

import Apresentacao.View;

public class ViewMenuTecnico extends View {
	
	private String opcao;

	public String mostrarMenu() {
		escrever("1 - Aceitar Candidatura");
		escrever("2 - Abrir Projeto");
		escrever("3 - Arquivar Projeto");
		escrever("4 - Reenquadrar Projeto");
		escrever("5 - Suspender Projeto");
		escrever("6 - Reativar Projeto");
		escrever("7 - Mudar de Utilizador");
		escrever("8 - Forçar Fecho do Projeto");
		escrever("9 - Terminar");
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
