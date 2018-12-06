package Apresentacao.Tecnico;

public class PresenterEmitirParecerTecnico {
	
	private ViewEmitirParecerTecnico viewEmitirParecerTecnico;
	
	public PresenterEmitirParecerTecnico() {
		viewEmitirParecerTecnico = new ViewEmitirParecerTecnico();
	}

	public void obterParecerTecnico() {
		viewEmitirParecerTecnico.obterParecerTecnico();
	}
}
