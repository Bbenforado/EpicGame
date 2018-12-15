package jeuEpique2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helpers {
	
	static Scanner scan = new Scanner(System.in);


	
	//asks for an int and return it
	public static int askInt(String sentence) throws Exception {
		Boolean isInteger;
		do {
			System.out.println(sentence);

			try {
				int saisie = scan.nextInt();
				scan.nextLine();
				return saisie;
			} catch (InputMismatchException e) {
				System.out.println("Il faut rentrer un nombre entier. Recommencez.");
				isInteger = false;		
				scan.nextLine();
			}
		} while (!isInteger);
		
		throw new Exception ("Saisie échouée.");
	}
	
	
	
	
	//asks for a string and return it
	public static String askString(String sentence) {
		System.out.println(sentence);
		return scan.next();
		}
	//init a character and return the character
	public static Character getNewCharacter() throws Exception {
		Character character = new Character();
		Boolean isFinish = false;
		Boolean isWizard = false;
		int typeCharacter;
		do {
				typeCharacter = Helpers.askInt("Veuillez choisir la classe de votre personnage:\n1: Guerrier, 2: Rôdeur, 3: Mage");
				switch (typeCharacter) {
					case 1:
						System.out.println("Vous avez choisi un guerrier.");
						character = new Warrior();
						isFinish = true;
						break;
					case 2:
						System.out.println("Vous avez choisi un rôdeur.");
						character = new Rodeur();
						isFinish = true;
						break;
					case 3:
						System.out.println("Vous avez choisi un mage.");
						character = new Wizard();
						isFinish = true;
						isWizard = true;
						break;
					default:
							System.out.println("Vous n'avez pas rentré un choix correct. Veuillez recommencer:");
				} 
			
		
		} while (!isFinish);
		
		character.setName(Helpers.askString("Veuillez entrer le nom de votre personnage:"));
		character.setLevel(Helpers.askInt("Veuillez entrer le niveau de votre personnage (min 1, max 100):"));
		character.setLife(character.getLevel()*5);
		if(isWizard) {
			character.setWizardLife(character.getLife());
		}
		do {
			System.out.println("**Attention, vous allez choisir la force, l'agilité et l'intelligence de votre personnage, le total force + agilité + intelligence ne peut pas être supérieur au niveau du personnage. Réfléchissez bien à ce qui peut être important pour votre perso!**");
			character.setStrength(Helpers.askInt("Veuillez entrer la force de votre personnage (min 0, max 100):"));
			character.setAgility(Helpers.askInt("Veuillez entrer le niveau d'agilité de votre personnage (min 0, max 100):"));
			character.setIntelligence(Helpers.askInt("Veuillez entrer le niveau d'intelligence de votre personnage (min 0, max 100):"));
			if (character.getStrength()+character.getAgility()+character.getIntelligence() > character.getLevel()) {
				System.out.println("Le total de force, agilité et intelligence est supérieur au niveau de votre personnage. Veuillez recommencer.");
			}
		} while (character.getStrength()+character.getAgility()+character.getIntelligence() > character.getLevel());
		return character;
	}
}
