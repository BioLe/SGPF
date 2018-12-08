package Apresentacao.GestorFinanciamento;

import Apresentacao.Autenticacao.ApresentadorAutenticacao;
import Apresentacao.GestaoEstadoProjeto.PresenterSelecionarProjeto;

public class PresenterMenuGestorFinanciamento {
		
	private boolean toFinish;
	
	//Views
	private ViewMenuGestorFinanciamento viewMenuGestorFinanciamento;

	//Presenters
	private ApresentadorAutenticacao presenterAutenticacao;
	private PresenterPedirReforco presenterPedirReforco;
	private PresenterEfetuarPagamento presenterEfeuarPagamento;
	private PresenterVerRelatorioProjeto presenterVerRelatorioProjeto;
	private PresenterVerRelatorioPagamentos presenterVerRelatorioPagamentos;
	private PresenterSelecionarProjeto presenterSelecionarProjeto;
	
	public PresenterMenuGestorFinanciamento(ApresentadorAutenticacao presenterAutenticacao) {
		this.presenterAutenticacao = presenterAutenticacao;
		this.toFinish = false;
		
		//Views
		viewMenuGestorFinanciamento = new ViewMenuGestorFinanciamento();
		
		//Presenters
		//presenterAutenticacao = new PresenterAutenticacao();
		presenterSelecionarProjeto = new PresenterSelecionarProjeto();
		presenterPedirReforco = new PresenterPedirReforco();
		presenterEfeuarPagamento = new PresenterEfetuarPagamento();
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
					presenterEfeuarPagamento.efetuarPagamento();
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
					toFinish = true;
					presenterAutenticacao.obterAutenticacao();
					break;
				case "8": //Forçar Fecho do Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "9": //Terminar
					toFinish = true;
					System.out.println("Bye human.");
					System.exit(0);
					break;
				
			}
		}
	}
}
