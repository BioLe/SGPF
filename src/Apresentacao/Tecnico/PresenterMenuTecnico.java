package Apresentacao.Tecnico;

import Apresentacao.Autenticacao.ApresentadorAutenticacao;
import Apresentacao.Autenticacao.VistaAutenticacao;
import Apresentacao.GestaoEstadoProjeto.PresenterSelecionarProjeto;

public class PresenterMenuTecnico {
	
	private boolean toFinish;
	
	//Views
	private ViewMenuTecnico viewMenuTecnico;

	//Presenters
	private ApresentadorAutenticacao presenterAutenticacao;
	private PresenterAceitarCandidatura presenterAceitarCandidatura;
	private PresenterSelecionarProjeto presenterSelecionarProjeto;
	private PresenterEmitirParecerTecnico presenterEmitirParecerTecnico;
	
	public PresenterMenuTecnico(ApresentadorAutenticacao presenterAutenticacao){
		this.presenterAutenticacao = presenterAutenticacao;
		toFinish = false;
		
		//Views
		viewMenuTecnico = new ViewMenuTecnico();
		
		//Presenters
		//presenterAutenticacao = new PresenterAutenticacao();
		presenterAceitarCandidatura = new PresenterAceitarCandidatura();
		presenterSelecionarProjeto = new PresenterSelecionarProjeto();
		presenterEmitirParecerTecnico = new PresenterEmitirParecerTecnico();
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
				case "7": // Emitir Parecer Técnico
					presenterEmitirParecerTecnico.obterParecerTecnico();
					break;
				case "8": //Mudar de Utilizador
					//TODO - BIG RECURSIVE PROBLEM
					toFinish = true;
					presenterAutenticacao.obterAutenticacao();
					break;
				case "9": //Forçar Fecho do Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "10": //Terminar
					toFinish = true;
					System.out.println("Bye human.");
					System.exit(0);
					break;
			}
		}
	}
}
