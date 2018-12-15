package jeuEpique2;

public class CharacterBasicAttack implements BasicAttack{

	@Override
	public void basicAttack(Character attacker, Character enemy) {
		System.out.println("Je ne peux pas me battre, je suis un simple Character...");
	}

}
