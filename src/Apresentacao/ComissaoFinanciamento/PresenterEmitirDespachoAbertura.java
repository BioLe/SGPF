package Apresentacao.ComissaoFinanciamento;

import Apresentacao.GestorFinanciamento.ViewEfetuarPagamento;

public class PresenterEmitirDespachoAbertura {
	
	//View
	private ViewEmitirDespachoAbertura viewEmitirDespachoAbertura;
	
	public PresenterEmitirDespachoAbertura() {
		viewEmitirDespachoAbertura = new ViewEmitirDespachoAbertura();
	}

	public void obterDespachoAbertura() {
		viewEmitirDespachoAbertura.obterDespachoAbertura();
	}

}
