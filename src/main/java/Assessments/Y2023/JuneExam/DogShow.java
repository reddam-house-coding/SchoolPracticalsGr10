/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.JuneExam;

import javax.swing.*;

//Q2.1   1 mark
public class DogShow {

    //Q2.2   2 marks
    public static String currentOwnerName;
    
    //Q5.1   2 marks
    public static int hiDogAge = 0;
    public static String hiDogAgeOwner;

    public static void main(String[] args) {
        //Q5.2.   1 marks
        int maxCompetitionWins = 0;
        String maxOwnerName = "";
        
        //Q4.1    2 marks
        for (int ownerCount = 1; ownerCount <= 3; ownerCount++) {
            
            //Q4.2.1    1 mark
            currentOwnerName = JOptionPane.showInputDialog("Enter your name");
            
            //Q4.2.2    2  marks
            int competitionsWon = registerOwner();
            
            //Q5.2.   3 marks
            if (competitionsWon > maxCompetitionWins) {
                maxCompetitionWins = competitionsWon;
                maxOwnerName = currentOwnerName;
            }
        }

        //Q6.3.    1 marks
        System.out.println("Age of the oldest female dog competing: " + hiDogAge
                + "\nOwned by:" + hiDogAgeOwner
                + "\nCongratulations");

        //Q6.4.    1 marks
        System.out.println("The owner with the most titles is " + maxOwnerName + " with " + maxCompetitionWins + " wins.");
    }

    //Q2.3   2 marks
    public static int registerOwner() {

        //Q3.1    1 marks
        int totalCompetitionsWon = 0;

        //Q3.2    2 marks
        int numDogs = Integer.parseInt(JOptionPane.showInputDialog("How many dogs are you registering?"));

        //Q3.3    2 marks
        for (int i = 0; i < numDogs; i++) {
            
            //Q3.4.1   3 marks
            String dogName = JOptionPane.showInputDialog("Enter your dog's name");
            int dogAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your dog's age"));
            char dogGender = JOptionPane.showInputDialog("Enter your dog's gender. 'f' or 'm' only.").charAt(0);
            int competedBefore = Integer.parseInt(JOptionPane.showInputDialog("If " + dogName + " has competed before enter 1, otherwise enter 0."));
            
            //Q5.1.    4 marks
            if (dogAge > hiDogAge && dogGender == 'f') {
                hiDogAge = dogAge;
                hiDogAgeOwner = currentOwnerName;
            }

            
            //3.4.2    3 marks
            if (competedBefore == 1) {
                int competitionsWon = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of competitions s/he has won"));
                totalCompetitionsWon += competitionsWon;
            }

            //3.4.3   1   marks
            System.out.println("Dog Registered:\t" + dogName
                    + "\nDog Age:\t" + dogAge
                    + "\nDog Gender:\t" + dogGender);

        }

        //3.5    4 marks
        double competitionsWonAve = totalCompetitionsWon / (double) numDogs;
        competitionsWonAve = Math.round(competitionsWonAve * 10) / 10.0;

        //3.6    6 marks
        int prizeBonus = 0;
        if (totalCompetitionsWon >= 8 && totalCompetitionsWon <= 14) {
            prizeBonus = 200;
        }
        else if (totalCompetitionsWon >= 15 && totalCompetitionsWon <= 20) {
            prizeBonus = 300;
        } 
        else if (totalCompetitionsWon > 20) {
            prizeBonus = 400;
        }

        //3.7     //2 marks
        System.out.println("Owner Profile\n"
                + "Owner Name:\t" + currentOwnerName
                + "\nNumber of Dogs Registered:\t" + numDogs
                + "\nTotal Number of competitions won:\t" + totalCompetitionsWon
                + "\nAverage number of competitions won per dog:\t" + competitionsWonAve
                + "\nPrize Bonus Awarded:\tR" + prizeBonus);

        //3.8     //1 mark
        return totalCompetitionsWon;

    }

}
