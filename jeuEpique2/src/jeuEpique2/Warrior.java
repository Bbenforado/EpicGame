package jeuEpique2;

public class Warrior extends Character{
	
	//**************BUILDERS******************
	public Warrior() {
		this.basicAttack = new CoupEpee();
		this.specialAttack = new CoupDeRage();
	}
	public Warrior(int lvl, int life, int strength, int agil, int intel, String name) {
		super();
	}

	
	//**************METHODES***********************

	
}
