package Apresentacao.Autenticacao;

import Apresentacao.View;

public class VistaAutenticacao extends View {

	private String nome;
	private String cargo;

	public void obterAutenticacao() {
		escrever("Insira o seu nome:");
		nome = ler();
		escrever("Insira o n�mero do seu cargo\n 1 - T�cnico\n 2 - Gestor de Financiamento\n 3 - Comiss�o de Financiamento \n");
		escolherCargo();	
	}
	
	public String escolherCargo() {
		
		switch(ler()) {
			case "1":
				cargo = "T�cnico";
				break;
			
			case "2":
				cargo = "Gestor de Financiamento";
				break;
	
			case "3":
				cargo = "Comiss�o de Financiamento";
				break;
		}
		return "TODO";
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

}
