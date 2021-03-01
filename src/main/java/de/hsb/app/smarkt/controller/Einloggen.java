package de.hsb.app.smarkt.controller;

import javax.inject.Named;

import de.hsb.app.smarkt.modell.Login;

//@ManagedBean
@Named
public class Einloggen {
	private Login loginBean;
	private String loginE;
	
	public void einloggen() {
		System.out.println("Welcome U");
	}

	public Login getLoginBean() {
		if(loginBean != null) {
	         loginE = loginBean.getUsername();
	      }  
		return loginBean;
	}

	public void setLoginBean(Login loginBean) {
		this.loginBean = loginBean;
	}
	
	
}
