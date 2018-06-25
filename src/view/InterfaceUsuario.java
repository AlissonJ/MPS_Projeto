package view;

import business.control.ManterUsuario;
import business.control.LoginException;
import business.control.SenhaException;
import infra.InfraException;

public class InterfaceUsuario {

    protected static String cadSistema(String login, String senha){
        try {
            ManterUsuario.adicionaUsuario(login, senha);
        } catch (LoginException | SenhaException | InfraException ex) {
            return ex.getMessage();
        }
        return "Cadastro efetuado!";
    }

    protected static String logaSistema(String login, String senha){
        try{
            ManterUsuario.logaUsuario(login, senha);
        }catch (LoginException | SenhaException ex){
            return ex.getMessage();
        }
        return "Usuário logado com sucesso";
    }

    protected static String deletaSistema(String login, String senha){
        try{
            ManterUsuario.excluirUsuario(login, senha);
        }catch (InfraException | LoginException | SenhaException ex){
            return ex.getMessage();
        }
        return "Usuário deletado do sistema";
    }
}
