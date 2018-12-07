package LogicaAplicacional;
import java.util.LinkedHashMap;

public class Model {
	
	private LinkedHashMap<String, String> aceitarCandidatura = new LinkedHashMap<String, String>();
	private LinkedHashMap<String, String> menu = new LinkedHashMap<String, String>();
	
	public LinkedHashMap getAceitarCandidatura() {
		return aceitarCandidatura;
	}
	
	public LinkedHashMap getMenu() {
		return menu;
	}
	
	
	public Model(){
		
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
	
	

}
