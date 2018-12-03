package Apresentacao.Autenticacao;

import Apresentacao.ViewCabecalho;
import Apresentacao.ComissaoFinanciamento.PresenterMenuComissaoFinanciamento;
import Apresentacao.GestorFinanciamento.PresenterMenuGestorFinanciamento;
import Apresentacao.Tecnico.PresenterMenuTecnico;

public class PresenterAutenticacao {
	
	//Views
	private ViewAutenticacao viewAutenticacao;
	private ViewCabecalho viewCabecalho;
	
	//Presenters
	private PresenterMenuTecnico presenterMenuTecnico;
	private PresenterMenuGestorFinanciamento presenterMenuGestorFinanciamento;
	private PresenterMenuComissaoFinanciamento presenterMenuComissaoFinanciamento;
	
	public PresenterAutenticacao() {

		//Views
		this.viewAutenticacao = new ViewAutenticacao();
		viewCabecalho = new ViewCabecalho();
		
		//Presenters sucessores
		presenterMenuTecnico = new PresenterMenuTecnico();
		presenterMenuGestorFinanciamento = new PresenterMenuGestorFinanciamento();
		presenterMenuComissaoFinanciamento = new PresenterMenuComissaoFinanciamento();
		
		viewAutenticacao = new ViewAutenticacao();	
		obterAutenticacao();
		mostrarMenu(viewAutenticacao.getCargo());
		
	}

	public void obterAutenticacao() {
		viewAutenticacao.obterAutenticacao();
		viewCabecalho.setCargo(viewAutenticacao.getCargo());
		viewCabecalho.setNome(viewAutenticacao.getNome());
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
		}
	}

}
