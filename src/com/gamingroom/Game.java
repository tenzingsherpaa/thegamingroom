package com.gamingroom;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */




public class Game extends Entity {
	
	
	
	//Holds existing teams
	private static List<Team> teams = new ArrayList<Team>();
	

	
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}

	
	
	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	/**
	 * @return the id
	 */
	
	
	
	public Team addTeam(String name) {
		
		
		
		
		Team team = null;
		//local player
		Iterator<Team> teamIterator = teams.iterator();
		
		while(teamIterator.hasNext()) {
			team = teamIterator.next();
			if(team.getName().equals(name)) {
				break;
			}
			
		team = null;
		}
		
		
		if(team == null) {
			team = new Team(teams.size()+1,name);
			teams.add(team);
		}
		
		
		return team;
	
	}
	
	
	@Override
	public String toString() {
		return "Game [id=" + this.getId() + ", name=" + this.getName() + "]";
	}
}
	
