package Apresentacao.Autenticacao;

import Apresentacao.VistaCabecalho;
import Apresentacao.Autenticacao.VistaAutenticacao;
import Apresentacao.ComissaoFinanciamento.ApresentadorMenuComissaoFinanciamento;
import Apresentacao.GestorFinanciamento.ApresentadorMenuGestorFinanciamento;
import Apresentacao.Tecnico.ApresentadorMenuTecnico;

public class ApresentadorAutenticacao {
	
	private boolean toFinish;
	
	//Views
	private VistaAutenticacao viewAutenticacao;
	private VistaCabecalho viewCabecalho;
	
	//Presenters
	private ApresentadorMenuTecnico presenterMenuTecnico;
	private ApresentadorMenuGestorFinanciamento presenterMenuGestorFinanciamento;
	private ApresentadorMenuComissaoFinanciamento presenterMenuComissaoFinanciamento;
	
	public ApresentadorAutenticacao() {
		
		this.toFinish = false;

		//Views
		this.viewAutenticacao = new VistaAutenticacao();
		viewCabecalho = new VistaCabecalho();
		
		//Presenters sucessores
		presenterMenuTecnico = new ApresentadorMenuTecnico(this);
		presenterMenuGestorFinanciamento = new ApresentadorMenuGestorFinanciamento(this);
		presenterMenuComissaoFinanciamento = new ApresentadorMenuComissaoFinanciamento(this);
		
		viewAutenticacao = new VistaAutenticacao();	
		obterAutenticacao();
		
	}

	public void obterAutenticacao() {
		//while(!toFinish) {
		System.out.println("ObterAuth");
			viewAutenticacao.obterAutenticacao();
		System.out.println("ObtiAuth");
			viewCabecalho.setCargo(viewAutenticacao.getCargo());
			viewCabecalho.setNome(viewAutenticacao.getNome());
			mostrarMenu(viewAutenticacao.getCargo());
		//}
	}
	
	public void mostrarMenu(String cargo) {
		switch(cargo) {
			case "Técnico":
				viewCabecalho.apresentar();
				presenterMenuTecnico.escolherOpcao();
				break;
				
			case "Gestor de Financiamento":
				viewCabecalho.apresentar();
				presenterMenuGestorFinanciamento.escolherOpcao();
				break;
				
			case "Comissão de Financiamento":
				viewCabecalho.apresentar();
				presenterMenuComissaoFinanciamento.escolherOpcao();
				break;
				
			/*default:
				toFinish = true;
				viewAutenticacao.escrever("Bye human.");*/
		}
	}
}
