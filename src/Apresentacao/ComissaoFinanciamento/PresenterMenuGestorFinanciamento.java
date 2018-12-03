package Apresentacao.ComissaoFinanciamento;

import GestaoEstadoProjeto.PresenterAbrirProjeto;

public class PresenterMenuGestorFinanciamento {
	
	//Views
	private ViewMenuGestorFinanciamento viewMenuGestorFinanciamento;
	private ViewPedirReforco viewPedirReforco;
	private ViewEfetuarPagamento viewEfetuarPagamento;
	private ViewVerRelaorio viewVerRelatorio;
	private ViewSuspenderProjeto viewSuspenderProjeto;
	private ViewReativarProjeto viewReativarProjeto;
	
	//Presenters
	private PresenterPedirReforco presenterPedirReforco;
	private PresenterEfetuarPagamento presenterEfetuarPagamento;
	private PresenterVerRelatorio presenterVerRelatorio;
	private PresenterSuspenderProjeto presenterSuspenderProjeto;
	private PresenterReativarProjeto presenterReativarProjeto;
	
	
	
	public PresenterMenuGestorFinanciamento(){
		viewMenuGestorFinanciamento = new ViewMenuGestorFinanciamento();
		presenterAceitarCandidatura = new PresenterAceitarCandidatura();
	}

	public void MostrarMenu() {
		viewMenuTecnico.mostrarMenu();
	}
	
	public void escolherItemMenu(String item) {
		switch(item) {
			case "1":
				presenterAceitarCandidatura.obterCandidatura();
				break;
			case "2":
				
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			case "6":
				
				break;
			case "7":
				
				break;
			case "8":
				
				break;
			case "9":
				
				break;
			
		}
	}

}