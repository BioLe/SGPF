package Apresentacao;

import Apresentacao.Autenticacao.*;
import Apresentacao.ComissaoFinanciamento.PresenterMenuComissaoFinanciamento;
import Apresentacao.GestorFinanciamento.PresenterMenuGestorFinanciamento;
import Apresentacao.Tecnico.PresenterMenuTecnico;
import Apresentacao.Tecnico.ViewMenuTecnico;

public class GestorApresentacao {

	//Presenters
	private ApresentadorAutenticacao presenterAutenticacao;
	
	public GestorApresentacao() {
		presenterAutenticacao = new ApresentadorAutenticacao();	
	}
}
