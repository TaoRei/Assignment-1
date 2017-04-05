package OzlympicGame;

import java.util.ArrayList;
import java.util.List;

public class Ozlympic {
	
	//Put this method in game class.
	private List<Athletes> athlets = new ArrayList<Athletes>();
	//Define hashmap, <'Cycling': 1 , 'Sprint': 2, 'Swimming':3 > // 1 rep which game, 2 reps which game...
	
	public void initAthletes(){
		//Put this method in game class.
		athlets.add(new Sprinter("001", "Nathan", 23, "VIC", 0, 0));
		athlets.add(new Sprinter("002", "Victor", 23, "VIC", 0, 0));
		athlets.add(new SuperAthletes("003", "James", 23, "VIC", 0, 0, 1));

	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Ozlympic game ");
		System.out.println("==================================================== ");
		System.out.println("1. Select a game to run ");//step3
		System.out.println("2. Predict the winner of the game" );
		System.out.println("3. Start the game ");
		System.out.println("4. Display all final results of all game ");
		System.out.println("5. Display the points of all athletes ");
		System.out.println("6. Exit");
		System.out.println("Enter an option(please enter a number from 1 to 6): ");

	}

}
