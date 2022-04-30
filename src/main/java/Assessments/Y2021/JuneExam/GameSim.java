/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2021.JuneExam;

/**
 *
 * @author Cliftonb
 */
public class GameSim {

	public static void main(String[] args) {

		int numWins = 0;
		int highestAttackDamage = 0;
		int highestLevel = 0;

		for (int level = 1; level <= 10; level++) {

			System.out.println("LEVEL " + level);

			//boss health setup
			int levelMultiplier = (int) (Math.random() * 3) + 1;
			int bossHealth = 50 + level * 10 * levelMultiplier;
			System.out.println("BOSS TOTAL HEALTH: " + bossHealth);

			int totalAttackDamage = 0;

			for (int attack = 1; attack <= 4; attack++) {
				int attackType = (int) (Math.random() * 5) + 1;
				String attackDescription = "";
				int attackDamage = 0;
				if (attackType == 1) {
					attackDamage = 0;
					attackDescription = "MISS";
				} else if (attackType == 2 || attackType == 3 || attackType == 4) {
					attackDamage = attackType * 15;
					attackDescription = "NORMAL";
				} else {
					attackDamage = bossHealth / 2;
					attackDescription = "CRITICAL";
				}

				totalAttackDamage = totalAttackDamage + attackDamage;

				System.out.println("ATTACK: " + attack + "\tATTACK TYPE: " + attackDescription + "\tATTACK DAMAGE: " + attackDamage);

			}
			System.out.println("TOTAL ATTACK DAMAGE: " + totalAttackDamage);

			if (totalAttackDamage > highestAttackDamage) {
				highestAttackDamage = totalAttackDamage;
				highestLevel = level;
			}

			if (totalAttackDamage > bossHealth) {
				bossHealth = 0;
			} else {
				bossHealth = bossHealth - totalAttackDamage;
			}
			System.out.println("BOSS HEALTH REMAINING: " + bossHealth);

			if (bossHealth == 0) {
				System.out.println("BOSS DEFEATED!");
				numWins++;
			} else {
				System.out.println("LEVEL LOST");
			}
			System.out.println("");
			System.out.println("");
		}

		System.out.println("HIGHEST ATTACK DAMAGE WAS " + highestAttackDamage + " ON LEVEL " + highestLevel);
		System.out.println("YOU WON " + numWins + " OUT OF 10 LEVELS");
		if (numWins > 7) {
			System.out.println("YOU WIN THE GAME!");
		} else {
			System.out.println("YOU LOSE THE GAME!");
		}
	}
}
