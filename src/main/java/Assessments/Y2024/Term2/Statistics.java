/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2024.Term2;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Statistics {
    public static void main(String[] args) {
        //accept positive numbers only
        int highest = 0;
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number."));
            sum += num;
            
            if(num > highest){
                highest = num;
            }
        }
        
        System.out.println("High: " + highest);
        System.out.println("Avg: " + sum/5);
    }
}
