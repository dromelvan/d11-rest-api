package org.d11.rest.api.model;

public enum Status {

	PENDING(0, "Pending"),
	ACTIVE(1, "Active"),
	FINISHED(2, "Finished"),
	FULL_TIME(3, "Full Time");
	
	private int id;
	private String name;
	
	private Status(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public static Status withId(int id) {
		switch(id) {
			case 0: return Status.PENDING;
			case 1: return Status.ACTIVE;
			case 2: return Status.FINISHED;
			case 3: return Status.FULL_TIME;
			default: return null;
		}
	} 
	
}
