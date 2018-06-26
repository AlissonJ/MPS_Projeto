package business.control;

import java.util.HashMap;

import business.model.Conversa;
import business.model.Usuario;
import business.model.Viagem;
import infra.PersistenciaUsuarios;

public class SingletonManter {
	
	private final HashMap<String, Conversa> conversas = new HashMap<>();
	private  HashMap<String, Usuario> usuarios = new HashMap<>();
	private final HashMap<String, Viagem> viagens = new HashMap<>();
	
	private static SingletonManter instancia;
	
	private SingletonManter() {
		
	}
	
	public HashMap<String,Usuario> GetHashUsuario() {
		return usuarios;
	}
	public void setHashUsuario(HashMap<String,Usuario> u) {
		this.usuarios = u;
	}
	
	public HashMap<String, Conversa> GetHashConversa() {
		return conversas;
	}
	public HashMap<String, Viagem> GetHashViagem() {
		return viagens;
	}
	
	
	public static synchronized SingletonManter getInstance() {
		if(instancia == null) {
			instancia = new SingletonManter();
		}
		return instancia;
	}
	
	
	
	
	
	
}
