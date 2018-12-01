import java.util.Arrays;
import java.util.LinkedHashMap;

import Apresentacao.Presenter.Presenter;

public class Login {

	private Presenter presenter;
	private LinkedHashMap<String, String> login = new LinkedHashMap<String, String>();

	public Login(Presenter presenter) {
		this.presenter = presenter;

		login.put("Cargo (T�cnico, Gestor de Financiamento ou Comiss�o de Financiamento)", "");
		login.put("Nome", "");
	}
	
	void apresentarLogin() {
		this.login = presenter.iterarDicionario(login);
	}

}
