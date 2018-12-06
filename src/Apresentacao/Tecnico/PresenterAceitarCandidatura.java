package Apresentacao.Tecnico;

public class PresenterAceitarCandidatura {
	
	private ViewAceitarCandidatura viewAceitarCandidatura;
	
	public PresenterAceitarCandidatura() {
		viewAceitarCandidatura = new ViewAceitarCandidatura();
	}

	public void obterCandidatura() {
		viewAceitarCandidatura.obterCandidatura();
	}

}
