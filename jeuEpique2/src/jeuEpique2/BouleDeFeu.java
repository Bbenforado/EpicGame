package jeuEpique2;

public class BouleDeFeu implements BasicAttack{

	@Override //damages on the enemy equal to attacker intelligence
	public void basicAttack(Character attacker, Character enemy) {
			enemy.handleDamages(attacker.getIntelligence());
			System.out.println(attacker.getName() + " utilise Boule de feu et inflige " + attacker.getIntelligence() +
					" dégats sur " + enemy.getName() + " il n'a plus que " + enemy.getLife() + " pv!");
	}

}
