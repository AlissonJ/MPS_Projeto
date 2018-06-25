package infra;

import business.model.Conversa;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenciaConversas implements Serializable {

    private static FileOutputStream writeConversas;
    private static FileInputStream readConversas;

    private static ObjectInputStream readObj;
    private static ObjectOutputStream writeObj;

    public static HashMap<String, Conversa> carregaConversas() throws InfraException {
        HashMap<String, Conversa> c;
        try {
            readConversas = new FileInputStream("conversas.dat");
            readObj = new ObjectInputStream(readConversas);
            c = (HashMap<String, Conversa>) readObj.readObject();
            readConversas.close();
            readObj.close();
            return c;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersistenciaConversas.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Não foi possivel iniciar o sistema\nTente novamente mais tarde");
        } catch (IOException |ClassNotFoundException ex) {
            Logger.getLogger(PersistenciaConversas.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Não foi possivel  iniciar o sistema\nTente novamente mais tarde");
        }
    }

    public static void salvaConversas(HashMap<String, Conversa> c) throws InfraException {
        try{
            writeConversas = new FileOutputStream("conversas.dat");
            writeObj = new ObjectOutputStream(writeConversas);
            writeObj.writeObject(c);
            writeConversas.close();
            writeObj.close();
        }catch (FileNotFoundException ex){
            Logger.getLogger(PersistenciaConversas.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Nao foi possivel completar o cadastro\nTente novamente mais tarde");
        }catch (IOException ex){
            Logger.getLogger(PersistenciaConversas.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Nao foi possivel completar o cadastro\nTente novamente mais tarde");
        }
    }
}
