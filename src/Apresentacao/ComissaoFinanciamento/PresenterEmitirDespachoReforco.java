package Apresentacao.ComissaoFinanciamento;

public class PresenterEmitirDespachoReforco {
	
		//View
		private ViewEmitirDespachoReforco viewEmitirDespachoReforco;
		
		public PresenterEmitirDespachoReforco() {
			viewEmitirDespachoReforco = new ViewEmitirDespachoReforco();
		}
		
		public void obterDespachoReforco() {
			viewEmitirDespachoReforco.obterDespachoReforco();
		}
}
