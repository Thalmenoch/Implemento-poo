package model;

public class LoginBean {
	
	private String user;
	private String password;
	
	public LoginBean(String usuario, String password) {
		this.user = usuario;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof LoginBean) {
			LoginBean loginBean = (LoginBean) object;
			if (loginBean.getUser().equals(user) && loginBean.getPassword().equals(password)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
