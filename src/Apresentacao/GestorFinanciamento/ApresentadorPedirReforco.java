package Apresentacao.GestorFinanciamento;

public class ApresentadorPedirReforco {
	
	//View
	private VistaPedirReforco viewPedirReforco;
	
	public ApresentadorPedirReforco() {
		this.viewPedirReforco = new VistaPedirReforco();
	}

	public void pedirReforco() {
		viewPedirReforco.pedirReforco();	
	}
}
