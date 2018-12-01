package Apresentacao.Tecnico;

public class PresenterMenuTecnico {
	
	private ViewMenuTecnico viewMenuTecnico;
	//TODO criar os presenters de todas as funcionalidades do menu
	private PresenterAceitarCandidatura presenterAceitarCandidatura;
	//private PresenterAbrirProjeto presenterAbrirProjecto;
	
	
	public PresenterMenuTecnico(){
		viewMenuTecnico = new ViewMenuTecnico();
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
