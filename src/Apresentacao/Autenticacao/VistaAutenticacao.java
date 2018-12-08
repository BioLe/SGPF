package Apresentacao.Autenticacao;

import Apresentacao.Vista;

public class VistaAutenticacao extends Vista {

	private String nome;
	private String cargo;

	public void obterAutenticacao() {
		escrever("Insira o seu nome:");
		nome = ler();
		
		escolherCargo();	
	}
	
	public String escolherCargo() {
		escrever("Insira o n�mero do seu cargo\n 1 - T�cnico\n 2 - Gestor de Financiamento\n 3 - Comiss�o de Financiamento \n");
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
				
			default:
				escolherCargo();
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
