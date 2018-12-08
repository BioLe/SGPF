package Apresentacao;

import Apresentacao.Autenticacao.*;
import Apresentacao.ComissaoFinanciamento.ApresentadorMenuComissaoFinanciamento;
import Apresentacao.GestorFinanciamento.ApresentadorMenuGestorFinanciamento;
import Apresentacao.Tecnico.ApresentadorMenuTecnico;
import Apresentacao.Tecnico.VistaMenuTecnico;

public class GestorApresentacao {

	//Presenters
	private ApresentadorAutenticacao presenterAutenticacao;
	
	public GestorApresentacao() {
		presenterAutenticacao = new ApresentadorAutenticacao();	
	}
}
