package business.model;

import java.io.Serializable;

public class Viagem implements Serializable {

	private String idViagem;
	private String localPartida;
	private String LocalDestino;
	private String horarioSaida;
	private String quantidadeVagas;
	
	public Viagem(String idViagem,String localPartida,String localDestino,String horarioSaida,
			String quantidadedeVagas) {
		this.idViagem = idViagem;
		this.localPartida = localPartida;
		this.LocalDestino = localDestino;
		this.horarioSaida = horarioSaida;
		this.quantidadeVagas = quantidadedeVagas;
		
	}
	public String getIdViagem() {
		return idViagem;
	}
	public void setIdViagem(String idViagem) {
		this.idViagem = idViagem;
	}
	public String getLocalPartida() {
		return localPartida;
	}
	public void setLocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}
	public String getLocalDestino() {
		return LocalDestino;
	}
	public void setLocalDestino(String localDestino) {
		LocalDestino = localDestino;
	}
	public String getHorarioSaida() {
		return horarioSaida;
	}
	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	public String getQuantidadeVagas() {
		return quantidadeVagas;
	}
	public void setQuantidadeVagas(String quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}
	
	
	
}
