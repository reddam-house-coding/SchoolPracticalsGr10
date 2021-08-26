/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author Cliftonb
 */
public class JuneExam {

	public static void main(String[] args) {
		int highestAttackDamage = 0;
		int highestAttackLevel = 0;
		int levelsWon = 0;

		for (int currentLevel = 1; currentLevel <= 10; currentLevel++) {
			System.out.println("\n\nLEVEL: " + currentLevel);

			int bossTotalHealth = getBossHealth(currentLevel);
			System.out.println("BOSS TOTAL HEALTH: " + bossTotalHealth);

			int damageToBoss = getMutlipleAttackDamage(bossTotalHealth, 4);
			if (damageToBoss > bossTotalHealth) {
				bossTotalHealth = 0;
			} else {
				bossTotalHealth -= damageToBoss;
			}

			System.out.println("BOSS HEALTH REMAINING: " + bossTotalHealth);

			if (bossTotalHealth == 0) {
				System.out.println("BOSS DEFEATED!");
				levelsWon++;
			} else {
				System.out.println("LEVEL LOST");
			}

			if (damageToBoss > highestAttackDamage) {
				highestAttackDamage = damageToBoss;
				highestAttackLevel = currentLevel;
			}
		}

		System.out.println("\n\nHIGHEST ATTACK DAMAGE WAS " + highestAttackDamage + " ON LEVEL " + highestAttackLevel);
		System.out.println("YOU WON " + levelsWon + " OUT OF 10 LEVELS");

		if (levelsWon > 7) {
			System.out.println("YOU WON THE GAME!");
		} else {
			System.out.println("YOU LOSE THE GAME!");
		}
	}

	public static int getBossHealth(int currentLevel) {
		int levelMultiplier = (int) (Math.random() * 3) + 1;
		int health = 50 + currentLevel * 10 * levelMultiplier;
		return health;
	}

	public static int getMutlipleAttackDamage(int bossMaxHealth, int numAttacks) {
		int totalDamage = 0;
		for (int attackNum = 1; attackNum <= numAttacks; attackNum++) {
			int numGenerated = (int) (Math.random() * 5) + 1;

			int attackDamage = getAttackDamage(numGenerated, bossMaxHealth);
			String attackName = getAttackTypeString(numGenerated);

			System.out.println("ATTACK: " + attackNum + "\tATTACK TYPE: " + attackName + "\tATTACK DAMAGE: " + attackDamage);

			totalDamage += attackDamage;

		}
		System.out.println("TOTAL ATTACK DAMAGE: " + totalDamage);

		return totalDamage;
	}

	public static int getAttackDamage(int attackType, int bossMaxHealth) {
		int attackDamage = 0;
		if (attackType > 1 && attackType <= 4) {
			attackDamage = 15 * attackType;
		}
		if (attackType == 5) {
			attackDamage = bossMaxHealth / 2;
		}
		return attackDamage;
	}

	public static String getAttackTypeString(int attackType) {
		switch (attackType) {
			case 1:
				return "MISS";
			case 2:
			case 3:
			case 4:
				return "NORMAL";
			case 5:
				return "CRITICAL";
			default:
				return null;

		}
	}

}
