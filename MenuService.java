package app;

import java.util.ArrayList;
import java.util.List;

public class MenuService {

	private static List<String> usuarios;
	
	public MenuService() {
		usuarios = new ArrayList<String>();
	}
	
	public static void cadastrarUsuario(String nome) {
		if(nome == null || nome.trim().isEmpty()) {
			System.out.println("nome invalido! nao foi possivel cadrastar.");
			return;
		}
		usuarios.add(nome);
		System.out.println("usuario'" + nome + "' cadrastado com sucesso!");
	}
	
	public static void listarUsuarios() {
	    if (usuarios.isEmpty()) {
	        System.out.println("Nenhum usuário cadastrado.");
	    } else {
	        System.out.println("Lista de usuários:");
	        for (int i = 0; i < usuarios.size(); i++) {
	            System.out.println((i + 1) + ". " + usuarios.get(i));
	        }
	    }
	}
}