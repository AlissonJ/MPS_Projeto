package business.control;

public class ValidaLogin {

    protected static void validaLogin(String login) throws LoginException {
        if (login.trim().isEmpty()) {
            throw new LoginException("O campo login não pode ficar em branco!");
        } else if (login.length() > 20) {
            throw new LoginException("O login não pode ter mais de 20 caracteres!");
        } else if (login.matches(".*\\d.*")) {
            throw new LoginException("O login não pode conter numeros");
        } else if(ManterUsuario.usuarios.containsKey(login)){
            throw new LoginException("O login inserido já existe");
        }
    }

    
}
