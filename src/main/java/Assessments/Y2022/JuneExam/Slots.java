/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.JuneExam;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Slots {

	public static double totalMoneyWon = 0;

	public static void main(String[] args) {
		int highestScore = 0;
		int highestSpin = 0; //***

		int numPlays = Integer.parseInt(JOptionPane.showInputDialog("How many plays?"));

		for (int i = 1; i <= numPlays; i++) {
			System.out.println("SPIN: " + i); //***
			int score = onePlay();
			if (score > highestScore) {
				highestScore = score;
				highestSpin = i; //***
			}
		}

		double averagePlayMoney = totalMoneyWon / numPlays;

		double roundedAverage = Math.round(averagePlayMoney * 10) / 10;

		System.out.println("~Summary of session~");
		System.out.println("Highest number of points in one play: " + highestScore + " for spin " + highestSpin);
		System.out.println("Average prize money earned: R" + roundedAverage);
		System.out.println("Total prize money won: R" + totalMoneyWon);

	}

	public static int onePlay() {
		int onePlayScore = 0;

		for (int i = 0; i < 3; i++) {
			int singleScore = (int) (Math.random() * 26 + 65);
			onePlayScore += singleScore;
			System.out.print("" + (char) singleScore + " ");
		}
		System.out.println("");

		int moneyWon = 0;

		if (onePlayScore <= 210 && onePlayScore >= 201) {
			moneyWon = 5;
		} else if (onePlayScore <= 240 && onePlayScore >= 211) {
			moneyWon = 10;
		} else if (onePlayScore <= 270 && onePlayScore >= 241) {
			moneyWon = 20;
		}

		totalMoneyWon += moneyWon;

		System.out.println("~Summary of play~");
		System.out.println("Points won in play: " + onePlayScore);
		System.out.println("Money won in play: R" + moneyWon);
		System.out.println("");

		return onePlayScore;
	}
}
