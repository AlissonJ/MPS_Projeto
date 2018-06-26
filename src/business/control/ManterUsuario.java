package business.control;

import business.model.Usuario;
import infra.InfraException;
import infra.PersistenciaUsuarios;
import java.util.HashMap;
import business.control.SingletonManter;
import business.control.FachadaValidaCampos;;
public class ManterUsuario {

    //protected static HashMap<String, Usuario> usuarios = new HashMap<>();
   // FachadaValidaCampos fvalidaCampos = new FachadaValidaCampos();
    
    public static void adicionaUsuario(String login, String senha) throws LoginException, SenhaException, InfraException {
    	FachadaValidaCampos fvalidaCampos = new FachadaValidaCampos();
    	fvalidaCampos.validaLoginSenha(login, senha);
        Usuario u = new Usuario(login, senha);
        SingletonManter.getInstance().GetHashUsuario().put(login, u);
        try {
            PersistenciaUsuarios.salvaUsuarios(SingletonManter.getInstance().GetHashUsuario());
        } catch (InfraException ex) {
        	SingletonManter.getInstance().GetHashUsuario().remove(login);
            throw ex;
        }
    }

    public static void excluirUsuario(String login, String senha) throws LoginException, SenhaException, InfraException {
        Usuario tmp;
        Autenticacao.loginExistente(login);
        Autenticacao.comparaSenha(login, senha);
        tmp = SingletonManter.getInstance().GetHashUsuario().remove(login);
        try {
            PersistenciaUsuarios.salvaUsuarios(SingletonManter.getInstance().GetHashUsuario());
        } catch (InfraException e) {
        	SingletonManter.getInstance().GetHashUsuario().put(login, tmp);
            throw e;
        }
    }

    public static void logaUsuario(String login, String senha) throws SenhaException, LoginException {
        Autenticacao.loginExistente(login);
        Autenticacao.comparaSenha(login, senha);
    }

    public static void iniciaSistema() throws InfraException {
    	SingletonManter.getInstance().setHashUsuario(PersistenciaUsuarios.carregaUsuarios());
    }
}
