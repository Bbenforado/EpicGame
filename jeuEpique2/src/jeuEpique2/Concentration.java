package jeuEpique2;

public class Concentration implements SpecialAttack{

	@Override // set attackers agility to attacker s agility + attacker s level/2
	public void specialAttack(Character attacker, Character enemy) {
		attacker.setAgility(attacker.getAgility() + (attacker.getLevel()/2));
		System.out.println(attacker.getName() + " se concentre! Son niveau d'agilité augmente!! il passe à " + attacker.getAgility());
	}

}
