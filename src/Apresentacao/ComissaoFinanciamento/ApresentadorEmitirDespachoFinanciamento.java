package Apresentacao.ComissaoFinanciamento;

import Apresentacao.GestorFinanciamento.ViewEfetuarPagamento;

public class ApresentadorEmitirDespachoFinanciamento {
	
	//View
	private ViewEmitirDespachoFinanciamento viewEmitirDespachoFinanciamento;
	
	public ApresentadorEmitirDespachoFinanciamento() {
		viewEmitirDespachoFinanciamento = new ViewEmitirDespachoFinanciamento();
	}

	public void obterDespachoFinanciamento() {
		viewEmitirDespachoFinanciamento.obterDespachoFinanciamento();
	}

}
