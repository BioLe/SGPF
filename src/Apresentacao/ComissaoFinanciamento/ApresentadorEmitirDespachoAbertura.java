package Apresentacao.ComissaoFinanciamento;

import Apresentacao.GestorFinanciamento.ViewEfetuarPagamento;

public class ApresentadorEmitirDespachoAbertura {
	
	//View
	private ViewEmitirDespachoAbertura viewEmitirDespachoAbertura;
	
	public ApresentadorEmitirDespachoAbertura() {
		viewEmitirDespachoAbertura = new ViewEmitirDespachoAbertura();
	}

	public void obterDespachoAbertura() {
		viewEmitirDespachoAbertura.obterDespachoAbertura();
	}

}
