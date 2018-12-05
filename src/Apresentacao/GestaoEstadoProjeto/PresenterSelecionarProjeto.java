package Apresentacao.GestaoEstadoProjeto;

public class PresenterSelecionarProjeto {
	private ViewSelecionarProjeto viewSelecionarProjeto;
	
	public PresenterSelecionarProjeto() {
		this.viewSelecionarProjeto = new ViewSelecionarProjeto();
	}

	public String selecionarProjeto() {
		return viewSelecionarProjeto.selecionarProjeto();
	}
}
