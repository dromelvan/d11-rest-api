package org.d11.rest.api.model;

public class PlayerNameDTO extends D11RestApiDTO {
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getName() {
		return (getFirstName() + " " + getLastName()).trim();
	}
	
	public String getShortName() {
		if(getFirstName().isEmpty()) {
			return getLastName();
		} else {
			return getLastName() + " " + getFirstName().charAt(0);
		}
	}
	
}
