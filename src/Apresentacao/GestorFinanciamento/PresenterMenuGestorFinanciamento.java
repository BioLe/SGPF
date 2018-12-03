package Apresentacao.GestorFinanciamento;

import Apresentacao.Autenticacao.PresenterAutenticacao;
import GestaoEstadoProjeto.PresenterSelecionarProjeto;

public class PresenterMenuGestorFinanciamento {
		
	private boolean toFinish;
	
	//Views
	private ViewMenuGestorFinanciamento viewMenuGestorFinanciamento;

	//Presenters
	private PresenterAutenticacao presenterAutenticacao;
	private PresenterPedirReforco presenterPedirReforco;
	private PresenterRealizarPagamento presenterRealizarPagamento;
	private PresenterVerRelatorioProjeto presenterVerRelatorioProjeto;
	private PresenterVerRelatorioPagamentos presenterVerRelatorioPagamentos;
	private PresenterSelecionarProjeto presenterSelecionarProjeto;
	
	public PresenterMenuGestorFinanciamento() {
		
		this.toFinish = false;
		
		//Views
		viewMenuGestorFinanciamento = new ViewMenuGestorFinanciamento();
		
		//Presenters
		//presenterAutenticacao = new PresenterAutenticacao();
		presenterSelecionarProjeto = new PresenterSelecionarProjeto();
		presenterPedirReforco = new PresenterPedirReforco();
		presenterRealizarPagamento = new PresenterRealizarPagamento();
		presenterVerRelatorioPagamentos = new PresenterVerRelatorioPagamentos();
		presenterVerRelatorioProjeto = new PresenterVerRelatorioProjeto();
	}
	
	public void escolherOpcao() {
		String projeto;
		String opcao;
		while(!toFinish) {
			opcao = viewMenuGestorFinanciamento.mostrarMenu();
			switch(opcao) {
				case "1": //Pedir Reforço
					presenterPedirReforco.pedirReforco();
					break;
				case "2": //Realizar Pagamento
					presenterRealizarPagamento.selecionarProjeto();
					break;
				case "3": //Ver Relatorio Projeto
					//presenterVerRelatorioProjeto.selecionarProjeto();
					break;
				case "4": //Ver Relatorio de Pagamentos
					//presenterVerRelatorioPagamentos.selecionarProjeto();
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
					viewMenuGestorFinanciamento.escrever("Bye human.");
					break;
				
			}
		}
	}
}
