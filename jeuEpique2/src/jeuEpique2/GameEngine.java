package jeuEpique2;

public class GameEngine {

	public static void attackTour(Character attacker, Character enemy) throws Exception {
		Boolean isFinish = false;
		int userInput;
		do {
			
			userInput = Helpers.askInt(attacker.getName() + ", veuillez choisir votre action:\n1: Attaque Basique\n2: Attaque Speciale");
			if (userInput == 1) {
				attacker.attackBasic(attacker, enemy);
				isFinish = true;
			} else if(userInput == 2) {
				attacker.attackSpecial(attacker, enemy);
				isFinish = true;
			} else {
				System.out.println("Vous n'avez pas entré de choix correct, veuillez recommencer.");
			}
		} while(userInput != 1 && !isFinish || userInput != 2 && !isFinish);
	}
}
