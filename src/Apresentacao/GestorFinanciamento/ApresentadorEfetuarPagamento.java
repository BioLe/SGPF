package Apresentacao.GestorFinanciamento;

public class ApresentadorEfetuarPagamento {
	
	//View
	private VistaEfetuarPagamento viewEfetuarPagamento;
	
	public ApresentadorEfetuarPagamento() {
		this.viewEfetuarPagamento = new VistaEfetuarPagamento();
	}

	public void efetuarPagamento() {
		viewEfetuarPagamento.efetuarPagamento();	
	}
}
