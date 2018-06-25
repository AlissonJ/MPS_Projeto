package business.control;

import java.util.HashMap;

import business.model.Conversa;
import infra.InfraException;
import infra.PersistenciaConversas;

public class ManterConversa {

    protected static HashMap<String, Conversa> conversas = new HashMap<>();
    
    
    
    
    
    public static void excluirConversa(String idConversa) throws InfraException {
        Conversa tmp;
        tmp = conversas.remove(idConversa);
        try {
            PersistenciaConversas.salvaConversas(conversas);
        } catch (InfraException e) {
            conversas.put(idConversa,tmp);
            throw e;
        }
    }













}
