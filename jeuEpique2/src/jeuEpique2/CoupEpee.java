package jeuEpique2;

public class CoupEpee implements BasicAttack {

	@Override // damages on the enemy equal to attacker s strength 
	public void basicAttack(Character attacker, Character enemy) {
		enemy.handleDamages(attacker.getStrength());
		System.out.println(attacker.getName() + " utilise Coup d'�p�e! Il inflige " + attacker.getStrength() + " d�gats � " + enemy.getName() + "! "
		+ "La vie de " + enemy.getName() + " est de " + enemy.getLife() + " pv!");
	}


}
