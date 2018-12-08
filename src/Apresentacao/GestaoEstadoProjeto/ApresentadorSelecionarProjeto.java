package Apresentacao.GestaoEstadoProjeto;

public class ApresentadorSelecionarProjeto {
	private VistaSelecionarProjeto viewSelecionarProjeto;
	
	public ApresentadorSelecionarProjeto() {
		this.viewSelecionarProjeto = new VistaSelecionarProjeto();
	}

	public String selecionarProjeto() {
		return viewSelecionarProjeto.selecionarProjeto();
	}
}
