package Apresentacao.GestorFinanciamento;

public class PresenterEfetuarPagamento {
	
	//View
	private ViewEfetuarPagamento viewEfetuarPagamento;
	
	public PresenterEfetuarPagamento() {
		this.viewEfetuarPagamento = new ViewEfetuarPagamento();
	}

	public void efetuarPagamento() {
		viewEfetuarPagamento.efetuarPagamento();	
	}
}
