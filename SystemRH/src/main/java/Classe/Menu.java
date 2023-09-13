package Classe;
import Abstrata.Funcionario;
import java.util.Scanner;

import Abstrata.Pessoa;

public class Menu {

   public Menu (){
   
        String opcao;
		Scanner digite = new Scanner(System.in);

		System.out.println("Escolha sua opção: " + "\n1. Gerente" + "\n2. Supervisor" + "\n3. Atendente");
		opcao = digite.nextLine();
        

		do {
			if ((opcao == "1")){
				System.out.println("\n" +Gerente.informacoesGerente(lucas));
					break;
			} else if (opcao == "2"){
				System.out.println("\n" + Supervisor.informacoesSupervisor());
					break;
			} else if (opcao == "3") {
				System.out.println("\n" + Atendente.informacoesAtendente());
				break;
			}else {
				System.out.println("\nEsta opção não existe\n");
			}
			System.out.println("Escolha sua opção: " + "\n1. Gerente" + "\n2. Supervisor" + "\n3. Atendente");
			opcao = digite.nextLine();
		}
		while (opcao !="1" ||
				opcao !="2" ||
				opcao != "3");

    }
}
    

    
