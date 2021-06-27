package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */




public class Team extends Entity{
	
	
	
	
	private static List<Player> players = new ArrayList<Player>();
	
	
	
	private Team() {
		
	}
	
	
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	public Player addPlayer(String name) {
		
		Player player = null;
		
		
		Iterator<Player> playerIterator = players.iterator();
		
		
		while(playerIterator.hasNext()) {
			player = playerIterator.next();
			if(player.getName().equals(name)) {
				break;
			}
			
			
			player = null;
		
		}
		
		
		if(player == null) {
			player = new Player(players.size()+1,name);
			players.add(player);
		}
		
		return player;
	
	}
	
	
	@Override
	public String toString() {
		return "Team [id=" + this.getId() + ", name=" + this.getName() + "]";
	}
}
	
	
	
	
	
	
	