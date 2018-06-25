package business.control;

import static business.control.ManterUsuario.usuarios;
import business.model.Usuarios;

public class Autenticacao {
    protected static void loginExistente(String login) throws LoginException{
        if(!usuarios.containsKey(login)){
            throw new LoginException("O login inserido nao existe");
        }
    }

    protected static void comparaSenha(String login, String senha) throws SenhaException{
        Usuarios u = usuarios.get(login);
        if(!u.getSenha().equals(senha)){
            throw new SenhaException("A senha inserida esta incorreta");
        }
    }
}
