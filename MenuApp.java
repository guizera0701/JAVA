package app; 

import java.util.Scanner; 

public class MenuApp { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);

        MenuService MenuService = new MenuService();


        int opcao;

        do {
            System.out.println("==== MENU ====");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
   
            opcao = scanner.nextInt();
            
            scanner.nextLine();

         
            switch (opcao) {
 
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    MenuService.cadastrarUsuario(nome);
                    break;
                case 2:
                    MenuService.listarUsuarios();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println();
        } while (opcao != 3);

        scanner.close();

    }
}