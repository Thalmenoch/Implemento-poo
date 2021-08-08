package model;

public class LoginDAO {

	private LoginBean[] logins = {
		new LoginBean("fulano", "ful35"),
		new LoginBean("beltrano", "tran40"),
		new LoginBean("admin", "sal1000")
	};
	
	
	public boolean autenticarUsuario(LoginBean loginBean) {
		for(LoginBean login : logins) {
			if (loginBean.equals(login)) {
				return true;
			}
		}
		return false;
	}

}
