package jeuEpique2;

public class CharacterSpecialAttack implements SpecialAttack{

	@Override
	public void specialAttack(Character character, Character enemy) {
		System.out.println("Je ne peux pas me battre, je suis un simple Character...");
	}

}
