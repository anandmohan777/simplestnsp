package com.tutorialspoint.struts2;

public class User {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	
	private String name;
	private String password;

	public String execute() {
		if (getName() != null && getName().equalsIgnoreCase("admin")
				&& getPassword() != null && getPassword().equals("admin")) {
			return "success";
		} else {
			return "error";
		}
	}

}