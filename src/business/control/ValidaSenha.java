package business.control;

public class ValidaSenha {

	protected static void validaSenha(String senha) throws SenhaException {
        boolean correto;

        if (senha.trim().isEmpty()) {
            throw new SenhaException("O campo senha não pode ficar em branco");
        } else if (senha.length() < 8 || senha.length() > 12) {
            throw new SenhaException("A senha deve conter entre 8 e 12 caracteres");
        }

        correto = senha.matches(".*\\d.*.*\\d.*") && senha.matches(".*\\D.*");

        if (!correto) {
            throw new SenhaException("O campo senha deve conter letras e números, e ao menos 2 números");
        }
    }
	
	
}
