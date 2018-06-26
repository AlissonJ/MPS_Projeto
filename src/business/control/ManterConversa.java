package business.control;

import java.util.HashMap;
import business.control.SingletonManter;
import business.model.Conversa;
import infra.InfraException;
import infra.PersistenciaConversas;

public class ManterConversa {

     
    
   
    
    
    public static void excluirConversa(String idConversa) throws InfraException {
        Conversa tmp;
        tmp = SingletonManter.getInstance().GetHashConversa().remove(idConversa);
        try {
            PersistenciaConversas.salvaConversas(SingletonManter.getInstance().GetHashConversa());
        } catch (InfraException e) {
        	SingletonManter.getInstance().GetHashConversa().put(idConversa,tmp);
            throw e;
        }
    }













}
