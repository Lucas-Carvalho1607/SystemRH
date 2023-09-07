package Classe;

import java.util.Scanner;

public class Menu {

   public Menu (){
   
        String opcao;
		Scanner digite = new Scanner(System.in);

		System.out.println("Escolha sua opção: " + "\nGerente" + "\nSupervisor" + "\nAtendente");
		opcao = digite.nextLine();
        

		do {if (opcao.equalsIgnoreCase("Gerente")) {
				System.out.println("\n" +Gerente.informacoesGerente());
					break;
			} else if (opcao.equalsIgnoreCase("Supervisor")) {
				System.out.println("\n" + Supervisor.informacoesSupervisor());
					break;
			} else if (opcao.equalsIgnoreCase("Atendente")) {
				System.out.println("\n" + Atendente.informacoesAtendente());
				break;
			}else {
				System.out.println("\nEsta opção não existe\n");
			}
			System.out.println("Escolha sua opção: " + "\nGerente" + "\nSupervisor" + "\nAtendente");
			opcao = digite.nextLine();
		}
		while (!opcao.equalsIgnoreCase("Gerente") ||
				!opcao.equalsIgnoreCase("Supervisor") ||
				!opcao.equalsIgnoreCase("Atendente"));

    }
}
    

    
