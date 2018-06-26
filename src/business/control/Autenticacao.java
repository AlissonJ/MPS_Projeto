package business.control;

import business.control.SingletonManter;
import business.model.Usuario;

public class Autenticacao {
    protected static void loginExistente(String login) throws LoginException{
        if(!SingletonManter.getInstance().GetHashUsuario().containsKey(login)){
            throw new LoginException("O login inserido nao existe");
        }
    }

    protected static void comparaSenha(String login, String senha) throws SenhaException{
        Usuario u = SingletonManter.getInstance().GetHashUsuario().get(login);
        if(!u.getSenha().equals(senha)){
            throw new SenhaException("A senha inserida esta incorreta");
        }
    }
}
