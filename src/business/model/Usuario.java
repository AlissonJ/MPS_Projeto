package business.model;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String login;
    private String senha;
    private String nome;
    private String comprovanteVinculo;

    public Usuario(String login, String senha,String nome, String comprovante) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.comprovanteVinculo = comprovante;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", senha=" + senha + '}';
    }

	public String getComprovanteVinculo() {
		return comprovanteVinculo;
	}

	public void setComprovanteVinculo(String comprovanteVinculo) {
		this.comprovanteVinculo = comprovanteVinculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
