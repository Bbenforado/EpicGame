package jeuEpique2;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("**Bienvenue dans Magie World!!**");

		//********************CHARACTERS CREATION************************************
		//create character1
		System.out.println("Création du personnage 1:");
		Character character1 = Helpers.getNewCharacter();	
		System.out.println(character1.toString());
	
		//create character2
		System.out.println("Création du personnage 2:");
		Character character2 = Helpers.getNewCharacter();
		System.out.println(character2.toString());

		//***********************LOOP ATTACK TOUR************************************
		do {
			GameEngine.attackTour(character1, character2);
			if(character1.getLife() > 0 && character2.getLife() > 0) {
				GameEngine.attackTour(character2, character1);
			} else {
				System.out.println("La partie est terminée!");
				if(character1.getLife() == 0) {
					System.out.println(character2.getName() + " a gagné!");
				} else {
					System.out.println(character1.getName() + " a gagné!");
				}
			}
		} while (character1.getLife() > 0 && character2.getLife() > 0);
}

}
