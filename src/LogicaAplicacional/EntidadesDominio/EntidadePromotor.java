package LogicaAplicacional.EntidadesDominio;

public class EntidadePromotor {
	
	private String nome;
	private String nif;
	private String nacionalidade;
	private String telefone;
	private String email;
	
	public EntidadePromotor(String nome, String nif, String nacionalidade, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getNif() { return nif; }
	public void setNif(String nif) { this.nif = nif; }
	
	public String getNacionalidade() { return nacionalidade; }
	public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

	public String getTelefone() { return telefone; }
	public void setTelefone(String telefone) { this.telefone = telefone; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
}
