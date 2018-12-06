package Apresentacao.Autenticacao;

import Apresentacao.ViewCabecalho;
import Apresentacao.ComissaoFinanciamento.PresenterMenuComissaoFinanciamento;
import Apresentacao.GestorFinanciamento.PresenterMenuGestorFinanciamento;
import Apresentacao.Tecnico.PresenterMenuTecnico;

public class PresenterAutenticacao {
	
	private boolean toFinish;
	
	//Views
	private ViewAutenticacao viewAutenticacao;
	private ViewCabecalho viewCabecalho;
	
	//Presenters
	private PresenterMenuTecnico presenterMenuTecnico;
	private PresenterMenuGestorFinanciamento presenterMenuGestorFinanciamento;
	private PresenterMenuComissaoFinanciamento presenterMenuComissaoFinanciamento;
	
	public PresenterAutenticacao() {
		
		this.toFinish = false;

		//Views
		this.viewAutenticacao = new ViewAutenticacao();
		viewCabecalho = new ViewCabecalho();
		
		//Presenters sucessores
		presenterMenuTecnico = new PresenterMenuTecnico(this);
		presenterMenuGestorFinanciamento = new PresenterMenuGestorFinanciamento(this);
		presenterMenuComissaoFinanciamento = new PresenterMenuComissaoFinanciamento(this);
		
		viewAutenticacao = new ViewAutenticacao();	
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
			case "T�cnico":
				viewCabecalho.apresentar();
				presenterMenuTecnico.escolherOpcao();
				break;
				
			case "Gestor de Financiamento":
				viewCabecalho.apresentar();
				presenterMenuGestorFinanciamento.escolherOpcao();
				break;
				
			case "Comiss�o de Financiamento":
				viewCabecalho.apresentar();
				presenterMenuComissaoFinanciamento.escolherOpcao();
				break;
				
			/*default:
				toFinish = true;
				viewAutenticacao.escrever("Bye human.");*/
		}
	}
}
