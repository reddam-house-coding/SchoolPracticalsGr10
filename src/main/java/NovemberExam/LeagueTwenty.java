/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NovemberExam;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class LeagueTwenty {

	public static String currentPlayerName = "";
	public static double currentPlayerAverage = 0;
	public static int currentPlayerFifties = 0;

	public static void main(String[] args) {
		currentPlayerName = JOptionPane.showInputDialog("Enter in the current players name");

		int numPlayers = 0;

		double highestPlayerAverage = 0;
		String highestPlayerName = "";

		int totalMVPNominations = 0;
		String MVPNames = "";

		System.out.println("=========================");
		System.out.println("PLAYER STATS");
		System.out.println("=========================");

		while (!currentPlayerName.equalsIgnoreCase("XXX")) {

			System.out.println("NAME: " + currentPlayerName);

			generatePlayer();
			System.out.println("");
			System.out.println("");
			if (currentPlayerFifties >= 3) {
				totalMVPNominations++;
				MVPNames += currentPlayerName + " ";
			}
			if (currentPlayerAverage > highestPlayerAverage) {
				highestPlayerAverage = currentPlayerAverage;
				highestPlayerName = currentPlayerName;
			}

			numPlayers++;

			currentPlayerName = JOptionPane.showInputDialog("Enter in the current players name");

		}

		System.out.println("=========================");
		System.out.println("TEAM STATS");
		System.out.println("=========================");
		System.out.println("MVP COUNT : " + totalMVPNominations);
		System.out.println("MVP NAMES : " + MVPNames);
		System.out.println("MVP WINNER : " + highestPlayerName);
		System.out.println("MVP AVG: " + highestPlayerAverage);
	}

	public static void generatePlayer() {
		int totalScore = 0;
		currentPlayerFifties = 0;

		int playerExperience = (int) (Math.random() * 3) + 1;

		String playerExperienceStr = "";

		switch (playerExperience) {
			case 1:
				playerExperienceStr = "junior";
				break;
			case 2:
				playerExperienceStr = "senior";
				break;
			case 3:
				playerExperienceStr = "expert";
				break;
		}

		System.out.println("EXP: " + playerExperienceStr);

		System.out.println("CODE: " + getPlayerCode());

		for (int i = 0; i < 5; i++) {
			int score = (int) (Math.random() * (playerExperience * 50 + 1));
			totalScore += score;
			if (score > 50) {
				currentPlayerFifties++;
			}
		}

		currentPlayerAverage = totalScore / 5.0;

		System.out.println("AVG: " + currentPlayerAverage);

		System.out.println("NOM: " + (currentPlayerFifties >= 3));
	}

	public static String getPlayerCode() {
		String upperName = currentPlayerName.toUpperCase();
		return upperName.charAt(0) + "" + upperName.charAt(1) + "" + upperName.charAt(2) + "" + upperName.length();
	}
}
