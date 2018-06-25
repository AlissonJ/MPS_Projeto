package business.model;

import java.io.Serializable;

public class Viagem implements Serializable {

	private int idViagem;
	private String localPartida;
	private String LocalDestino;
	private String horarioSaida;
	private String quantidadeVagas;
	
	public int getIdViagem() {
		return idViagem;
	}
	public void setIdViagem(int idViagem) {
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
