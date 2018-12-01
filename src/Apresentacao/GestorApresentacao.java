package Apresentacao;

import Apresentacao.Autenticacao.ViewAutenticacao;
import Apresentacao.ComissaoFinanciamento.PresenterMenuComissaoFinanciamento;
import Apresentacao.GestorFinanciamento.PresenterMenuGestorFinanciamento;
import Apresentacao.Tecnico.PresenterMenuTecnico;
import Apresentacao.Tecnico.ViewMenuTecnico;

public class GestorApresentacao {
	private ViewCabecalho viewCabecalho;
	private ViewAutenticacao viewAutenticacao;
	private PresenterMenuTecnico presenterMenuTecnico;
	private PresenterMenuGestorFinanciamento presenterMenuGestorFinanciamento;
	private PresenterMenuComissaoFinanciamento presenterMenuComissaoFinanciamento;
	 
	
	public GestorApresentacao() {
		//
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
	
	//fazer o switch para escolher
	public void mostrarMenu(String cargo) {
		
		switch(cargo) {
			case "Técnico":
				viewCabecalho.apresentar();
				presenterMenuTecnico.MostrarMenu();
				break;
				
			case "Gestor de Financiamento":
				viewCabecalho.apresentar();
				presenterMenuGestorFinanciamento.MostrarMenu();
				break;
				
			case "Comissão de Financiamento":
				viewCabecalho.apresentar();
				presenterMenuComissaoFinanciamento.MostrarMenu();
				break;
		}
	}
	
	

}
