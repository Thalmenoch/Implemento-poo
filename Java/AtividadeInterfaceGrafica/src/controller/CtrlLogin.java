package controller;

import model.LoginBean;
import model.LoginDAO;

public class CtrlLogin {
	
	public static boolean login(LoginBean loginBean) {
		if (loginBean.getUser().isEmpty() || loginBean.getPassword().isEmpty()) {
			return false;
		}
		LoginDAO loginDAO = new LoginDAO();
		return loginDAO.autenticarUsuario(loginBean);
	}

}
