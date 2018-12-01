package Apresentacao;

public class ViewCabecalho extends View{
	
	private String nome;
	private String cargo;
	
	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void apresentar() {
		escrever("Cargo: " + getCargo());
		escrever("Nome: " + getNome() + "\n");
	}
}
