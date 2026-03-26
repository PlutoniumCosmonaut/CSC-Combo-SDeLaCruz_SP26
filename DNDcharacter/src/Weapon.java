
public class Weapon {
	String name;
	int damage;

	public Weapon(String name, int damage) {
		super();
		this.name = name;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public int getDamage() {
		return damage;
	}

	@Override
	public String toString() {
		return "Weapon:" + name + "\ndamage" + damage;
	}

}
