package Apresentacao.ComissaoFinanciamento;


public class ApresentadorEmitirDespachoFinanciamento {
	
	//View
	private VistaEmitirDespachoFinanciamento viewEmitirDespachoFinanciamento;
	
	public ApresentadorEmitirDespachoFinanciamento() {
		viewEmitirDespachoFinanciamento = new VistaEmitirDespachoFinanciamento();
	}

	public void obterDespachoFinanciamento() {
		viewEmitirDespachoFinanciamento.obterDespachoFinanciamento();
	}

}
