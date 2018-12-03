package Apresentacao.Tecnico;

import Apresentacao.Autenticacao.PresenterAutenticacao;
import Apresentacao.Autenticacao.ViewAutenticacao;
import GestaoEstadoProjeto.PresenterSelecionarProjeto;

public class PresenterMenuTecnico {
	
	private boolean toFinish;
	
	//Views
	private ViewMenuTecnico viewMenuTecnico;

	//Presenters
	private PresenterAutenticacao presenterAutenticacao;
	private PresenterAceitarCandidatura presenterAceitarCandidatura;
	private PresenterSelecionarProjeto presenterSelecionarProjeto;
	
	public PresenterMenuTecnico(){
		
		this.toFinish = false;
		
		//Views
		viewMenuTecnico = new ViewMenuTecnico();
		
		//Presenters
		//presenterAutenticacao = new PresenterAutenticacao();
		presenterAceitarCandidatura = new PresenterAceitarCandidatura();
		presenterSelecionarProjeto = new PresenterSelecionarProjeto();
	}
	
	public void escolherOpcao() {
		String opcao;
		while(!toFinish) {
			opcao = viewMenuTecnico.mostrarMenu();
			switch(opcao) {
				case "1":
					presenterAceitarCandidatura.obterCandidatura();
					break;
				case "2": //Abrir Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "3": //Arquivar Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "4": //Reenquadrar Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "5": //Suspender Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "6": //Reativar Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "7": //Mudar de Utilizador
					//TODO - BIG RECURSIVE PROBLEM
					//presenterAutenticacao.obterAutenticacao();
					break;
				case "8": //Forçar Fecho do Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "9": //Terminar
					toFinish = true;
					viewMenuTecnico.escrever("Bye");
					break;
				
			}
		}
	}
}
