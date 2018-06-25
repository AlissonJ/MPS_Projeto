package business.model;

public class Motorista extends Usuarios {
	
	private String NumeroCarteiraMotorista;
	private String ModeloCarro;
	private String PlacaCarro;
	private String CorCarro;
	
	
	public Motorista(String login, String senha) {
		super(login, senha);
		
	}


	public String getNumeroCarteiraMotorista() {
		return NumeroCarteiraMotorista;
	}


	public void setNumeroCarteiraMotorista(String numeroCarteiraMotorista) {
		NumeroCarteiraMotorista = numeroCarteiraMotorista;
	}


	public String getModeloCarro() {
		return ModeloCarro;
	}


	public void setModeloCarro(String modeloCarro) {
		ModeloCarro = modeloCarro;
	}


	public String getCorCarro() {
		return CorCarro;
	}


	public void setCorCarro(String corCarro) {
		CorCarro = corCarro;
	}


	public String getPlacaCarro() {
		return PlacaCarro;
	}


	public void setPlacaCarro(String placaCarro) {
		PlacaCarro = placaCarro;
	}
	

}
