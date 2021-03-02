package de.hsb.app.smarkt.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.bean.ManagedBean;

import de.hsb.app.smarkt.modell.Login;

@ApplicationScoped
@FacesConfig(version = FacesConfig.Version.JSF_2_3) // CDI Aktivieren
@ManagedBean
public class Einloggen {
	private Login loginBean;
	private String loginE;
	
	public void einloggen() {
		System.out.println("Welcome U");
	}

	public Login getLoginBean() {
		if(loginBean != null) {
	         setLoginE(loginBean.getUsername());
	      }  
		return loginBean;
	}

	public void setLoginBean(Login loginBean) {
		this.loginBean = loginBean;
	}

	public String getLoginE() {
		return loginE;
	}

	public void setLoginE(String loginE) {
		this.loginE = loginE;
	}
	
	
}
