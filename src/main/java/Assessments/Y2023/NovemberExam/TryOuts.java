/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.NovemberExam;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class TryOuts {


    public static void main(String[] args) {
        
        double scoreAvHi = 0;
        String scoreAvHiName = "";
        int scoreAvHiCount = 0;
        
        int recruitCounter = 0;
        
        String name = JOptionPane.showInputDialog("Enter a recruit name, XXX to stop");
        
        while(!name.equals("XXX")){
            recruitCounter++;
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter their weight"));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter their height"));
            double recruitScore = oneRecruit(name, weight, height);
            
            if(recruitScore > scoreAvHi){
                scoreAvHi = recruitScore;
                scoreAvHiName = name;
                scoreAvHiCount = recruitCounter; 
            }
            
            name = JOptionPane.showInputDialog("Enter a recruit name, XXX to stop");
        }
        
        System.out.println("Top Recruit was recruit number " + scoreAvHiCount+", " + scoreAvHiName + ", with an average of " + scoreAvHi);
    }

    public static double oneRecruit(String name, double weight, double height) {
        double scoreSum = 0;

        System.out.println("Name: " + name);
        for (int i = 1; i <= 3; i++) {
            int ran = (int) (Math.random() * 11);

            double score = (height * ran) / weight;
            
            scoreSum += score;

            System.out.println("Score for Round " + i + ": " + score);
        }

        double average = scoreSum / 3;
        average *= 10;
        average = (int) average;
        average /= 10;

        System.out.println("Round Score Average: " + average +"\n");
        
        return average;

    }
}
