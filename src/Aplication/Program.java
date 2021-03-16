package Aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Cria��o de um Menu
		Scanner sc = new Scanner(System.in);
		int opc = 1;
		while(opc != 3) {
			opc = criarMenu(sc);
			if(opc == 1) {
				//consultar(sc, agenda);
			}else if(opc == 2){
				
			}else if(opc == 3){
				System.out.println("Voc� saiu do Sistema!");
				System.exit(0);
			}
		}
		
		
		sc.close();

	}
	public static int criarMenu(Scanner sc) {
		int opcao = 3;
		boolean valida = false;
		while(!valida) {
			
			System.out.println("*--------------------*");
			System.out.println("|   Menu de Op��es   |");
			System.out.println("|---------------------");
			System.out.println("| 1 - Incluir        |");
			System.out.println("| 2 - Consultar      |");
			System.out.println("| 3 - Sair           |");
			System.out.println("*--------------------*");
			System.out.print("Escolha op��o: ");
			try {
				String entrada = sc.nextLine();
				opcao = Integer.parseInt(entrada);
				if(opcao == 1 || opcao == 2 || opcao == 3) {
					valida = true;
				}else {
					throw new Exception("Entrada Inv�lida.");
				}
			}
			catch(Exception e) {
				System.out.println("Entrada Inv�lida, digite novamente.\n");
			}	
		}
		return opcao;
		
	}
}
