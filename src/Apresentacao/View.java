package Apresentacao;

import java.util.Scanner;

//Classe View do modelo MVP - Passivo, so escreve na consola e recebe eventos
public class View {
	
	public void escrever(String mensagem) {
        System.out.println(mensagem);
    }

	//obter
    public String ler() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }


}
