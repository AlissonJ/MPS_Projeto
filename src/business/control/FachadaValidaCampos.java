package business.control;


import business.control.LoginException;
import business.control.SenhaException;
import business.control.ValidaLogin;
import business.control.ValidaSenha;

public class FachadaValidaCampos {

	protected ValidaLogin vlogin;
    protected ValidaSenha vsenha;
    
    public FachadaValidaCampos(){
        vlogin = new ValidaLogin();
        vsenha = new ValidaSenha();
    }
    
    public void validaLoginSenha(String nome, String senha) throws LoginException, SenhaException{
        vlogin.validaLogin(nome);
        vsenha.validaSenha(senha);
    }
	
	
	
	
	
	
	
}
