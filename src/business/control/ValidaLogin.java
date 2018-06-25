package business.control;

public class ValidaLogin {

    protected static void validaLogin(String login) throws LoginException {
        if (login.trim().isEmpty()) {
            throw new LoginException("O campo login n�o pode ficar em branco!");
        } else if (login.length() > 20) {
            throw new LoginException("O login n�o pode ter mais de 20 caracteres!");
        } else if (login.matches(".*\\d.*")) {
            throw new LoginException("O login n�o pode conter numeros");
        } else if(ManterUsuario.usuarios.containsKey(login)){
            throw new LoginException("O login inserido j� existe");
        }
    }

    
}
