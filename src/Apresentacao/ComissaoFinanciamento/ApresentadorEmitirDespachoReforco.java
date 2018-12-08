package Apresentacao.ComissaoFinanciamento;

import Apresentacao.ComissaoFinanciamento.VistaEmitirDespachoReforco;

public class ApresentadorEmitirDespachoReforco {
	
		//View
		private VistaEmitirDespachoReforco viewEmitirDespachoReforco;
		
		public ApresentadorEmitirDespachoReforco() {
			viewEmitirDespachoReforco = new VistaEmitirDespachoReforco();
		}
		
		public void obterDespachoReforco() {
			viewEmitirDespachoReforco.obterDespachoReforco();
		}
}
