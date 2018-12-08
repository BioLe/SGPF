package Apresentacao.Tecnico;

public class ApresentadorAceitarCandidatura {
	
	private VistaAceitarCandidatura viewAceitarCandidatura;
	
	public ApresentadorAceitarCandidatura() {
		viewAceitarCandidatura = new VistaAceitarCandidatura();
	}

	public void obterCandidatura() {
		viewAceitarCandidatura.obterCandidatura();
	}

}
