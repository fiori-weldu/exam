/**
 This is a placeholder file. Copy TeamTest.java from Assignment 3 and overwrite this file.
 Change its package statement to match the current package (cs520.hw4).
 */

package cs520.hw4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamTest {

	public static Player createPlayer( String number, String name, String position, String year) {

		// Convert number argument from string to integer
		int uniformNumber = Integer.parseInt(number);

		
		Player player = new Player(name);
		player.setName(name); 
		
		player.setNumber(uniformNumber);
		player.setPosition(position);
		player.setYear(year);

	
		

		return player;
	}

	public static void main(String[] args) {
		ArrayList<Player> players=new ArrayList<Player>();
	
		Scanner scanner = null;

		try {
			File file = new File("team.txt");
			scanner = new Scanner(file);
		
			while(scanner.hasNextLine()) {
				String number = scanner.nextLine();
				String name = scanner.nextLine();
				String position = scanner.nextLine();
				String year = scanner.nextLine();
               Player player= createPlayer(number,name, position, year);
               players.add(player);
				// Go to the next line in order to ignore the fifth line "----"
				scanner.nextLine();
				
				
			}
			

			
			String[] opponents = new String[] {"BC", "Northeastern", "Harvard",
					"MIT", "UMass"};
			for(int i=0; i<opponents.length;i++) {
				Game game= new Game();
				game.set_teamName("Boston University");
				game.set_opponentName(opponents[i]);
				game.setDate(2,3,2021);
				game.setPlayers(players);
				game.simulateGame();
				System.out.println("\n");
			}


		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("Sorry, but an error has occurred. Check and re-run the program.");
		} finally {
			
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}

