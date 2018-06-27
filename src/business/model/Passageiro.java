package business.model;

import business.model.Usuario;
public class Passageiro extends Usuario {
	private Usuario usuario;
	
	public Passageiro(String login, String senha, String comprovante, String nome) {
		usuario = new Usuario(login,senha,nome,comprovante);
		
	}
	
}
