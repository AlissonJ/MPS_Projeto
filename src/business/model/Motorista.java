package business.model;

import business.model.Usuario;

public class Motorista extends Usuario {
	
	private Usuario usuario = new Usuario;
	private String NumeroCarteiraMotorista;
	private String ModeloCarro;
	private String PlacaCarro;
	private String CorCarro;
	
	
	public Motorista(String login, String senha, String nome,String comprovante,
			String numCarteira, String modelo,String placa,String cor) {
		usuario = new Usuario(login,senha,nome,comprovante);
		this.NumeroCarteiraMotorista = numCarteira;
		this.ModeloCarro = modelo;
	    this.PlacaCarro = placa;
		this.CorCarro = cor;
		
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
