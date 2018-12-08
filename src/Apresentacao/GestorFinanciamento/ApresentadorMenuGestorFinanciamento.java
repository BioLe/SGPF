package Apresentacao.GestorFinanciamento;

import Apresentacao.Autenticacao.ApresentadorAutenticacao;
import Apresentacao.GestaoEstadoProjeto.ApresentadorSelecionarProjeto;

public class ApresentadorMenuGestorFinanciamento {
		
	private boolean toFinish;
	
	//Views
	private VistaMenuGestorFinanciamento viewMenuGestorFinanciamento;

	//Presenters
	private ApresentadorAutenticacao presenterAutenticacao;
	private ApresentadorPedirReforco presenterPedirReforco;
	private ApresentadorEfetuarPagamento presenterEfeuarPagamento;
	private ApresentadorVerRelatorioProjeto presenterVerRelatorioProjeto;
	private ApresentadorVerRelatorioPagamentos presenterVerRelatorioPagamentos;
	private ApresentadorSelecionarProjeto presenterSelecionarProjeto;
	
	public ApresentadorMenuGestorFinanciamento(ApresentadorAutenticacao presenterAutenticacao) {
		this.presenterAutenticacao = presenterAutenticacao;
		this.toFinish = false;
		
		//Views
		viewMenuGestorFinanciamento = new VistaMenuGestorFinanciamento();
		
		//Presenters
		//presenterAutenticacao = new PresenterAutenticacao();
		presenterSelecionarProjeto = new ApresentadorSelecionarProjeto();
		presenterPedirReforco = new ApresentadorPedirReforco();
		presenterEfeuarPagamento = new ApresentadorEfetuarPagamento();
		presenterVerRelatorioPagamentos = new ApresentadorVerRelatorioPagamentos();
		presenterVerRelatorioProjeto = new ApresentadorVerRelatorioProjeto();
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
