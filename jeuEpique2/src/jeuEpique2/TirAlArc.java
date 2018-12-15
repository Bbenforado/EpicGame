package jeuEpique2;

public class TirAlArc implements BasicAttack{

	@Override // damages on the enemy equal to attacker agility
	public void basicAttack(Character attacker, Character enemy) {
		enemy.handleDamages(attacker.getAgility());
		System.out.println(attacker.getName() + " utilise Tir à l'arc!" + enemy.getName() + " n'a plus que " + enemy.getLife() + " pv!");
		
	}

}
