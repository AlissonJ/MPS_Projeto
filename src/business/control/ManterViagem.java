package business.control;


import business.model.Viagem;
import infra.InfraException;
import infra.PersistenciaViagens;
import business.control.SingletonManter;

public class ManterViagem {
	
   

	
	public static void CadastrarViagem(String id,String localP, String localD,String horario,String qnt)
	throws InfraException {
    	
        Viagem v = new Viagem(id, localP, localD, horario, qnt);
        SingletonManter.getInstance().GetHashViagem().put(id, v);
        try {
            PersistenciaViagens.salvaViagens(SingletonManter.getInstance().GetHashViagem());
        } catch (InfraException ex) {
        	SingletonManter.getInstance().GetHashViagem().remove(id);
            throw ex;
        }
    }

    public static void excluirViagem(String id) throws  InfraException {
        Viagem tmp;
        
        tmp = SingletonManter.getInstance().GetHashViagem().remove(id);
        try {
            PersistenciaViagens.salvaViagens(SingletonManter.getInstance().GetHashViagem());
        } catch (InfraException e) {
        	SingletonManter.getInstance().GetHashViagem().put(id, tmp);
            throw e;
        }
    }


}
