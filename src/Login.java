import java.util.Arrays;
import java.util.LinkedHashMap;

import Apresentacao.Presenter.Presenter;

public class Login {

	private Presenter presenter;
	private LinkedHashMap<String, String> login = new LinkedHashMap<String, String>();

	public Login(Presenter presenter) {
		this.presenter = presenter;

		login.put("Cargo (Técnico, Gestor de Financiamento ou Comissão de Financiamento)", "");
		login.put("Nome", "");
	}
	
	void apresentarLogin() {
		this.login = presenter.iterarDicionario(login);
	}

}
