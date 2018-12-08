package Apresentacao.ComissaoFinanciamento;

import Apresentacao.GestorFinanciamento.VistaEfetuarPagamento;

public class ApresentadorEmitirDespachoAbertura {
	
	//View
	private VistaEmitirDespachoAbertura viewEmitirDespachoAbertura;
	
	public ApresentadorEmitirDespachoAbertura() {
		viewEmitirDespachoAbertura = new VistaEmitirDespachoAbertura();
	}

	public void obterDespachoAbertura() {
		viewEmitirDespachoAbertura.obterDespachoAbertura();
	}

}
