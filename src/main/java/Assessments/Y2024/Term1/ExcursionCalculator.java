/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2024.Term1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class ExcursionCalculator {
    public static void main(String[] args) {
        String numNightsStr = JOptionPane.showInputDialog("How many nights?");
        int numNights = Integer.parseInt(numNightsStr);
        String numStudentsStr = JOptionPane.showInputDialog("How many students?");
        int numStudents = Integer.parseInt(numStudentsStr);
        String numTeachersStr = JOptionPane.showInputDialog("How many teachers?");
        int numTeachers = Integer.parseInt(numTeachersStr);
        
        
        int total = 8500 + numNights*numStudents*350 + numNights*numTeachers*450;
        
        System.out.println("Total cost for " + numNights + " is: R" + total);
    }
}
