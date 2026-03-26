import java.util.Random;

public class person {
	private int health;
	private int strength;
	private String name;
	private Weapon weapon;

	public person() {
		this.health = 0;
		this.strength = 0;
		this.name = "";
		this.weapon = null;
	}

	public person(int health, int strength, String name, String wName, int wDamage) {
		super();
		this.health = health;
		this.strength = strength;
		this.name = name;
		weapon = new Weapon(wName, wDamage);
	}

	public int hit(person victim) {
		Random rand = new Random();
		int damage = (this.strength + this.weapon.getDamage()) * rand.nextInt(10000);
		victim.health -= damage;
		return damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setWeapon(String name, int damage) {
		this.weapon = new Weapon(name, damage);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person:" + name + "\nHealth:" + health + "\nStrength:" + strength;
	}

}
