/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.Term1.Practical;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class AverageMark {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("How many tests?"));
        double sum = 0;

        for (int i = 0; i < num; i++) {

            double testMark = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            sum += testMark;

        }

        System.out.println("Avg:" + sum / num);

        
    }
}
