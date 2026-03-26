
public class driver {

	public static void main(String[] args) {
		person hero = new person();
		hero.setHealth(100);
		hero.setStrength(25);
		hero.setName("Ryu");
		hero.setWeapon("Hadouken", 15);
		System.out.println(hero);

		person villain = new person(100, 35, "Akuma", "Gohadoken", 10);
		System.out.println(villain);

		while (hero.getHealth() > 0 && villain.getHealth() > 0) {
			int hDamage = 0;
			int vDamage = 0;
			if (hero.getHealth() > 0) {
				hDamage = hero.hit(villain);
				System.out.println(hero.getName() + " hits " + villain.getName() + " for " + hDamage + " points");
			}
			if (villain.getHealth() > 0) {
				vDamage = villain.hit(hero);
				System.out.println(villain.getName() + " hits " + hero.getName() + " for " + vDamage + " points");
			}
		}
		if (hero.getHealth() > 0)
			System.out.println(hero.getName() + " wins");
		else
			System.out.println(villain.getName() + " wins");

	}

}
