package business.model;



public interface FabricaModel {

	
	Conversa criarConversa(String id);

    
    Viagem criarViagem(String idViagem,String localPartida,String localDestino,String horarioSaida,
			String quantidadedeVagas);
    
    Usuario criarUsuario(String login, String senha,String nome, String comprovante);
    
    Motorista criarMotorista(String login, String senha, String nome,String comprovante,
			String numCarteira, String modelo,String placa,String cor);
	
    Passageiro criarPassagerio(String login, String senha, String comprovante, String nome);
	
	
	
	
	
	
}
