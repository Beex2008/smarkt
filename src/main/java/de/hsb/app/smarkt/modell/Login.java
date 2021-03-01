package de.hsb.app.smarkt.modell;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Login implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String username;

	public Login(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String checkBean() {
		if (username.equals("admin")) {
			System.out.println("chandan");
			return "success";
		} else {
			return "fail";
		}
	}

}
