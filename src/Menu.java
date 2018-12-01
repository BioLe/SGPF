import java.util.LinkedHashMap;

import Apresentacao.Presenter.Presenter;

public class Menu {
	
	private LinkedHashMap<String, String> menu = new LinkedHashMap<String, String>();
	private Presenter presenter;
	
	public Menu(Presenter presenter) {
		//Menu principal
		menu.put("Aceitar candidatura", "1");
		menu.put("Abrir projecto","2");
		menu.put("..............","3");
		menu.put("Ação?", "");
		this.presenter = presenter;
	}
	
	void apresentarMenu() {
		this.menu = presenter.iterarDicionario(menu);
		switch(menu.get("Ação?")) {
			case "1":
				AceitarCandidatura aceitarCandidatura = new AceitarCandidatura(presenter);
				aceitarCandidatura.apresentarAceitarCandidatura();
				break;
		}
	}
}
