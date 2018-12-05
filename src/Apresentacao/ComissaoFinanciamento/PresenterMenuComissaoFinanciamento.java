package Apresentacao.ComissaoFinanciamento;

import Apresentacao.Autenticacao.PresenterAutenticacao;
import Apresentacao.GestaoEstadoProjeto.PresenterSelecionarProjeto;
import Apresentacao.GestorFinanciamento.PresenterEfetuarPagamento;
import Apresentacao.GestorFinanciamento.PresenterPedirReforco;
import Apresentacao.GestorFinanciamento.PresenterVerRelatorioPagamentos;
import Apresentacao.GestorFinanciamento.PresenterVerRelatorioProjeto;
import Apresentacao.GestorFinanciamento.ViewMenuGestorFinanciamento;

public class PresenterMenuComissaoFinanciamento {

private boolean toFinish;
	
	//Views
	private ViewMenuComissaoFinanciamento viewMenuComissaoFinanciamento;

	//Presenters
	private PresenterEmitirDespachoAbertura presenterEmitirDespachoAbertura;
	private PresenterEmitirDespachoFinanciamento presenterEmitirDespachoFinanciamento;
	private PresenterEmitirDespachoReforco presenterEmitirDespachoReforco;
	private PresenterVerRelatorioProjeto presenterVerRelatorioProjeto;
	private PresenterVerRelatorioPagamentos presenterVerRelatorioPagamentos;
	private PresenterSelecionarProjeto presenterSelecionarProjeto;
	
	public PresenterMenuComissaoFinanciamento() {
		
		this.toFinish = false;
		
		//Views
		viewMenuComissaoFinanciamento = new ViewMenuComissaoFinanciamento();
		
		//Presenters
		//presenterAutenticacao = new PresenterAutenticacao();
		presenterEmitirDespachoAbertura = new PresenterEmitirDespachoAbertura();
		presenterEmitirDespachoFinanciamento = new PresenterEmitirDespachoFinanciamento();
		presenterEmitirDespachoReforco = new PresenterEmitirDespachoReforco();
		presenterVerRelatorioPagamentos = new PresenterVerRelatorioPagamentos();
		presenterVerRelatorioProjeto = new PresenterVerRelatorioProjeto();
		presenterSelecionarProjeto = new PresenterSelecionarProjeto();
	}
	
	public void escolherOpcao() {
		String projeto;
		String opcao;
		while(!toFinish) {
			opcao = viewMenuComissaoFinanciamento.mostrarMenu();
			switch(opcao) {
				case "1": //Emitir Despacho de Abertura
					presenterEmitirDespachoAbertura.obterDespachoAbertura();
					break;
				case "2": //Emitir Despacho de Financiamento
					presenterEmitirDespachoFinanciamento.obterDespachoFinanciamento();
					break;
				case "3": //Emitir Despacho de Reforço
					presenterEmitirDespachoReforco.obterDespachoReforco();
					break;
				case "4": //Ver Relatorio de Projeto
					//presenterVerRelatorioProjeto.selecionarProjeto();
					break;
				case "5": //Ver Relatorio de Pagamentos
					//presenterVerRelatorioPagamentos.selecionarProjeto();
					break;
				case "6": //Suspender Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "7": //Reativar Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "8": //Mudar de Utilizador
					//TODO - BIG RECURSIVE PROBLEM
					//presenterAutenticacao.obterAutenticacao();
					break;
				case "9": //Forçar Fecho do Projeto
					presenterSelecionarProjeto.selecionarProjeto();
					break;
				case "10": //Terminar
					toFinish = true;
					viewMenuComissaoFinanciamento.escrever("Bye human.");
					break;
				
			}
		}
	}
}
