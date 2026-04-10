package Service;

public class SistemaLogin {

	private String login;
	private int senha;

	public SistemaLogin() {
		this.login = "Anthony";
		this.senha = 1234;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public String autenticar(int senhaDigitada) {
		if (senhaDigitada == senha) {
			return "Acesso Liberado!";
		} else {
			return "Senha Invalida, tente novamente.";
		}
	}
	
	public String toString() {
		return "Ola " + login + "! Bem vindo de volta.";
	}
}
