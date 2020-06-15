package org.d11.rest.api.model;

public class UserDTO extends D11RestApiDTO {

	private String username;
	private String name;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
