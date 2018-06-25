package business.control;

import business.model.Usuarios;
import infra.InfraException;
import infra.PersistenciaUsuarios;
import java.util.HashMap;
import business.control.FachadaValidaCampos;;
public class ManterUsuario {

    protected static HashMap<String, Usuarios> usuarios = new HashMap<>();
    FachadaValidaCampos fvalidaCampos = new FachadaValidaCampos();
    
    public static void adicionaUsuario(String login, String senha) throws LoginException, SenhaException, InfraException {
    	FachadaValidaCampos fvalidaCampos = new FachadaValidaCampos();
    	fvalidaCampos.validaLoginSenha(login, senha);
        Usuarios u = new Usuarios(login, senha);
        usuarios.put(login, u);
        try {
            PersistenciaUsuarios.salvaUsuarios(usuarios);
        } catch (InfraException ex) {
            usuarios.remove(login);
            throw ex;
        }
    }

    public static void excluirUsuario(String login, String senha) throws LoginException, SenhaException, InfraException {
        Usuarios tmp;
        Autenticacao.loginExistente(login);
        Autenticacao.comparaSenha(login, senha);
        tmp = usuarios.remove(login);
        try {
            PersistenciaUsuarios.salvaUsuarios(usuarios);
        } catch (InfraException e) {
            usuarios.put(login, tmp);
            throw e;
        }
    }

    public static void logaUsuario(String login, String senha) throws SenhaException, LoginException {
        Autenticacao.loginExistente(login);
        Autenticacao.comparaSenha(login, senha);
    }

    public static void iniciaSistema() throws InfraException {
        usuarios = PersistenciaUsuarios.carregaUsuarios();
    }
}
