package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */




public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	
	
	
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance
		GameService service = GameService.getInstance(); // replace null with ???
		
		
		GameService.getInstance();
		System.out.println("\nAbout to test initializing game data...");
		
		Game game1 = service.addGame("Game #1");
		System.out.print(game1);
		
		
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		
		
		Game game3 = service.addGame("Bob");
		System.out.println(game3);
		
		
		Game game4 = service.addGame("Bob");
		

		
		
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
		
		System.out.println("\n\n");
		
		
		
		System.out.println("Teams being created for first Game in GameService");
		System.out.println(service.getGame(0).addTeam("White Team"));
		System.out.println(service.getGame(0).addTeam("Black Team"));
		System.out.println(service.getGame(0).addTeam("Yellow Team"));
		
		
		
		System.out.println(service.getGame(0).addTeam("WHite Team"));
		
		
		
		
		System.out.println("\n\n");
		
		
		
		System.out.println("Adding players to different teams in the first Game in GameService");
		
		System.out.println(service.getGame(0).addTeam("White Team").addPlayer("Tenzing").toString());
		System.out.println(service.getGame(0).addTeam("Black Team").addPlayer("Sherpa").toString());
		System.out.println(service.getGame(0).addTeam("Yellow Team").addPlayer("Sam").toString());
		System.out.println(service.getGame(0).addTeam("White Team").addPlayer("Micheal").toString());
		System.out.println(service.getGame(0).addTeam("Yellow Team").addPlayer("Tenzing").toString());
		
		
		System.out.println(service.getGame(0).addTeam("White Team").addPlayer("Tenzing").toString());
	}
}
