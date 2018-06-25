package infra;

import business.model.Viagem;
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

public class PersistenciaViagens implements Serializable {

    private static FileOutputStream writeViagens;
    private static FileInputStream readViagens;

    private static ObjectInputStream readObj;
    private static ObjectOutputStream writeObj;

    public static HashMap<String, Viagem> carregaViagens() throws InfraException {
        HashMap<String, Viagem> v;
        try {
            readViagens = new FileInputStream("viagens.dat");
            readObj = new ObjectInputStream(readViagens);
            v = (HashMap<String, Viagem>) readObj.readObject();
            readViagens.close();
            readObj.close();
            return v;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersistenciaViagens.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Não foi possivel iniciar o sistema\nTente novamente mais tarde");
        } catch (IOException |ClassNotFoundException ex) {
            Logger.getLogger(PersistenciaViagens.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Não foi possivel  iniciar o sistema\nTente novamente mais tarde");
        }
    }

    public static void salvaViagens(HashMap<String, Viagem> v) throws InfraException {
        try{
            writeViagens = new FileOutputStream("viagens.dat");
            writeObj = new ObjectOutputStream(writeViagens);
            writeObj.writeObject(v);
            writeViagens.close();
            writeObj.close();
        }catch (FileNotFoundException ex){
            Logger.getLogger(PersistenciaViagens.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Nao foi possivel completar o cadastro\nTente novamente mais tarde");
        }catch (IOException ex){
            Logger.getLogger(PersistenciaViagens.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Nao foi possivel completar o cadastro\nTente novamente mais tarde");
        }
    }
}
