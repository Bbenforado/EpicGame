package jeuEpique2;

public class CoupDeRage implements SpecialAttack{

	@Override //damages on the enemy equal to attacker s strength *2
	public void specialAttack(Character attacker, Character enemy) {
		enemy.handleDamages(attacker.getStrength()*2);
		System.out.println(attacker.getName() + "utilise l'attaque spéciale Coup de rage! il enlève " + attacker.getStrength()*2 + " dégats à "
		+ enemy.getName() + ", qui n'a plus que " + enemy.getLife() + " pv!");
	}

}
