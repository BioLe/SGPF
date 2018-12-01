import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AceitarCandidatura {
	
	//Scanner sc = new Scanner(System.in);
	private LinkedHashMap<String, String> aceitarCandidatura = new LinkedHashMap<String, String>();
	private Presenter presenter;
	
	public AceitarCandidatura(Presenter presenter) {
		
		this.presenter = presenter;
		
		//Exemplo de um objecto recebido da classe modelo.
		aceitarCandidatura.put("ID do Projeto", "1");
		aceitarCandidatura.put("Data","22/11/1850");
		aceitarCandidatura.put("\nDados de Projeto", "\n");
		aceitarCandidatura.put("Nome Projeto", "");
		aceitarCandidatura.put("Tipo de Projeto (Incentivo, Bonifica��o)","");
		aceitarCandidatura.put("Descri��o","");
		aceitarCandidatura.put("Montante Solicitado", "");
		aceitarCandidatura.put("NIB", "");
		aceitarCandidatura.put("\nDados do Promotor", "\n");
		aceitarCandidatura.put("Nome do promotor", "");
		aceitarCandidatura.put("NIF", "");
		aceitarCandidatura.put("Nacionalidade", "");
		aceitarCandidatura.put("Telefone do promotor", "");
		aceitarCandidatura.put("Email do promotor", "");
		aceitarCandidatura.put("\nDados do Respons�vel pelos Contactos", "\n");
		aceitarCandidatura.put("Nome do respons�vel", "");
		aceitarCandidatura.put("Telefone do respons�vel", "");
		aceitarCandidatura.put("Email do respons�vel", "");
	}
	
	void apresentarAceitarCandidatura() {
		this.aceitarCandidatura = presenter.iterarDicionario(aceitarCandidatura);
		System.out.println("\n" + Arrays.asList(aceitarCandidatura));
	}
	
	/*public void aceitarCandidatura(String utilizadorAutenticado) {
		System.out.println("Utilizador: " + utilizadorAutenticado + "\n"
				+"Ac��o: Aceitar Candidatura \n"
				+"N�mero de Projeto");

		int nrProjeto = sc.nextInt();
		
		System.out.println("Data: ");
		
	}*/
}
