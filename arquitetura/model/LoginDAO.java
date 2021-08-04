package arquitetura.model;

public class LoginDAO {
	
	public boolean authenticateUser(LoginBean loginBean) throws Exception {
		String user = loginBean.getUser();
		String password = loginBean.getPassword();
		// Realizar conexão com o banco de dados
		// Validar usuário e senha
		// Retornar true em caso de sucesso
		// Retornar false em caso de insucesso
		// Propagar exception em caso de exceção com banco de dados
		return false;
	}

}
