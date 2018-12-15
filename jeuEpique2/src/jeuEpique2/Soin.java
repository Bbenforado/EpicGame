package jeuEpique2;

public class Soin implements SpecialAttack{


	@Override // add to his life his intelligence *2, can t have more life than at the beginning
	public void specialAttack(Character attacker, Character enemy) {
		attacker.setLife(attacker.getLife() + (attacker.getIntelligence()*2));
		if (attacker.getLife() > attacker.getWizardLife()) {
			attacker.setLife(attacker.getWizardLife());
			System.out.println(attacker.getName() + " ne peut pas avoir plus de vie qu'il n'en avait au début, il a " + attacker.getLife());
		}
		System.out.println(attacker.getName() + " utilise Soin!! Sa vie se restaure... Il a désormais " + attacker.getLife() + " pv!");
	}

}
