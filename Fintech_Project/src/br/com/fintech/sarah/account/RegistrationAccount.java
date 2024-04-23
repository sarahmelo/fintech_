package br.com.fintech.sarah.account;

public class RegistrationAccount {
	protected String token;
	
	public RegistrationAccount() {
		//
	}
	
	protected void isValidEmail(String email) { };
	
	protected void isValidPassword(String password) { };
	
	protected void registrateAccount(
			String email,
			String password
	) { };

	protected String getToken() {
		return token;
	}

	protected void setToken(String token) {
		this.token = token;
	}
}
