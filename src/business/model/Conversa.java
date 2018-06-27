package business.model;

import java.io.Serializable;

public class Conversa implements Serializable {

	private String idConversa;
	
	public Conversa() {
		
	}
	
	public Conversa(String idConversa) {
		this.idConversa = idConversa;
	}

	public String get_IdConversa() {
		return idConversa;
	}

	
	
	
	
	
	
}
