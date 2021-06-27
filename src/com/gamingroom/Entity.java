package com.gamingroom;
// Creating the base class as required per instructions
public class Entity {
	
	//The private 
	private long id;
	private String name;
	
	
	public Entity() {
		
	}
	
	
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
		
	}
	
	@Override 
	
	public String toString() {
		return "Entity [id=" + id + ",name= "+ name + "]";
	}

}
