package Apresentacao.ComissaoFinanciamento;

import Apresentacao.Autenticacao.ApresentadorAutenticacao;
import Apresentacao.GestaoEstadoProjeto.ApresentadorSelecionarProjeto;
import Apresentacao.GestorFinanciamento.ApresentadorEfetuarPagamento;
import Apresentacao.GestorFinanciamento.ApresentadorPedirReforco;
import Apresentacao.GestorFinanciamento.ApresentadorVerRelatorioPagamentos;
import Apresentacao.GestorFinanciamento.ApresentadorVerRelatorioProjeto;
import Apresentacao.GestorFinanciamento.VistaMenuGestorFinanciamento;

public class ApresentadorMenuComissaoFinanciamento {

private boolean toFinish;
	
	//Views
	private VistaMenuComissaoFinanciamento viewMenuComissaoFinanciamento;

	//Presenters
	private ApresentadorAutenticacao presenterAutenticacao;
	private ApresentadorEmitirDespachoAbertura presenterEmitirDespachoAbertura;
	private ApresentadorEmitirDespachoFinanciamento presenterEmitirDespachoFinanciamento;
	private ApresentadorEmitirDespachoReforco presenterEmitirDespachoReforco;
	private ApresentadorVerRelatorioProjeto presenterVerRelatorioProjeto;
	private ApresentadorVerRelatorioPagamentos presenterVerRelatorioPagamentos;
	private ApresentadorSelecionarProjeto presenterSelecionarProjeto;
	
	public ApresentadorMenuComissaoFinanciamento(ApresentadorAutenticacao presenterAutenticacao) {
		this.presenterAutenticacao = presenterAutenticacao;
		this.toFinish = false;
		
		//Views
		viewMenuComissaoFinanciamento = new VistaMenuComissaoFinanciamento();
		
		//Presenters
		//presenterAutenticacao = new PresenterAutenticacao();
		presenterEmitirDespachoAbertura = new ApresentadorEmitirDespachoAbertura();
		presenterEmitirDespachoFinanciamento = new ApresentadorEmitirDespachoFinanciamento();
		presenterEmitirDespachoReforco = new ApresentadorEmitirDespachoReforco();
		presenterVerRelatorioPagamentos = new ApresentadorVerRelatorioPagamentos();
		presenterVerRelatorioProjeto = new ApresentadorVerRelatorioProjeto();
		presenterSelecionarProjeto = new ApresentadorSelecionarProjeto();
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
