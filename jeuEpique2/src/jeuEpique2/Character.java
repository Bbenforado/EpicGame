package jeuEpique2;

public class Character {
	
	//******************DECLARATIONS VARIABLES********************
	private int level;
	private int life;
	private int strength;
	private int agility;
	private int intelligence;
	private String name;
	private int wizardLife;
	BasicAttack basicAttack = new CharacterBasicAttack();
	SpecialAttack specialAttack = new CharacterSpecialAttack();


	
	//*******************BUILDERS***************************
	public Character() {
		
	}
	
	public Character(int lvl, int life, int strength, int agil, int intel, String name, BasicAttack basicAttack, SpecialAttack specialAttack) {
		this.level = lvl;
		this.life = life;
		this.strength = strength;
		this.agility = agil;
		this.intelligence = intel;
		this.name = name;
		this.basicAttack = basicAttack;
		this.specialAttack = specialAttack;
	}
	
	
	//*********************METHODES******************************
	public String toString() {
		return this.name + " est de type " + this.getClass() + ", il est de niveau " + this.getLevel() + ", a " + this.getLife() + " pv, " + this.getStrength() + " points de force, "
				+ this.getAgility() + " en agilité et " + this.getIntelligence() + " en intelligence.";
	}
	
	//******GETTERS**********
	public int getLevel() {
		return this.level;
	}
	public int getLife() {
		return this.life;
	}
	public int getStrength() {
		return this.strength;
	}
	public int getAgility() {
		return this.agility;
	}
	public int getIntelligence() {
		return this.intelligence;
	}
	public String getName() {
		return this.name;
	}
	public int getWizardLife() {
		return this.wizardLife;
	}
	
	//******SETTERS***********
	public void setLevel(int level) {
		this.level = level;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public void setIntelligence(int intel) {
		this.intelligence = intel;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWizardLife(int life) {
		this.wizardLife = life;
		
	}
	
	
	//***********ATTACK*****************************************
	public void attackBasic(Character attacker, Character enemy) {
		basicAttack.basicAttack(attacker, enemy);
	}
	
	public void attackSpecial(Character attacker, Character enemy) {
		specialAttack.specialAttack(attacker, enemy);
	}

	
	//handle damages, set damages to 0 if they are negatives.
	public void handleDamages(int damages) {
		this.life -= damages;
		if(this.life < 0) {
			this.life  = 0;
		}
	}


}
