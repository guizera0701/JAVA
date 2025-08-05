package banco;

import java.util.Scanner;

public class MenuBancario {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double saldo = 0;
			int opcao;

			do{
				
				System.out.println("\n=== Simulador de atendimento bancario ===");
				System.out.println("1 - ver saldo");
				System.out.println("2 - fazer deposito");
				System.out.println("3 - realizar saque");
				System.out.println("4 - sair");
				System.out.println("escolha uma opcao: ");
				opcao = scanner.nextInt();
				
				switch (opcao){
				case 1:
					System.out.printf("seu saldo atual e: R$ %.2f%n", saldo);
					break;
					
				case 2:
					System.out.println("digite o valor para deposito: R$ "); 
					double deposito = scanner.nextDouble();
					if (deposito > 0) {
						System.out.printf ("deposito realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
					} else {
						System.out.println("valor invalido para deposito.");
					}
					break;
					
				case 3:
					System.out.println("digite o valor para saque: R$");
					double saque = scanner.nextDouble();
					 if (saque > 0 && saque <= saldo) {
			             saldo -= saque;
			             System.out.printf("Saque realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
			         } else {
			             System.out.println("Saque inválido. Verifique o valor e seu saldo.");
			         }
			         break;

			     case 4:
			         System.out.println("Encerrando o sistema. Obrigado por utilizar nosso atendimento!");
			         break;

			     default:
			         System.out.println("Opção inválida. Tente novamente.");
			 }

    } while (opcao != 4);
		}
 }
}

