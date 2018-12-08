package Apresentacao.Tecnico;

public class ApresentadorEmitirParecerTecnico {
	
	private VistaEmitirParecerTecnico viewEmitirParecerTecnico;
	
	public ApresentadorEmitirParecerTecnico() {
		viewEmitirParecerTecnico = new VistaEmitirParecerTecnico();
	}

	public void obterParecerTecnico() {
		viewEmitirParecerTecnico.obterParecerTecnico();
	}
}
