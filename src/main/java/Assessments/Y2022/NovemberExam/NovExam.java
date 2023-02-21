/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2022.NovemberExam;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class NovExam {
    
    public static double highestAve = 0;
    public static char highestInitial;
    public static String meritList = "Merits";
    
    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog("Would you like to enter another student?");
        
        int count = 0;
        double classTotal = 0;
        
        while(option.equalsIgnoreCase("yes")){
            double currentStudentAve = oneStudentMarks();
            classTotal += currentStudentAve;
            
            count++;
            
            option = JOptionPane.showInputDialog("Would you like to enter another student?");
        }
        
        double classAverage = classTotal/count;
        
        System.out.println("");
        System.out.println("Highest Average: " + highestAve);
        System.out.println("Class Average: " + classAverage);
        System.out.println("Num Students: " + count);
        System.out.println("Student " + highestInitial + " has an average of " + highestAve + "% "
                + "which is " + (highestAve - classAverage) + "% higher than the class average." );
        
        System.out.println("");
        System.out.println(meritList);
    }
    
    public static char getRandomInitial(){
        int num = (int) (Math.random()*(75-65) + 65);
        return (char)(num);
    }
    
    public static double oneStudentMarks(){
        char initial = getRandomInitial();
        System.out.println("Student " + initial);
        
        double markTotal = 0;
        
        for (int i = 0; i < 4; i++) {
            double mark = Double.parseDouble(JOptionPane.showInputDialog("Enter mark"));
            System.out.print(mark + "\t");
            markTotal+=mark;
        }
        System.out.println("");
        
        double aveMark = markTotal/4;
        aveMark = Math.round(aveMark*10)/10;
        
        System.out.println("Average mark: " + aveMark + "%");
        
        String result;
        if(aveMark < 40){
            result = "Not achieved";
        }
        else if(aveMark < 80){
            result = "Pass";
        }
        else{
            result = "Distinction";
            
            meritList += "\n" + "Student " + initial;
        }
        
        System.out.println("Result: " + result);
        System.out.println("");
        
        if(aveMark > highestAve){
            highestAve = aveMark;
            highestInitial = initial;
        }
        
        return aveMark;
    }
}
