package de.hsb.app.smarkt.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class LoginHandler implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	public LoginHandler(Login loginBean, String loginE) {
//		super();
//		this.loginBean = loginBean;
//		this.loginE = loginE;
//	}
	private String username; 
	public LoginHandler(String username) {
		super();
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getWelcomeMessage() {
	      return "Hello " + username;
	}
}
