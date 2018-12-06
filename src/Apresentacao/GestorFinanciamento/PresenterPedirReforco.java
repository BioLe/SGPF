package Apresentacao.GestorFinanciamento;

public class PresenterPedirReforco {
	
	//View
	private ViewPedirReforco viewPedirReforco;
	
	public PresenterPedirReforco() {
		this.viewPedirReforco = new ViewPedirReforco();
	}

	public void pedirReforco() {
		viewPedirReforco.pedirReforco();	
	}
}
