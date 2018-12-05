package Apresentacao.ComissaoFinanciamento;

import Apresentacao.GestorFinanciamento.ViewEfetuarPagamento;

public class PresenterEmitirDespachoFinanciamento {
	
	//View
	private ViewEmitirDespachoFinanciamento viewEmitirDespachoFinanciamento;
	
	public PresenterEmitirDespachoFinanciamento() {
		viewEmitirDespachoFinanciamento = new ViewEmitirDespachoFinanciamento();
	}

	public void obterDespachoFinanciamento() {
		viewEmitirDespachoFinanciamento.obterDespachoFinanciamento();
	}

}
