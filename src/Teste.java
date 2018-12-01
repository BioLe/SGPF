
import java.util.Scanner;

import Apresentacao.View;
import Apresentacao.Presenter.Presenter;

public class Teste {
	
	static String utilizadorAutenticado = "João das Couves";
	

	public static void main(String[] args) {
		
		View view = new View();
		Presenter presenter = new Presenter(view);
		
		Login login = new Login(presenter);
		login.apresentarLogin();
		Menu menu = new Menu(presenter);
		menu.apresentarMenu();

		/*Scanner sc = new Scanner(System.in);
		int operacao = 0;
		switch (operacao) {
			//Menu
			case 0: 
				System.out.println("Menu\n" 
									+ "1 - Aceitar Candidatura\n" 
									+ "2 - Abrir Projecto");
	
				int escolha = sc.nextInt();
				operacao = escolha;
				
			//Aceitar candidatura
			case 1:
	
			}*/

	}

}
